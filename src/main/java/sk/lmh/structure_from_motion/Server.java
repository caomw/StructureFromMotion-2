package sk.lmh.structure_from_motion;

import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 08:06
 * To change this template use File | Settings | File Templates.
 */
public class Server {

    public static void main(String[] args) throws Exception{

        ServerApplication app = new ServerApplication();

        Component component = new Component();
        component.getDefaultHost().attach(app);

        new org.restlet.Server(Protocol.HTTP, 8182, component).start();
    }

}
