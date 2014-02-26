package sk.lmh.structure_from_motion.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lukasmartinovic
 * Date: 26/02/2014
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
public class Model extends ModelBase {

    public List<Image> images = new ArrayList<Image>();

    public void addImages( ArrayList<Image> newImages ) {
        this.images.addAll(newImages);
    }

}
