public class Masa {
    private int inaltime = 1;
    private int nrPicioare = 4;
    private String culoare;
    private String material;
    private String utilizare;

    public Masa(String culoare, String material, String utilizare){
        this.culoare = culoare;
        this.material = material;
        this.utilizare = utilizare;
    }

    public int getInaltime(){
        return inaltime;
    }

    public int getNrPicioare(){
        return nrPicioare;
    }

    public String getCuloare(){
        return culoare;
    }

    public String getMaterial(){
        return material;
    }

    public String getUtilizare(){
        return utilizare;
    }
}
