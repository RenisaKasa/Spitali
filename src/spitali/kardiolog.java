
package spitali;

import java.time.LocalDate;

public class kardiolog extends mjeku{
    private int krroga;
    private int koperacione;
    private String kuni;

    public kardiolog(String memer, String mmbiemer, int mmosha, LocalDate mditelindja, int mnrcel, char gjinia, String llojimjek,
                     int krroga, int koperacione, String kuni) {
        super(memer, mmbiemer, mmosha, mditelindja, mnrcel, kuni);
        this.krroga = krroga;
        this.koperacione = koperacione;
        this.kuni = kuni;

    }

    public int getKrroga() {
        return krroga;
    }

    public void setKrroga(int krroga) {
        this.krroga = krroga;
    }

    public int getKoperacione() {
        return koperacione;
    }

    public void setKoperacione(int koperacione) {
        this.koperacione = koperacione;
    }

    public String getKuni() {
        return kuni;
    }

    public void setKuni(String kuni) {
        this.kuni = kuni;
    }

    @Override
    public String toString() {
        return "Kardiolog/e{" +
                "krroga=" + krroga +
                ", koperacione=" + koperacione +
                ", kuni='" + kuni + ' ' + '}';
    }
}