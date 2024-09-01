
package spitali;
import java.time.LocalDate;

public class pediater extends mjeku{
    private String universiteti;
    private int prroga;
    private int nrOperacion;
   
    public pediater(String memer, String mmbiemer, int mmosha, LocalDate mditelindja, int mnrcel, char gjinia, String llojimjek, int prroga, int nrOperacion, String universiteti)
    {
        super(memer, mmbiemer, mmosha, mditelindja, mnrcel, universiteti);

        this.universiteti=universiteti;
        this.prroga=prroga;
        this.nrOperacion=nrOperacion;
    }

    public String getMmbiemer(){
        return mmbiemer;
    }
    
    public void setMmbiemer(){
        this.mmbiemer= mmbiemer;
    }
    public String getUniversiteti() {
        return universiteti;
    }

    public void setUniversiteti(String universiteti) {
        this.universiteti = universiteti;
    }

    public int getPrroga() {
        return prroga;
    }

    public void setPrroga(int prroga) {
        this.prroga = prroga;
    }

    public int getNrOperacion() {
        return nrOperacion;
    }

    public void setNrOperacion(int nrOperacion) {
        this.nrOperacion = nrOperacion;
    }
    public String toString() {
        return "Pediater/e " + super.getMemer()+ super.getMmbiemer()+" " + "[universiteti="
                + universiteti + ",prroga=" + prroga + ",nrOperacion=" + nrOperacion + "]";
    }
}
