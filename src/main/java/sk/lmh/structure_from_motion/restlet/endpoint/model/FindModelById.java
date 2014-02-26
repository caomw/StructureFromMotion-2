package sk.lmh.structure_from_motion.restlet.endpoint.model;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Form;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.*;
import sk.lmh.structure_from_motion.model.Model;
import sk.lmh.structure_from_motion.model.ModelBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */
public class FindModelById extends ServerResource {

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
    }

    @Get
    public Representation getRepresentation(Representation entity) throws Exception {

        System.out.println("/model/findModelsById");
        return new JacksonRepresentation( null );
    }

    @Post
    public Representation postRepresentation(Representation entity) throws Exception {

        Form form = new Form(entity);
        String modelUUID = form.getFirstValue("modelUUID");

        ModelBase modelBase =  new ModelBase( modelUUID );

        List<Model> modelsList = new ArrayList<Model>();

        // call find
        // ...

        return new JacksonRepresentation< List<Model> >( modelsList );
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
