
package models;

public class AK47 implements Gun {

    public final String cartridge = "7.62x39mm M43/M67";
    public Integer ammo = 20;
    public Boolean safety = false;

    public void shoot(){
        if(ammo == 1){
            reload();
        }else{
            ammo--;
        }
    }

    public void reload(){
        ammo = 20;
    }

    public Boolean isSafetyOn(){
        return safety;
    }

    public void switchSafety(){
        safety = !safety;
    }

}