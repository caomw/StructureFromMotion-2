package sk.lmh.structure_from_motion;

import org.restlet.Application;
import org.restlet.routing.Router;
import sk.lmh.structure_from_motion.endpoint.Default;
import sk.lmh.structure_from_motion.endpoint.model.image;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:07
 * To change this template use File | Settings | File Templates.
 */
public class ServerApplicationFTP extends Application {

    @Override
    public org.restlet.Restlet createInboundRoot() {

        Router router = new Router();
        // MODEL
        // basic operations
        router.attach("/image/image", image.class);


        router.attachDefault(Default.class);

        router.setContext(getContext());
        return router;
    };

}
