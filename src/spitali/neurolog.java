
package spitali;
import java.time.LocalDate;

public class neurolog extends mjeku{
    private int nrroga;
    private int noperacione;
    private String nuni;

    public neurolog(String memer, String mmbiemer, int mmosha, LocalDate mditelindja, int mnrcel, char gjinia, String llojimjek, int nrroga, int noperacione, String nuni) {
        super(memer, mmbiemer, mmosha, mditelindja, mnrcel, nuni);
        this.nrroga = nrroga;
        this.noperacione = noperacione;
        this.nuni = nuni;
    }

    public int getNrroga() {
        return nrroga;
    }

    public void setNrroga(int nrroga) {
        this.nrroga = nrroga;
    }

    public int getNoperacione() {
        return noperacione;
    }

    public void setNoperacione(int noperacione) {
        this.noperacione = noperacione;
    }

    public String getNuni() {
        return nuni;
    }

    public void setNuni(String nuni) {
        this.nuni = nuni;
    }

    @Override
    public String toString() {
        return "neurolog{" +
                "nrroga=" + nrroga +
                ", noperacione=" + noperacione +
                ", nuni='" + nuni + '\'' +
                '}';
    }
}


