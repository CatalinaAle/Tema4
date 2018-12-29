public class Hipopotamul {
    private int inaltimeM = 5;
    private int greutateKg = 4000;
    private String hrana;
    private String nume;
    private String locuinta;

    public Hipopotamul (String hrana, String nume, String locuinta){
        this.hrana = hrana;
        this.nume = nume;
        this.locuinta = locuinta;

    }

    public int getInaltimeM (){

        return inaltimeM;
    }

    public int getGreutateKg (){

        return greutateKg;
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
