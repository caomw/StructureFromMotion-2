package sk.lmh.structure_from_motion.restlet.endpoint.user;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import sk.lmh.structure_from_motion.restlet.model.UserBase;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 12:25
 * To change this template use File | Settings | File Templates.
 */
public class RegisterUser extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);

        //this.userUUID = (String) getRequestAttributes().get("userUUID");
    }

    @Get
    public Representation get(Representation entity) throws Exception {

        UserBase newUser = new UserBase();
        newUser.userUUID = UUID.randomUUID().toString().replaceAll("-", "");

        return new JacksonRepresentation<UserBase>( newUser );
    }

    @Post
    public Representation accept(Representation entity) throws Exception {

        UserBase newUser = new UserBase();
        newUser.userUUID = UUID.randomUUID().toString().replaceAll("-", "");

        return new JacksonRepresentation<UserBase>( newUser );
    }

}
