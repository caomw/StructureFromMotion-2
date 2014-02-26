package sk.lmh.structure_from_motion.restlet.endpoint.item;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.util.IOUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 16:24
 * To change this template use File | Settings | File Templates.
 */
public class ItemPhotoUpload extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
    }

    @Get
    public Representation getRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = "test0";//form.getFirstValue("userUUID");
        String modelUUID = "test0";//form.getFirstValue("modelUUID");
        String order = "0";//form.getFirstValue("order");
        String imageData = ""; //form.getFirstValue("imageData");
        String imageType = "png";//form.getFirstValue("imageType");

        /* byte[] dataNew = new byte[0]; //new byte[(int) file.length()];
        try {
            dataNew = IOUtil.readFile("/Users/lukasmartinovic/Desktop/grid20@2x.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageData =  IOUtil.bytesToStringUTFNIO( dataNew ); */


        FileOutputStream stream = null;
        try {
            String saveImagePath = "/Users/lukasmartinovic/Desktop/" + userUUID + "/" + modelUUID;
            String imageName = userUUID + "_" + modelUUID + "_" + order + "." + imageType;
            String imagePath = saveImagePath + "/" + imageName;

            File dir = new File( saveImagePath );
            dir.mkdirs();

            byte[] data = IOUtil.stringToBytesUTFNIO( imageData );//IOUtil.stringToByteArray( imageData );
            InputStream in = new ByteArrayInputStream( data );
            BufferedImage bImageFromConvert = ImageIO.read(in);
            ImageIO.write(bImageFromConvert, imageType, new File(imagePath));
        }catch (Exception e){
            System.out.println( e.getMessage() );
            return new JacksonRepresentation( new String("false") );
        } finally {
            if(stream != null)
                stream.close();
        }

        return new JacksonRepresentation( new String("true") );
    }

    @Post
    public Representation postRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = "test0";//form.getFirstValue("userUUID");
        String modelUUID = "test0";//form.getFirstValue("modelUUID");
        String order = "0";//form.getFirstValue("order");
        String imageData = ""; //form.getFirstValue("imageData");
        String imageType = "png";//form.getFirstValue("imageType");

        /*byte[] dataNew = new byte[0]; //new byte[(int) file.length()];
        try {
            dataNew = IOUtil.readFile("/Users/lukasmartinovic/Desktop/grid20@2x.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageData =  IOUtil.bytesToStringUTFNIO( dataNew );  */


        FileOutputStream stream = null;
        try {
            String saveImagePath = "/Users/lukasmartinovic/Desktop/" + userUUID + "/" + modelUUID;
            String imageName = userUUID + "_" + modelUUID + "_" + order + "." + imageType;
            String imagePath = saveImagePath + "/" + imageName;

            File dir = new File( saveImagePath );
            dir.mkdirs();

            byte[] data = IOUtil.stringToBytesUTFNIO( imageData );//IOUtil.stringToByteArray( imageData );
            InputStream in = new ByteArrayInputStream( data );
            BufferedImage bImageFromConvert = ImageIO.read(in);
            ImageIO.write(bImageFromConvert, imageType, new File(imagePath));
        }catch (Exception e){
            return new JacksonRepresentation( new String("false") );
        } finally {
            if(stream != null)
                stream.close();
        }

        return new JacksonRepresentation( new String("true") );
    }

    @Delete
    public Representation deleteRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation( null );
    }

    @Put
    public Representation putRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation( null );
    }

}
