import org.opencv.core.*;
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
}

public class JavaCVTest {
    public static void main(String[] args) throws Exception {

        String libopencv_java_win = "D:\\School\\Diplomova_praca\\Intellij\\SFM\\workspace\\StructureFromMotion\\src\\main\\lib\\opencv-2.4.8\\build\\bin\\x64\\opencv_java248.dll";
        String libopencv_java_mac = "/Users/lukasmartinovic/Downloads/opencv-2.4.8/build/lib/libopencv_java248.dylib";
        System.load(libopencv_java_win);
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
