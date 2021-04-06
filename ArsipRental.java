package pbo_5;

import java.util.ArrayList;

public class ArsipRental {
    ArrayList<RentalMobil> dataRental = new ArrayList<RentalMobil>();
    
    public void sewa(Peminjam peminjam, Mobil mobil, int lamaRental){
        if(mobil.getStatus() == true){
            dataRental.add(new RentalMobil(peminjam, mobil, lamaRental));
            System.out.println("Mobil berhasil disewa");
            mobil.setStatus(false);
        }
        else{
            System.out.println("Maaf, mobil sudah disewa");
        }
    }
    
    public void info(){
        for(int i = 0; i < dataRental.size(); i++){
            System.out.println("Data ke-" + (i+1));
            System.out.println("Nama Peminjam   : " + dataRental.get(i).getPeminjam().getNama());
            System.out.println("Tipe Mobil      : " + dataRental.get(i).getMobil().getTipeMobil());
            System.out.println("Nopol Mobil     : " + dataRental.get(i).getMobil().getNopol());
            System.out.println("Lama Peminjaman : " + dataRental.get(i).getLamaRental());
            System.out.println("");
        }
    }
    
}
