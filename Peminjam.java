package pbo_5;

public class Peminjam {
    private String nama;
    private int umur;
    private String noHP;

    public Peminjam(String nama, int umur, String noHP) {
        this.nama = nama;
        this.umur = umur;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNoHP() {
        return noHP;
    }
    
    
}
