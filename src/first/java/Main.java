import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        Leu Lord = new Leu("carne", "Lord", "Savana");
        System.out.println("Leul Lord are o intaltime de " + Lord.getInaltimeM() + " m " + " si o greutate de " + Lord.getGreutateKg() + " Kg");
        System.out.println("Lord se hraneste cu " + Lord.getHrana() + " si locuieste in " + Lord.getLocuinta());
        System.out.println("------------------------------------------------");


        Rinocerul Riri = new Rinocerul("iarba","maro","pajiste cu iarba");
        System.out.println("Rinocerul Riri este de culoare " + Riri.getGetCuloare() + " si are o greutate de " + Riri.getGreutateKg() + " Kg");
        System.out.println("Lui Riri ii place sa manance " + Riri.getHrana() + " si sa doarma pe " + Riri.getLocuinta());
        System.out.println("------------------------------------------------");

        Rasul HaHa = new Rasul("carne", "HaHa","paduri");
        System.out.println("Rasul HaHa este foarte rapid si alearga cu o viteza de " + HaHa.getViteza() + "km/h" + " prin " + HaHa.getLocuinta());
        System.out.println("HaHa nu este foarte inalt are doar " + HaHa.getInaltimeCm() + " cm" + " dar ii place foarte mult sa manance " + HaHa.getHrana());
        System.out.println("------------------------------------------------");

        Hipopotamul Hipo = new Hipopotamul("iarba", "Hipo","lacuri");
        System.out.println("Hipopotamul " + Hipo.getNume() + " este putin grasut cu o greutate de " + Hipo.getGreutateKg() + " kg" + " desi mananca doar " + Hipo.getHrana());
        System.out.println("Lui Hipo ii place sa se balaceasca in " + Hipo.getLocuinta());
        System.out.println("------------------------------------------------");

        Lemurul Lemy = new Lemurul("omnivor","gri","padurile tropicale");
        System.out.println("Lemurul Lemy este un  " + Lemy.getHrana() + " de culoare " + Lemy.getCuloare());
        System.out.println("Lemy este de talie mica cu o inaltime de " + Lemy.getInaltimeCm() + " cm " + "si locuieste in " + Lemy.getLocuinta());
        System.out.println("------------------------------------------------");

        Espressor Cafisimo = new Espressor("Cafisimo","cafea");
        System.out.println("Espressorul meu ce are o presiune de " + Cafisimo.getPresiune() + " bari" + " face o " + Cafisimo.getBautura() + " de ma trezesc instant dimineata");
        System.out.println("------------------------------------------------");

        Scaun scaun = new Scaun("negru","Mobexpert","piele");
        System.out.println("Am luat un scaun de la " + scaun.getProducator()+ " la pretul de " + scaun.getPret());
        System.out.println("A fost cam scump dar a meritat fiind din " + scaun.getMaterial());
        System.out.println("------------------------------------------------");

        Masa masa = new Masa("maro", "lemn"," manca pe ea");
        System.out.println("Am cumparat o masa cu inaltimea de " + masa.getInaltime() + " m " + " pentru a " + masa.getUtilizare());
        System.out.println("Acasa am constat ca nu avea toate cele " + masa.getNrPicioare() + " picioare " + " si era si de culoare " + masa.getCuloare());
        System.out.println("------------------------------------------------");

        Frigider frigider = new Frigider("Arctic", "argintiu");
        frigider.isOprit();
        System.out.println("Vand frigider marca " + frigider.getProducator() + " de culoare " + frigider.getCuloare());
        System.out.println("Frigiderul are un volum de " + frigider.getVolumNet() + " L" +" si un consum de " + frigider.getConsum() + " kWh");
        System.out.println("------------------------------------------------");

        CuptorCuMicrounde cuptor = new CuptorCuMicrounde("Samsung", "negru");
        cuptor.isOprit();
        System.out.println("Cuptorul marca " + cuptor.getProducator() + " de culoare " + cuptor.getCuloare());
        System.out.println("Este cam greu pentru un cuptor cu o greutate de " + cuptor.getGreutate() + " kg");
        System.out.println("------------------------------------------------");


    }
}
