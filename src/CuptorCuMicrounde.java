public class CuptorCuMicrounde {
    private int greutate = 11;
    private int capacitate = 20;
    private String producator;
    private String culoare;
    private boolean oprit = true;

    public CuptorCuMicrounde(String producator, String culoare){
        this.producator = producator;
        this.culoare = culoare;
    }

    public int getGreutate (){

        return greutate;
    }

    public int getCapacitate(){

        return capacitate;
    }

    public String getProducator() {
        return producator;
    }

    public String getCuloare(){

        return culoare;
    }

    public boolean isOprit() {
        return oprit;
    }
}
