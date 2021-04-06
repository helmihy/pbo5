package pbo_5;
// @helmihy
public class Mobil {
    private String tipeMobil;
    private String nopol;
    private String merk;
    private boolean status;

    public Mobil(String tipeMobil, String nopol, String merk, boolean status) {
        this.tipeMobil = tipeMobil;
        this.nopol = nopol;
        this.merk = merk;
        this.status = status;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public String getNopol() {
        return nopol;
    }

    public String getMerk() {
        return merk;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
// @helmihy
