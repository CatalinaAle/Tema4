public class Espressor {
    private int presiune = 15;
    private int capacitate = 1;
    private int greutate = 6;
    private String nume;
    private String bautura;


    public Espressor(String nume, String bautura) {
        this.nume = nume;
        this.bautura = bautura;
    }


    public int getPresiune() {

        return presiune;
    }

    public int getCapacitate() {

        return capacitate;
    }

    public String getNume() {

        return nume;
    }

    public String getBautura() {

        return bautura;
    }


}


