package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
    Rower rowerPierwszy = new Rower();
    Rower rowerDrugi = new Rower();

    rowerPierwszy.start();
    rowerDrugi.start();

    rowerDrugi.przyspiesz(50);

    rowerPierwszy.wyswietlStan();
    rowerDrugi.wyswietlStan();

    rowerDrugi.stop();

    rowerDrugi.wyswietlStan();
    }
}

class Rower {
    boolean wRuchu;
    int predkosc;


    public void start() {
        wRuchu = true;
        predkosc = 0;
    }

    public void stop() {
        wRuchu = false;
        predkosc = 0;
    }

    public void przyspiesz(int nowaPredkosc) {
        predkosc = nowaPredkosc;
    }

    public void wyswietlStan() {
        System.out.println("Obecny stan");
        System.out.println("Predkosc wynosi " + predkosc);
        System.out.println("Czy rower jest w ruchu? " + (wRuchu ? "Tak" : "Nie"));
    }
}
*/

        /*
        KontoBankowe rachunek = new KontoBankowe();

        rachunek.pokazSaldo();

        rachunek.kredyt(100);

        rachunek.pokazSaldo();

        rachunek.debet(50);

        rachunek.pokazSaldo();
    }
}
class KontoBankowe {
    private int saldo = 0;

    public void pokazSaldo(){
        System.out.println("Saldo wynosi: " + saldo);
    }

    public void kredyt(int ilosc){
        saldo += ilosc;
    }

    public void debet(int ilosc){
        saldo -= ilosc;
    }
}

         */

        /*
    KoszykProduktow koszyk = new KoszykProduktow();

        koszyk.dodajProduktDoKoszyka("P1");
        koszyk.dodajProduktDoKoszyka("P2");
        koszyk.dodajProduktDoKoszyka("P3");

        koszyk.pokazZamowienie();


    }
}

class KoszykProduktow{
    private LinkedList produkty = new LinkedList();

    public void dodajProduktDoKoszyka(String produkt){
        produkty.add(produkt);
    }

    public void pokazZamowienie(){
        System.out.println("Zamowione produkty: ");
        System.out.println(produkty);
    }
}

         */



    }
}

class Punkt{
   int x;
   int y;

    @Override
    public String toString() {
        return super.toString();
    }

    Punkt(){
        x = 1;
        y = 1;
    }
}

class Linia{

}