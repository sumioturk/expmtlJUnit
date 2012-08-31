package models;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

/**
 * Created with IntelliJ IDEA.
 * User: sean
 * Date: 8/30/12
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Gun {

    public void shoot();
    public void reload();
    public Boolean isSafetyOn();
    public void switchSafety();

}
