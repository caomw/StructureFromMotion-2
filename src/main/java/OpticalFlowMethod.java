import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
import org.opencv.video.Video;

import java.io.File;
import java.net.URI;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 20/02/2014
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class OpticalFlowMethod {

    private String[] imagePath = {"/PA110030.JPG","/PA110031.JPG","/PA110032.JPG","/PA110033.JPG"};
    private int lastPathIndex = 0;


    public void run() {

        Mat image_prev = null;
        Mat image_next = null;

        MatOfPoint features_prev = new MatOfPoint();
        MatOfPoint features_next = new MatOfPoint();

        image_next = getImage();
        image_prev = image_next.clone();
        image_next = getImage();

        // Obtain initial set of features
        /*Imgproc.goodFeaturesToTrack(image_next,
                                    features_next,
                                    1,
                                    0.01,
                                    0.5);
        */

        MatOfByte status = new MatOfByte();
        MatOfFloat err = new MatOfFloat();



        Mat flow = new Mat(); // backward flow
        Video.calcOpticalFlowFarneback(
                                        image_prev,
                                        image_next,
                                        flow,
                                        0.5,
                                        1,
                                        2,
                                        2,
                                        5,
                                        1.1,
                                        Video.OPTFLOW_USE_INITIAL_FLOW
        );




        Mat map = new Mat( flow.size(), CvType.CV_32FC2 );
        /*for (int y = 0; y < map.rows(); y++)
        {
            for (int x = 0; x < map.cols(); x++)
            {
                Point f = new Point( flow.get(y,x) );

                map.get(y, x) = new Mat( f.x+f.y );


            }
        } */

        Mat newFrame = new Mat();
        Imgproc.remap(
                image_next,
                newFrame,
                map,
                new Mat( ),
                Imgproc.INTER_AREA
        );

        /*System.out.println(); System.out.println();
        for ( int e = 0; e<newFrame.rows();e++){
            for ( int f = 0; f<newFrame.cols();f++){
                System.out.println( newFrame.get(e,f)[0]+"-"+ newFrame.get(e,f)[1] );
            }
        }*/
        //remap(image_prev, newFrame, map);



        /*for( int i = this.lastPathIndex ; i < this.imagePath.length ; i++)
        {
            Imgproc.goodFeaturesToTrack(image_next,
                                        features_next,
                                        5,
                                        0.01,
                                        0.5,
                                        new Mat(),
                                        10,
                                        false,
                                        0.25);

            if(i == 1){
                features_prev = features_next;
            }
            // Find position of feature in new image

            MatOfPoint2f features_prev_2f = new MatOfPoint2f( features_prev.toArray() );
            MatOfPoint2f features_next_2f = new MatOfPoint2f( features_next.toArray() );
            Video.calcOpticalFlowPyrLK(
                    image_prev,
                    image_next, // 2 consecutive images
                    features_prev_2f, // input point positions in first im
                    features_next_2f, // output point positions in the 2nd
                    status,    // tracking success
                    err      // tracking error
            );
            //features_prev = new MatOfPoint( features_prev_2f.toArray() );
            image_prev = image_next.clone();
            image_next = getImage();  // Get next image
            features_prev = features_next;
            features_next = new MatOfPoint( features_next_2f.toArray() );


            System.out.println( features_prev.rows() +"/"+ features_prev.cols() +"/"+ features_prev.get(0,0)[0]+"-"+ features_prev.get(0,0)[1] );
            System.out.println(); System.out.println();
            for ( int e = 0; e<features_next.rows();e++){
                for ( int f = 0; f<features_next.cols();f++){
                    System.out.println( features_next.get(e,f)[0]+"-"+ features_next.get(e,f)[1] );
                }
            }*/

            /*for ( int f = 0; f < features_next_2f.rows(); f++) {
            if (status.get(0,i) == 0.0 || error[i] > 0) {
                drawPixel(features_next_2f.row(i), &imgC, 2, red);
                continue;
            }
            drawPixel(cornersB[i], &imgC, 2, green);
            line(imgC, cornersA[i], cornersB[i], Scalar(255, 0, 0));
            } */
        //}

        /*String filename = "FeatureMatching.png";
        System.out.println(String.format("Writing %s", filename));

        Mat img_matches = new Mat();
        Features2d.drawKeypoints(img1, keyPoints1, img2, keyPoints2, matches, img_matches);
        Highgui.imwrite(filename, img_matches);  */

        //1. undistort image
        //Imgproc.initUndistortRectifyMap();

        //2. acquire features
        //http://developer.sonymobile.com/knowledge-base/tutorials/android_tutorial/get-started-with-opencv-on-android/
   }


   private Mat getImage(){
       URI imgUri = null;
       try {
           String currentImagePath = this.imagePath[ this.lastPathIndex ];
           imgUri = getClass().getResource( currentImagePath ).toURI();
           this.lastPathIndex++;
       }catch (Exception e){
       }

       return Highgui.imread(new File(imgUri).getAbsolutePath(), Highgui.CV_LOAD_IMAGE_GRAYSCALE);
   }




    /*

    cv::Mat image_prev, image_next;
std::vector<cv::Point> features_prev, features_next;

image_next = getImage();

// Obtain initial set of features
cv::goodFeaturesToTrack(image_next, // the image
  features_next,   // the output detected features
  max_count,  // the maximum number of features
  qlevel,     // quality level
  minDist     // min distance between two features
);

// Tracker is initialised and initial features are stored in features_next
// Now iterate through rest of images
for(;;)
{
    image_prev = image_next.clone();
    feature_prev = features_next;
    image_next = getImage();  // Get next image

    // Find position of feature in new image
    cv::calcOpticalFlowPyrLK(
      image_prev, image_next, // 2 consecutive images
      points_prev, // input point positions in first im
      points_next, // output point positions in the 2nd
      status,    // tracking success
      err      // tracking error
    );

    if ( stopTracking() ) break;
}

    */
}
