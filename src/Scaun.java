public class Scaun {
    private int nrPicioare = 4;
    private int pret = 300;
    private String culoare;
    private String producator;
    private String material;

    public Scaun(String culoare, String producator, String material){
        this.culoare = culoare;
        this.producator = producator;
        this.material = material;
    }

    public int getNrPicioare (){
        return nrPicioare;
    }

    public int getPret (){
        return pret;
    }

    public String getCuloare(){
        return culoare;
    }

    public String getProducator(){
        return producator;
    }

    public String getMaterial(){
        return material;
    }
}
