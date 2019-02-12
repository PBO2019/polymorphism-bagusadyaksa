package sample;

public class Staff extends Karyawan {
    protected int tarif;
    protected int hasil;
    public Staff(){
        this.tarifGaji();
        System.out.println("Gaji Seorang Staff ");
    }
    public void tarifGaji(int tarif){
        hasil = tarif * 30;
        System.out.println(hasil);
    }
}
