package sample;

public class Supervisior extends Karyawan {
    protected int tarif ;
    protected int hasil;

    public Supervisior(){
        this.tarifGaji();
        System.out.println("Gaji Seorang Supervisior");
    }

    public void tarifGaji(int tarif){
        hasil = tarif * 30;
        System.out.println(hasil);
    }
}
