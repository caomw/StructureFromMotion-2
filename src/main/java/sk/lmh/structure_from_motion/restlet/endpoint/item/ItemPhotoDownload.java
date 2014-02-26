package sk.lmh.structure_from_motion.restlet.endpoint.item;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.ObjectRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.util.IOUtil;

import java.io.IOException;
import java.io.OutputStream;


/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
public class ItemPhotoDownload extends ServerResource {

    private String userUUID = null;
    private String modelUUID = null;
    private String imageOrder = null;
    private String imageType = null;

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);

        this.userUUID = (String) getRequestAttributes().get("userUUID");
        this.modelUUID = (String) getRequestAttributes().get("modelUUID");
        this.imageOrder = (String) getRequestAttributes().get("imageOrder");
        this.imageType = (String) getRequestAttributes().get("imageType");
    }

    @Get
    public Representation getRepresentation(Representation entity) throws Exception {

        if( (this.userUUID != null) && (this.modelUUID != null) && (this.imageOrder != null) && (this.imageType != null) )
        {
            String saveImagePath = "/Users/lukasmartinovic/Desktop/" + this.userUUID + "/" + this.modelUUID;
            String imageName = this.userUUID + "_" + this.modelUUID + "_" + this.imageOrder + "." + this.imageType;
            String imagePath = saveImagePath + "/" + imageName;

            byte[] data = new byte[0]; //new byte[(int) file.length()];
            try {
                data = IOUtil.readFile(imagePath);
            } catch (IOException e) {
                e.printStackTrace();
                return new JacksonRepresentation( new String("false") );
            }

            MediaType type = MediaType.IMAGE_JPEG;
            if( this.imageType.equalsIgnoreCase("jpg") || this.imageType.equalsIgnoreCase("jpeg") ){

            }else if( this.imageType.equalsIgnoreCase("png") ){
                type = MediaType.IMAGE_PNG;
            }else if( this.imageType.equalsIgnoreCase("bmp") ){
                type = MediaType.IMAGE_BMP;
            }

            ObjectRepresentation<byte[]> imageObjectRepresentation = new ObjectRepresentation<byte[]>( data, type ) {
                @Override
                public void write(OutputStream os) throws IOException {
                    super.write(os);
                    os.write(this.getObject());
                }
            };
            return imageObjectRepresentation;

        }
        return new JacksonRepresentation( new String("false") );
    }

    @Post
    public Representation postRepresentation(Representation entity) throws Exception {


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
