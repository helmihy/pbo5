package pbo_5;

public class RentalMobil {
    private Peminjam peminjam;
    private Mobil mobil;
    private int lamaRental;

    public RentalMobil(Peminjam peminjam, Mobil mobil, int lamaRental) {
        this.peminjam = peminjam;
        this.mobil = mobil;
        this.lamaRental = lamaRental;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public int getLamaRental() {
        return lamaRental;
    }
    
    
    
}
