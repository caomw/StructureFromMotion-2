import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 22/01/2014
 * Time: 08:41
 * To change this template use File | Settings | File Templates.
 */

class DetectFaceDemo {
    public void run() {
        System.out.println("\nRunning DetectFaceDemo");

        // Create a face detector from the cascade file in the resources
        // directory.
        CascadeClassifier faceDetector = new CascadeClassifier(getClass().getResource("/lbpcascade_frontalface.xml").getPath());
        Mat image = Highgui.imread(getClass().getResource("/jlo.jpg").getPath());

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
}

public class JavaCVTest {
    public static void main(String[] args) throws Exception {


        String libopencv_java = "/Users/lukasmartinovic/Downloads/opencv-2.4.8/build/lib/libopencv_java248.dylib";
        System.load(libopencv_java);
        //System.loadLibrary("opencv_java248");

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
