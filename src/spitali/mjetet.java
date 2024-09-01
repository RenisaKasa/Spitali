
package spitali;
public class mjetet {
    private String lloji;
    private String gjendja;
    private int vitprodhimi;
    private int kosto;

    public mjetet(String lloji,String gjendja,int vitprodhimi,int kosto)
    {
        this.lloji=lloji;
        this.gjendja=gjendja;
        this.vitprodhimi=vitprodhimi;
        this.kosto=kosto;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public String getGjendja() {
        return gjendja;
    }

    public void setGjendja(String gjendja) {
        this.gjendja = gjendja;
    }

    public int getVitprodhimi() {
        return vitprodhimi;
    }

    public void setVitprodhimi(int vitprodhimi) {
        this.vitprodhimi = vitprodhimi;
    }

    public int getKosto() {
        return kosto;
    }

    public void setKosto(int kosto) {
        this.kosto = kosto;
    }
    
    
    public boolean isDegraded() {
        // Assuming a degraded mjete has gjendja "degraded"
        return gjendja.equalsIgnoreCase("degraded");
    }

    public String toString() {
        return "Mjeti [lloji=" + lloji + ",gjendja=" + gjendja + ",vitprodhimi=" + vitprodhimi
                + ",kosto=" + kosto + ",]";
    }
}