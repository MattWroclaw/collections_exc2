package java26.zad1.zad1.WypozyczalniaWodna;

import java26.zad1.zad1.zad2.TypPojazdu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NieMaTakiegoSprzetuException {
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        Scanner input = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("Podaj komendę:\n Wypozyczenie nrBurtowy, jaki sprzet\n Oddanie nrBurtowy \n Sprawdzenie nrBurtowy" +
                    "\nWyjscie");
            komenda = input.nextLine();

            String[] slowa = komenda.split(" ");

            if (slowa[0].equalsIgnoreCase("wjazd")) {
                if (slowa.length == 3) {

                    String nrBurtowyPodanyPrzezUzytkownika = slowa[1];
                    String sprzetPodanyPrzezUzytkownika = slowa[2];

                     try { //wyłuskanie typu sprzętu: JAcht, KAJAK.., żeby to wpisac w metodę
                         Sprzet sprzet = Sprzet.valueOf(slowa[2].toUpperCase());

                         wypozyczalnia.wypozyczenie(nrBurtowyPodanyPrzezUzytkownika, sprzet);
                     }catch (IllegalArgumentException illae) {
                         System.err.println("Nie ma takiego rodzaju SPRZęTU");
                     }
                }
            }else  if (slowa[0].equalsIgnoreCase("oddanie")){
                if (slowa.length ==2){
                    String numerBurtowyWpisany = slowa[1];
                    System.out.println(wypozyczalnia.zakonczenieWypozyczenia(numerBurtowyWpisany));
                }
            }else if (slowa[0].equalsIgnoreCase("sprawdzenie")){
                if (slowa.length==2){
                    String numerBurtowyWpisany = slowa[1];
                    System.out.println(wypozyczalnia.znajdzSprzet(numerBurtowyWpisany));
                }
            }


        }while (!komenda.equalsIgnoreCase("Wyjscie"));

    }
}
