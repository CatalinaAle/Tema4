public class Lemurul {
    private int inaltimeCm = 100;
    private int greutateKg = 10;
    private String hrana;
    private String culoare;
    private String locuinta;

    public Lemurul(String hrana, String culoare, String locuinta){
        this.hrana = hrana;
        this.culoare = culoare;
        this.locuinta = locuinta;

    }

    public int getInaltimeCm(){

        return inaltimeCm;

    }

    public int getGreutateKg(){

        return greutateKg;
    }

    public String getHrana() {

        return hrana;
    }

    public String getCuloare() {

        return culoare;
    }

    public String getLocuinta() {

        return locuinta;
    }

}
