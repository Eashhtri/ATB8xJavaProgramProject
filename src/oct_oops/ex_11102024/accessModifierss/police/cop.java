package oct_oops.ex_11102024.accessModifierss.police;

public class cop {
    public int gun;
    public String idCard;

    public cop(int gun) {
        this.gun = gun;

    }
    protected void canIShoot(){
        System.out.println("Yes,You can !!");

    }
}
