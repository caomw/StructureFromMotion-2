package sk.lmh.structure_from_motion.endpoint.model;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.model.ModelBase;
import sk.lmh.structure_from_motion.model.User;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
public class NewModel extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
   }

    @Get
    public Representation getRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = form.getFirstValue("userUUID");

        User user = new User();
        user.userUUID = userUUID;

        ModelBase newModel = new ModelBase();
        newModel.modelUUID = UUID.randomUUID().toString().replaceAll("-", "") + "_" + System.currentTimeMillis();
        newModel.user = user;

        return new JacksonRepresentation<ModelBase>( newModel );
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

}
