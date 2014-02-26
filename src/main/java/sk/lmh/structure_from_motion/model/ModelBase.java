package sk.lmh.structure_from_motion.model;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
public class ModelBase {

    public String modelUUID = null;
    public User user = null;

    public ModelBase(){}

    public ModelBase( String modelUUID ){

        this.modelUUID = modelUUID;
    }

}
