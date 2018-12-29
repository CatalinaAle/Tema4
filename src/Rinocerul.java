public class Rinocerul {
    private int inaltimeM = 2;
    private int greutateKg = 3500;
    private String hrana;
    private String culoare;
    private String locuinta;

    public Rinocerul(String hrana, String culoare, String locuinta) {
        this.hrana = hrana;
        this.culoare = culoare;
        this.locuinta = locuinta;

    }

    public int getInaltimeM() {

        return inaltimeM;
    }

    public int getGreutateKg() {

        return greutateKg;
    }

    public String getHrana() {

        return hrana;
    }

    public String getGetCuloare() {

        return culoare;
    }

    public String getLocuinta() {

        return locuinta;
    }
}


