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

    private static String serverType = "dev"; // "rc" / "prod"
    private static String serverName = "localhost"; // "rc" / "prod"
    private static int serverPort = 8182; // "rc" / "prod"
    private static Protocol serverProtocol = Protocol.HTTP;

    public static void main(String[] args) throws Exception{

        ServerApplication app = new ServerApplication();

        Component component = new Component();
        component.getDefaultHost().attach(app);

        new org.restlet.Server( serverProtocol, serverPort, component).start();



        ServerApplicationFTP appFTP = new ServerApplicationFTP();

        Component componentFTP = new Component();
        componentFTP.getDefaultHost().attach(appFTP);

        //new org.restlet.Server( Protocol.FTP, serverPort, componentFTP);
    }

}
