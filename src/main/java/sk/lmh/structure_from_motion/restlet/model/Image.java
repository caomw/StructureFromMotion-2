package sk.lmh.structure_from_motion.restlet.model;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
public class Image {

    public int order = -1;
    public String name = null;
    public String imageType = null;
    public String userUUID = null;
    public String modelUUID = null;

    private String getFilePath(){
        String filePath = null;

        filePath = "http://localhost:8182/" + userUUID + "/" + modelUUID + "/" + name + "." + imageType;

        return filePath;
    }

}
