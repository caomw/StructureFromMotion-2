package sk.lmh.structure_from_motion.restlet.endpoint.model;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.ObjectRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.restlet.model.ModelBase;
import sk.lmh.structure_from_motion.restlet.model.User;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class image extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
    }

    @Get
    public Representation getImage() {

        byte[] data = new byte[0]; //new byte[(int) file.length()];
        try {
            data = readFile("/Users/lukasmartinovic/Desktop/grid20@2x.png");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        ObjectRepresentation<byte[]> or=new ObjectRepresentation<byte[]>(data, MediaType.IMAGE_PNG) {
            @Override
            public void write(OutputStream os) throws IOException {
                super.write(os);
                os.write(this.getObject());
            }
        };

        return or;
    }

    @Post
    public Representation postRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = form.getFirstValue("userUUID");

        User user = new User();
        user.userUUID = userUUID;

        ModelBase newModel = new ModelBase();
        newModel.modelUUID = UUID.randomUUID().toString().replaceAll("-", "") + "_" + System.currentTimeMillis();
        newModel.user = user;

        // call save
        // ...

        return new JacksonRepresentation<ModelBase>( newModel );
    }

    @Delete
    public Representation deleteRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation( null );
    }

    @Put
    public Representation putRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation( null );
    }


    public static byte[] readFile(String file) throws IOException {
        return readFile(new File(file));
    }

    public static byte[] readFile(File file) throws IOException {
        // Open file
        RandomAccessFile f = new RandomAccessFile(file, "r");
        try {
            // Get and check length
            long longlength = f.length();
            int length = (int) longlength;
            if (length != longlength)
                throw new IOException("File size >= 2 GB");
            // Read file and return data
            byte[] data = new byte[length];
            f.readFully(data);
            return data;
        } finally {
            f.close();
        }
    }

}
