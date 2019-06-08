package java26.zad1.zad1.zad1;

import lombok.Data;

@Data
public class Student {
    private long numerIndeksu;
    private String imie, nazwisko;

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public Student(long numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public Student(){}

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
