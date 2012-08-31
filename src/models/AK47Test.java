package models;

import junit.framework.TestCase;
import org.testng.annotations.Test;

public class AK47Test extends TestCase{
    @Test
    public void testShoot() throws Exception {

        AK47 ak47 = new AK47();
        assertEquals(ak47.cartridge, "7.62x39mm M43/M67");

        ak47.shoot();
        assertSame(20 - 1, ak47.ammo);

    }

    public void testReload() throws Exception {

        AK47 ak47 = new AK47();
        for(int i = 0; i < 20; i++){
            ak47.shoot();
        }
        assertSame(20, ak47.ammo);

        ak47.reload();
        assertSame(19 + 1, ak47.ammo);
    }

    public void testIsSafetyOn() throws Exception {

        AK47 ak47 = new AK47();
        assertSame(false, ak47.isSafetyOn());

    }

    public void testSwitchSafety() throws Exception {

        AK47 ak47 = new AK47();
        ak47.switchSafety();
        assertSame(true, ak47.isSafetyOn());

    }
}
