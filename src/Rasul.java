public class Rasul {
    private int inaltimeCm = 40;
    private int viteza = 80;
    private String hrana;
    private String nume;
    private String locuinta;

    public Rasul(String hrana, String nume, String locuinta){
        this.hrana = hrana;
        this.nume = nume;
        this.locuinta = locuinta;

    }

    public int getInaltimeCm(){

        return inaltimeCm;
    }

    public int getViteza(){

        return viteza;
    }

    public String getHrana() {

        return hrana;
    }

    public String getNume() {

        return nume;
    }

    public String getLocuinta() {

        return locuinta;
    }

}

