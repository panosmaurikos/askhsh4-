public class Fridge extends HomeAppliancesStore {
    //////metablhtes//////
    private int mikos;
    private int ypsos;
    private int vathos;
    private String kataskeuastis;
    private String onoma_syskeuhs;
    private String typos_syskeuhs;
    private int katanalosi;
    private String xroma;
    private String energeiaki_klasi;
    private int xwritikotita_sunthrishs;
    private int xwritikotita_psiksis;
    private boolean Mini_Bar;
    ///////////////// Getters and Setters///////////////
    public int getMikos () {
        return mikos;
    }

    public void setMikos (int newmikos){
        this.mikos = newmikos;
    }

    public int getYpsos () {
        return ypsos;
    }

    public void setYpsos (int newypsos){
        this.ypsos = newypsos;
    }

    public int getVathos () {
        return vathos;
    }

    public void setVathos (int newvathos){
        this.vathos = newvathos;
    }

    public String getKataskeuastis () {
        return kataskeuastis;
    }

    public void setKataskeuastis (String newkataskeuastis){
        this.kataskeuastis = newkataskeuastis;
    }

    public String getOnoma_syskeuhs () {
        return onoma_syskeuhs;
    }

    public void setOnoma_syskeuhs (String newonoma_syskeuhs){
        this.onoma_syskeuhs = newonoma_syskeuhs;
    }

    public String getTypos_syskeuhs () {
        return typos_syskeuhs;
    }

    public void setTypos_syskeuhs (String newtypos_syskeuhs){
        this.typos_syskeuhs = newtypos_syskeuhs;
    }

    public int getkatanalosi () {
        return katanalosi;
    }

    public void setkatanalosi (int newkatanalosi) {
        this.katanalosi = newkatanalosi;
    }
    ///////////////phigio//////////////////
    Fridge(int mikos, int ypsos, int vathos, String kataskeuastis, String onoma_syskeuhs,
           String typos_syskeuhs, int katanalosi, String xroma, int xwritikotita_sunthrishs ,
           String energeiaki_klasi, boolean Mini_Bar ,int xwritikotita_psiksis){
        this.mikos=mikos;
        this.ypsos=ypsos;
        this.vathos=vathos;
        this.kataskeuastis=kataskeuastis;
        this.onoma_syskeuhs=onoma_syskeuhs;
        this.typos_syskeuhs=typos_syskeuhs;
        this.katanalosi=katanalosi;
        this.xroma=xroma;
        this.xwritikotita_sunthrishs=xwritikotita_sunthrishs;
        this.energeiaki_klasi=energeiaki_klasi;
        this.Mini_Bar=Mini_Bar;
        this.xwritikotita_psiksis=xwritikotita_psiksis;

    }
    ////////////////synartisis phigioy////////////////////////
    public void PrintFridge() {
        System.out.println("diastaseis: "+"\nmikos:" +mikos  +"\nypsos:"  +ypsos  +"\nvathos:"  +vathos);
        System.out.println("kataskeuastis: " + kataskeuastis);
        System.out.println("onoma syskeuhs: " + onoma_syskeuhs);
        System.out.println("typos syskeuhs: " + typos_syskeuhs);
        System.out.println("katanalosi reumatos: " + katanalosi);
        System.out.println("xroma: " + xroma);
        System.out.println("xwritikotita sunthrishs: " + xwritikotita_sunthrishs);
        System.out.println("xwritikotita psiksis: " + xwritikotita_psiksis);
        System.out.println("energeiaki klasi: " +energeiaki_klasi );
        System.out.println("Mini Bar: " + Mini_Bar);

    }
    ///////////////metritis////////////////////
    public int getCounterFridge() {
        return Counter;}
    private void periodicMaintenance(){
    }
}