package pbo_5;
// @helmihy
public class Main {

    public static void main(String[] args) {
        Peminjam erlina = new Peminjam("Erlina", 20, "081111111111");
        Peminjam bagus = new Peminjam("Bagus", 31, "081222222222");
        Peminjam fikri = new Peminjam("Fikri", 25, "081333333333");
        
        DataMobil data = new DataMobil();
        data.tambahMobil("SUV", "N 1111 AB", "Honda");
        data.tambahMobil("TRUCK", "N 2222 AB", "Suzuki");
        data.tambahMobil("SEDAN", "N 3333 AB", "Toyota");
        data.tambahMobil("SEDAN", "N 4444 AB", "Tesla");
        data.tambahMobil("SUV", "N 5555 AB", "Honda");
        
        data.daftarMobil();
        System.out.println("");
        
        ArsipRental arsip = new ArsipRental();
        arsip.sewa(erlina, data.listMobil.get(0), 3);
        arsip.sewa(bagus, data.listMobil.get(4), 2);
        arsip.sewa(fikri, data.listMobil.get(4), 1);
        arsip.sewa(fikri, data.listMobil.get(3), 1);
        
        System.out.println("");
        arsip.info();
    }
}
// @helmihy
