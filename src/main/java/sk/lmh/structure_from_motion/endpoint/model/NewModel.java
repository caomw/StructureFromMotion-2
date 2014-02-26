package sk.lmh.structure_from_motion.endpoint.model;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import sk.lmh.structure_from_motion.model.ModelBase;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:11
 * To change this template use File | Settings | File Templates.
 */
public class NewModel extends ServerResource {

    //private String userUUID = "";

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);

        //this.userUUID = (String) getRequestAttributes().get("userUUID");
    }

    @Get
    public Representation get(Representation entity) throws Exception {
        Representation rep = null;



        setStatus(Status.CLIENT_ERROR_NOT_FOUND,"");
        return new StringRepresentation( "", MediaType.TEXT_PLAIN );
    }

    @Post
    public Representation accept(Representation entity) throws Exception {

        Form form = new Form(entity);
        String userUUID = form.getFirstValue("userUUID");

        ModelBase newModel = new ModelBase();
        newModel.modelUUID = UUID.randomUUID().toString().replaceAll("-", "");
        newModel.userUUID = userUUID;

        return new JacksonRepresentation<ModelBase>( newModel );
    }

}
