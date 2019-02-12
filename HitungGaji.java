package sample;

public class HitungGaji {
    public static void main (String [] args){
        Staff staff = new Staff();
        staff.tarifGaji(100000);

        Supervisior spr = new Supervisior();
        spr.tarifGaji(200000);
    }
}