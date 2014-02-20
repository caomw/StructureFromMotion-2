import org.opencv.core.*;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 22/01/2014
 * Time: 08:41
 * To change this template use File | Settings | File Templates.
 */

class DetectFaceDemo {
    public void run() {
        URI img1Uri = null;
        URI img2Uri = null;
        try {
            img1Uri = getClass().getResource("/i1.JPG").toURI();
            img2Uri = getClass().getResource("/i2.JPG").toURI();
        }catch (Exception e){

        }
        Mat img1 = Highgui.imread(new File(img1Uri).getAbsolutePath());
        Mat img2 = Highgui.imread(new File(img2Uri).getAbsolutePath());
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

        String filename = "faceDetection.png";
        System.out.println(String.format("Writing %s", filename));

        Mat img_matches = new Mat();
        Features2d.drawMatches(img1, keyPoints1, img2, keyPoints2, matches, img_matches);
        Highgui.imwrite(filename, img_matches);
        /*System.out.println("\nRunning DetectFaceDemo");

        //-> for mac
        CascadeClassifier faceDetector = new CascadeClassifier(getClass().getResource("/lbpcascade_frontalface.xml").getPath());
        Mat image = Highgui.imread(getClass().getResource("/lena.png").getPath());
        //<- for mac

        //-> for windows
        try {
            URI xmlUri = getClass().getResource("/lbpcascade_frontalface.xml").toURI();
            faceDetector =
                    new CascadeClassifier(new File(xmlUri).getAbsolutePath());
            URI imageUri = getClass().getResource("/lena.png").toURI();
            image = Highgui.imread(new File(imageUri).getAbsolutePath());
        } catch (URISyntaxException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        //<- for windows

        // Detect faces in the image.
        // MatOfRect is a special container class for Rect.
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(image, faceDetections);

        System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));

        // Draw a bounding box around each face.
        for (Rect rect : faceDetections.toArray()) {
            Core.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
        }

        // Save the visualized detection.
        String filename = "faceDetection.png";
        System.out.println(String.format("Writing %s", filename));
        Highgui.imwrite(filename, image);*/
    }
}

public class JavaCVTest {
    public static void main(String[] args) throws Exception {
        String osName = System.getProperty("os.name");
        System.out.println( osName );

        String libopencv_java = "";
        if( osName.equalsIgnoreCase("Windows 7") ){

            libopencv_java  = "D:\\School\\Diplomova_praca\\Intellij\\SFM\\workspace\\StructureFromMotion\\src\\main\\lib\\opencv-2.4.8\\build\\bin\\x64\\opencv_java248.dll";

        }else if( osName.equalsIgnoreCase("Mac OS X") ){

            libopencv_java  = "/Users/lukasmartinovic/Downloads/opencv-2.4.8/build/lib/libopencv_java248.dylib";

        }
        System.load( libopencv_java );

        /*Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
        System.out.println("OpenCV Mat: " + m);

        Mat mr1 = m.row(1);
        mr1.setTo(new Scalar(1));
        Mat mc5 = m.col(5);
        mc5.setTo(new Scalar(5));
        System.out.println("OpenCV Mat data:\n" + m.dump()); */


        // Priklad 2 image face detect
        new DetectFaceDemo().run();
    }

}