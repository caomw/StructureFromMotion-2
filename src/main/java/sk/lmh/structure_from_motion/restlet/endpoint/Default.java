package sk.lmh.structure_from_motion.restlet.endpoint;

import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:12
 * To change this template use File | Settings | File Templates.
 */
public class Default extends ServerResource {

    @Get
    public JacksonRepresentation getReq() throws Exception {
        String returnString = "default hello world - "+ UUID.randomUUID().toString().replaceAll("-", "");

        return new JacksonRepresentation(returnString);
    }

    @Post
    public Representation postReq() throws Exception {




        String returnString = "default hello world - "+ UUID.randomUUID().toString().replaceAll("-", "");

        return new JacksonRepresentation(returnString);
    }

}
