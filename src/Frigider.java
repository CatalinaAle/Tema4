public class Frigider {
    private int volumNet = 287;
    private int consum = 341;
    private String producator;
    private String culoare;
    private boolean oprit = true;


    public Frigider(String producator, String culoare){
        this.producator = producator;
        this.culoare = culoare;
    }

    public int getVolumNet() {
        return volumNet;
    }

    public int getConsum(){

        return consum;
    }

    public String getProducator(){

        return producator;
    }

    public String getCuloare(){

        return culoare;
    }

    public boolean isOprit(){

        return oprit;
    }
}
