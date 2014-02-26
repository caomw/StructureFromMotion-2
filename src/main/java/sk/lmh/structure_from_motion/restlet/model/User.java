package sk.lmh.structure_from_motion.restlet.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
public class User extends UserBase {

    public String email;
    public String password;
    private List<Model> models = new ArrayList<Model>();

    public User(){}

    public User( String userUUID ){

        this.userUUID = userUUID;
    }

    public void addModels( ArrayList<Model> newModels ){
        this.models.addAll( newModels );
    }

}
