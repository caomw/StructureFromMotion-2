/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 22/01/2014
 * Time: 08:41
 * To change this template use File | Settings | File Templates.
 */

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

        //start Face detection test
        new FaceDetectionMethod().run();

        //start Feature matching test
        new FeatureMatchingMethod().run();

        //start Optical flow test
        new OpticalFlowMethod().run();
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