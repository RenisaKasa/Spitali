
package spitali;

import java.util.Date;
import java.time.LocalDate;

public class Sanitare {
    private String emri;

    private String mbiemri;
    private int rroga;
    private LocalDate Sdatelindja;
    private int mosha;
    private int nrCel;

    public Sanitare(String emri, String mbiemri, int rroga, LocalDate Sdatelindja, int nrCel) {
        this.emri = emri;
        this.mbiemri= mbiemri;
        this.Sdatelindja = Sdatelindja;
        this.rroga=rroga;
        this.nrCel=nrCel;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getRroga() {
        return rroga;
    }

    public void setRroga(int rroga) {
        this.rroga = rroga;
    }

    public LocalDate getDitelindja() {
        return Sdatelindja;
    }
    public void setDitelindja(Date ditelindja) {
        this.Sdatelindja = Sdatelindja;
    }

    @Override
    public String toString() {
        return "Sanitare{" +
                "emri='" + emri + '\'' +
                ", rroga=" + rroga +
                '}';
    }
}
