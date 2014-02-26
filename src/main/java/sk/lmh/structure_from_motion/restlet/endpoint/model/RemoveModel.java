package sk.lmh.structure_from_motion.restlet.endpoint.model;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.restlet.model.ModelBase;
import sk.lmh.structure_from_motion.restlet.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class RemoveModel extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
    }

    @Get
    public Representation getRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation<ModelBase>( null );
    }

    @Post
    public Representation postRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = form.getFirstValue("userUUID");
        String userPassword = form.getFirstValue("userPassword");
        String modelUUID = form.getFirstValue("modelUUID");

        User user = new User();
        user.userUUID = userUUID;
        user.userUUID = userUUID;

        ModelBase modelBase = new ModelBase();
        modelBase.modelUUID = modelUUID;
        modelBase.user = user;

        // call remove
        // ...

        return new JacksonRepresentation<Boolean>( false );
    }

    @Delete
    public Representation deleteRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = form.getFirstValue("userUUID");
        String userPassword = form.getFirstValue("userPassword");
        String modelUUID = form.getFirstValue("modelUUID");

        User user = new User();
        user.userUUID = userUUID;
        user.userUUID = userUUID;

        ModelBase modelBase = new ModelBase();
        modelBase.modelUUID = modelUUID;
        modelBase.user = user;

        // call remove
        // ...

        return new JacksonRepresentation<Boolean>( false );
    }

    @Put
    public Representation putRepresentation(Representation entity) throws Exception {

        return new JacksonRepresentation<ModelBase>( null );
    }

}
