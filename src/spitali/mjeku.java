
package spitali;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class mjeku {
    private String memer, llojjimjek;
    String mmbiemer;
    private LocalDate mditelindja;

    private String uni;
    private char gjinia;
    private int mnrcel;
    private int mmosha;
    private int rroga;

    public mjeku(String memer, String mmbiemer, int mmosha, LocalDate mditelindja, int mnrcel,String uni) {
        this.memer = memer;
        this.mmbiemer = mmbiemer;
        this.mditelindja = mditelindja;
        this.mnrcel = mnrcel;
        this.gjinia = gjinia;
        this.mmosha = mmosha;
        this.uni=uni;
        this.rroga = rroga; 
    }


    public int getRroga() {
        return rroga;
    }

    public void setRroga(int rroga) {
        this.rroga = rroga;
    }
    public LocalDate getMditelindja() {
        return mditelindja;
    }

    public void setMditelindja(LocalDate mditelindja) {
        this.mditelindja = mditelindja;
    }

    public String getMemer() {
        return memer;
    }

    public void setMemer(String memer) {
        this.memer = memer;
    }

    public String getMmbiemer() {
        return mmbiemer;
    }

    public void setMmbiemer(String mmbiemer) {
        this.mmbiemer = mmbiemer;
    }

    public int getMnrcel() {
        return mnrcel;
    }

    public void setMnrcel(int mnrcel) {
        this.mnrcel = mnrcel;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    public int getMmosha() {
        return mmosha;
    }

    public void setMmosha(int mmosha) {
        this.mmosha = mmosha;
    }

    public String getLlojjimjek() {
        return llojjimjek;
    }

    public void setLlojjimjek(String llojjimjek) {
        this.llojjimjek = llojjimjek;
    }

    public String getUni() {
        return this.uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }


    @Override
public String toString() {
    return "Mjeku/ja{" +
            "memer='" + memer + '\'' +
            ", mmbiemer='" + mmbiemer + '\'' +
            ", mditelindja=" + mditelindja +
            ", mnrcel=" + mnrcel +
            ", uni='" + uni + '\'' +
            ", gjinia=" + gjinia +
            ", mmosha=" + mmosha +
            ", rroga=" + rroga +
            '}';
}
}
