
package spitali;

import java.time.LocalDate;
import java.util.Date;

public class pacienti {
    private String emer;
    private String mbiemer;
    private int mosha;
    private char gjinia;
    private String semundja;
    private int nrDhome;
    private int nrCel;
    private LocalDate pacditelindja;
    private Date ditelindja=new Date();

    public pacienti(String emer, String mbiemer, int mosha, char gjinia, String semundja, int nrDhome, int nrCel, LocalDate pacditelindja)
    {
        this.emer=emer;
        this.mbiemer=mbiemer;
        this.mosha=mosha;
        this.gjinia=gjinia;
        this.semundja=semundja;
        this.nrDhome=nrDhome;
        this.nrCel=nrCel;
        this.pacditelindja = pacditelindja;
    }

    public LocalDate getPacditelindja() {
        return pacditelindja;
    }

    public void setPacditelindja(LocalDate pacditelindja) {
        this.pacditelindja = pacditelindja;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }



    public String getSemundja() {
        return semundja;
    }

    public void setSemundja(String semundja) {
        this.semundja = semundja;
    }

    public int getNrDhome() {
        return nrDhome;
    }

    public void setNrDhome(int nrDhome) {
        this.nrDhome = nrDhome;
    }

    public int getNrCel() {
        return nrCel;
    }

    public void setNrCel(int nrCel) {
        this.nrCel = nrCel;
    }
    public String toString() {
        return "Pacienti/ja [emer=" + emer + ",mbiemer=" +
                mbiemer + ",mosha=" + mosha + ",gjinia=" + gjinia + ",semundja="
                + semundja + ",nrDhome=" + nrDhome + ",nrCel=" + nrCel +  "]";
    }
}