package sk.lmh.structure_from_motion;

import org.restlet.Application;
import org.restlet.routing.Router;
import sk.lmh.structure_from_motion.endpoint.Default;
import sk.lmh.structure_from_motion.endpoint.model.NewModel;
import sk.lmh.structure_from_motion.endpoint.user.NewUser;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:07
 * To change this template use File | Settings | File Templates.
 */
public class ServerApplication extends Application {

    @Override
    public org.restlet.Restlet createInboundRoot() {

        Router router = new Router();
        //router.attach("/hello", HelloWorldresource.class);

        router.attach("/user/new", NewUser.class);

        router.attach("/model/new", NewModel.class);

        router.attachDefault(Default.class);

        router.setContext(getContext());
        return router;
    };

}
