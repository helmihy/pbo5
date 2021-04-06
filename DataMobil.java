package pbo_5;
// @helmihy
import java.util.ArrayList;

public class DataMobil {
    ArrayList<Mobil> listMobil = new ArrayList<Mobil>();
    
    public void tambahMobil(String tipeMobil, String nopol, String merk){
        listMobil.add(new Mobil(tipeMobil, nopol, merk, true));
    }
    
    public void daftarMobil(){
        System.out.println("DAFTAR MOBIL YANG ADA");
        System.out.println("---------------------");
        for(Mobil dftr : listMobil){
            System.out.println("NOPOL   : " + dftr.getNopol());
            System.out.println("MERK    : " + dftr.getMerk());
            System.out.println("TIPE    : " + dftr.getTipeMobil());
            System.out.println("---------------------");
        }
    }
    
}
// @helmihy
