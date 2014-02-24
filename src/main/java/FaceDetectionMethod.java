import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 20/02/2014
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 */
public class FaceDetectionMethod {

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
        String filename = "FaceDetection.png";
        System.out.println(String.format("Writing %s", filename));
        Highgui.imwrite(filename, image);
    }

}
