import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.highgui.Highgui;

import java.io.File;
import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 20/02/2014
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class FeatureMatchingMethod {

    public void run() {
        URI img1Uri = null;
        URI img2Uri = null;
        try {
            img1Uri = getClass().getResource("/i1.JPG").toURI();
            img2Uri = getClass().getResource("/i2.JPG").toURI();
        }catch (Exception e){

        }
        Mat img1 = Highgui.imread(new File(img1Uri).getAbsolutePath(),Highgui.CV_LOAD_IMAGE_GRAYSCALE);
        Mat img2 = Highgui.imread(new File(img2Uri).getAbsolutePath(),Highgui.CV_LOAD_IMAGE_GRAYSCALE);


        //Mat img1 = imread(argv[1], CV_LOAD_IMAGE_GRAYSCALE);
        //Mat img2 = imread(argv[2], CV_LOAD_IMAGE_GRAYSCALE);
        if(img1.empty() || img2.empty())
        {
            System.out.println("Can't read one of the images\n");
            //return -1;
        }

// detecting keypoints
        // detecting keypoints
        FeatureDetector detector = FeatureDetector.create(FeatureDetector.DYNAMIC_SURF);
        MatOfKeyPoint keyPoints1 = new MatOfKeyPoint();
        MatOfKeyPoint keyPoints2 = new MatOfKeyPoint();
        detector.detect(img1, keyPoints1);
        detector.detect(img2, keyPoints2);


// computing descriptors
        DescriptorExtractor extractor = DescriptorExtractor.create(DescriptorExtractor.SURF);
        Mat descriptors1 = new Mat();
        Mat descriptors2 = new Mat();
        extractor.compute(img1, keyPoints1, descriptors1);
        extractor.compute(img2, keyPoints2, descriptors2);

// matching descriptors
        DescriptorMatcher floatL2BruteForceMatcher = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE_L1);
        MatOfDMatch matches = new MatOfDMatch();
        floatL2BruteForceMatcher.match(descriptors1, descriptors2, matches);

// drawing the results

        String filename = "FeatureMatching.png";
        System.out.println(String.format("Writing %s", filename));

        Mat img_matches = new Mat();
        Features2d.drawMatches(img1, keyPoints1, img2, keyPoints2, matches, img_matches);
        Highgui.imwrite(filename, img_matches);

        //1. undistort image
        //Imgproc.initUndistortRectifyMap();

        //2. acquire features
        //http://developer.sonymobile.com/knowledge-base/tutorials/android_tutorial/get-started-with-opencv-on-android/
    }


}
