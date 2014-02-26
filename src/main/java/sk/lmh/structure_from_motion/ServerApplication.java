package sk.lmh.structure_from_motion;

import org.restlet.Application;
import org.restlet.routing.Router;
import sk.lmh.structure_from_motion.endpoint.Default;
import sk.lmh.structure_from_motion.endpoint.model.*;
import sk.lmh.structure_from_motion.endpoint.user.*;

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

        // USER
        // basic operations
        router.attach("/user/new", NewUser.class);
        router.attach("/user/register", RegisterUser.class);
        router.attach("/user/remove", RemoveUser.class);
        router.attach("/user/login", LoginUser.class);
        router.attach("/user/loout", LogoutUser.class);
        router.attach("/user/edit", EditUser.class);
        //router.attach("/user/resetPassword", ResetUserPassword.class);
        // special basic operations
        //router.attach("/user/special/signUpViaFacebook", SignUpViaFacebook.class);
        //router.attach("/user/special/signUpViaGooglePlus", SignUpViaGooglePlus.class);

        //


        // MODEL
        // basic operations
        router.attach("/model/new", NewModel.class);
        router.attach("/model/edit", EditModel.class);
        router.attach("/model/remove", RemoveModel.class);
        // find operations
        router.attach("/model/findModelsById", FindModelById.class);
        router.attach("/model/findModelsByIds", FindModelsByIds.class);
        router.attach("/model/findModelsByUser", FindModelsByUser.class);
        router.attach("/model/findNewestModels", FindNewestModels.class);
        router.attach("/model/findMostLikedModels", FindMostLikedModels.class);


        router.attachDefault(Default.class);

        router.setContext(getContext());
        return router;
    };

}
