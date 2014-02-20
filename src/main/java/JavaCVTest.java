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

        String filename = "faceDetection.png";
        System.out.println(String.format("Writing %s", filename));

        Mat img_matches = new Mat();
        Features2d.drawMatches(img1, keyPoints1, img2, keyPoints2, matches, img_matches);
        Highgui.imwrite(filename, img_matches);

        //1. undistort image
        //Imgproc.initUndistortRectifyMap();

        //2. acquire features
        //http://developer.sonymobile.com/knowledge-base/tutorials/android_tutorial/get-started-with-opencv-on-android/
    }

    /*
    public void run() {
        System.out.println("\nRunning DetectFaceDemo");

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
        Highgui.imwrite(filename, image);
    }
    */

    /*
    public void run() {
        Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
        System.out.println("OpenCV Mat: " + m);

        Mat mr1 = m.row(1);
        mr1.setTo(new Scalar(1));
        Mat mc5 = m.col(5);
        mc5.setTo(new Scalar(5));
        System.out.println("OpenCV Mat data:\n" + m.dump());
    }
    */
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

        new DetectFaceDemo().run();
    }

    //doc
    //http://docs.opencv.org/2.4.4-beta/index.html

    //source
    //http://enl.usc.edu/enl/trunk/aqua/OpenCV-2.3.1/src/org/opencv/features2d/Features2d.java

    //postup
    //http://opencv-users.1802565.n2.nabble.com/Structure-from-motion-Sequence-of-steps-td5955623.html

    // java
    //https://github.com/imranakthar/Android-OpenCV-FaceDetectionwithEyes/blob/master/OpenCV-Android-FaceDetect-Eye/SDK/java/src/org/opencv/features2d/Features2d.java


    //http://docs.opencv.org/java/2.4.2/index-all.html
    //http://docs.opencv.org/java/
    //http://opencv.org/opencv-java-api.html
    //http://docs.opencv.org/modules/imgproc/doc/geometric_transformations.html#void%20initUndistortRectifyMap%28InputArray%20cameraMatrix,%20InputArray%20distCoeffs,%20InputArray%20R,%20InputArray%20newCameraMatrix,%20Size%20size,%20int%20m1type,%20OutputArray%20map1,%20OutputArray%20map2%29


    /*

    1. Calibrate camera
    2. Extract local features
    3. Match features
    4. Undistort local feature points with intrinsic camera calibration data
    5. Find fundamental matrix based on undistorted feature points
    6. Get essential matrix from fundamental matrix
    7. Compute projection matrix from cam1 to cam2
    8. Triangulate




    i. calibrate camera

    1. undistort image
    2. acquire features
    3. match features
    4. estimate fundamental matrix
    5. calculate essential matrix
    6. calculate R and t
    7. bundle adjustment (i.e., estimation of 3D points and/or cameras based on
            minimization of reprojection errors across all images and points)
    */

}