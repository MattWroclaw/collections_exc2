package java26.zad1.zad1.WypozyczalniaWodna;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wypozyczalnia {
    public Map<String, SprzetInfo> sprzetWypozyczony = new HashMap<>();


    void wypozyczenie(String numerBurtwy, Sprzet rodzajSprzetu) {
        SprzetInfo si = new SprzetInfo(numerBurtwy, rodzajSprzetu, LocalDateTime.now());

        sprzetWypozyczony.put(numerBurtwy, si);
        System.out.println("Rozpoczęto wypożyczanie "+ rodzajSprzetu);
    }
    SprzetInfo znajdzSprzet(String numerBurtowy) throws NieMaTakiegoSprzetuException {
        if (sprzetWypozyczony.containsKey(numerBurtowy)){
            System.out.println("Sprzęt "+sprzetWypozyczony.get(numerBurtowy)+"jest wypożyczony ");
            return sprzetWypozyczony.get(numerBurtowy);
        }throw new NieMaTakiegoSprzetuException();

    }

    Double zakonczenieWypozyczenia(String numerBurtowy) throws NieMaTakiegoSprzetuException {
        //jeśli nie ma
        if (!sprzetWypozyczony.containsKey(numerBurtowy)){
            throw new NieMaTakiegoSprzetuException();
        }
        //jeśli jednak jest..
        SprzetInfo sprzetInfo = sprzetWypozyczony.get(numerBurtowy);

        Duration czasWypozyczenia = Duration.between(sprzetInfo.getGodzWypozyczenia(), LocalDateTime.now() );

        double naleznosc =0.0;
        switch (sprzetInfo.getSprzet()){
            case BOAT:
                naleznosc = czasWypozyczenia.getSeconds()*1;
                System.out.println(naleznosc);
                break;
            case JACHT:
                naleznosc=czasWypozyczenia.getSeconds()*2;
                System.out.println(naleznosc);
                break;
            case KAJAK:
                naleznosc = czasWypozyczenia.getSeconds()*0.5;
                System.out.println(naleznosc);
                break;
        }
        sprzetWypozyczony.remove(numerBurtowy);

        System.out.println("Sprzęt: "+sprzetInfo+"został oddany. Czas wypożycznia: "+czasWypozyczenia);
        return naleznosc;


    }

    public static void main(String[] args) throws NieMaTakiegoSprzetuException {
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        wypozyczalnia.wypozyczenie("123", Sprzet.BOAT);
        wypozyczalnia.znajdzSprzet("123");
        wypozyczalnia.zakonczenieWypozyczenia("123");

    }


}
