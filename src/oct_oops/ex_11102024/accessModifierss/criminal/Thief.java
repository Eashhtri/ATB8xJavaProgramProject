package oct_oops.ex_11102024.accessModifierss.criminal;

import oct_oops.ex_11102024.accessModifierss.police.cop;

public class Thief {
    public static void main(String[] args) {
        cop c = new cop(10);
        System.out.println(c.gun);
//        c.canIShoot();
    }
}
