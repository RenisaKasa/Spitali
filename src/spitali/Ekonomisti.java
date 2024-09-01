
package spitali;
import java.time.LocalDate;
import java.util.Date;


public class Ekonomisti {
    private String emri;
    private String mbiemri;
    private  int nrcel;
    private char gjinia;
    private LocalDate ditelindja;

    public Ekonomisti(String emri, String mbiemri, int nrcel, char gjinia, LocalDate ditelindja) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.nrcel = nrcel;
        this.gjinia = gjinia;
        this.ditelindja = ditelindja;
    }



    public String getEmri() {
        return emri;
    }
    public void setEmri(String emri) {
        this.emri = emri;
    }
    public String getMbiemri() {
        return mbiemri;
    }
    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public char getGjinia() {
        return gjinia;
    }
    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }
    public int getNrcel() {
        return nrcel;
    }
    public void setNrcel(int nrcel) {
        this.nrcel = nrcel;

    }

    public void setDitelindja(LocalDate ditelindja) {
        this.ditelindja = ditelindja;
    }
    
    @Override
    public String toString() {
        return "Ekonomisti"+
                "[emri=" + emri +
                ", mbiemri=" + mbiemri +
                ", ditelindja=" + ditelindja +
                ", gjinia=" + gjinia +
                ", nrcel=" + nrcel +
                "]";
    }

    
    
}
