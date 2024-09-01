
package spitali;


//"Shtypni 6 per te afishuar infermieret mbi 30 vjec."
import java.util.Date;
import java.time.LocalDate;
public class infermier {

    public int counter=0;

    private int mosha;
    private String iemer;
    private String imbiemer;
    private int inrcel;
    private char igjinia;
    private LocalDate iditelindja;


    public infermier(String iemer, String imbiemer, int inrcel, char igjinia, LocalDate iditelindja, int mosha) {
        this.iemer = iemer;
        this.imbiemer = imbiemer;
        this.inrcel = inrcel;
        this.igjinia = igjinia;
        this.iditelindja = iditelindja;
        this.mosha = mosha;
    }


    public String getIemer() {
        return iemer;
    }

    public void setIemer(String iemer) {
        this.iemer = iemer;
    }

    public String getImbiemer() {
        return imbiemer;
    }

    public void setImbiemer(String imbiemer) {
        this.imbiemer = imbiemer;
    }

    public int getInrcel() {
        return inrcel;
    }

    public void setInrcel(int inrcel) {
        this.inrcel = inrcel;
    }

    public char getIgjinia() {
        return igjinia;
    }

    public void setIgjinia(char igjinia) {
        this.igjinia = igjinia;
    }

    public LocalDate getIditelindja() {
        return iditelindja;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public void setDitelindja(Date ditelindja) {
        this.iditelindja = iditelindja;
    }



    @Override
    public String toString() {
        return "Infermier/e {" + "iemer='" + iemer + ' ' + ", imbiemer='" + imbiemer + ' ' + ", inrcel=" + inrcel +
                ", igjinia=" + igjinia + '}';
    }
}

