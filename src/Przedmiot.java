import java.util.Objects;

public class Przedmiot {
    private String nazwa_przedmiotu;
    private int liczba_punktow_ECTS;

    public Przedmiot(String nazwa_przedmiotu) {
        this.nazwa_przedmiotu = nazwa_przedmiotu;
        liczba_punktow_ECTS = 5;
    }

    public Przedmiot() {
        nazwa_przedmiotu = "przedmiot bez nazwy";
        liczba_punktow_ECTS = 5;
    }

    public String getNazwa_przedmiotu() {
        return nazwa_przedmiotu;
    }

    public void setNazwa_przedmiotu(String nazwa_przedmiotu) {
        this.nazwa_przedmiotu = nazwa_przedmiotu;
    }

    public int getLiczba_punktow_ECTS() {
        return liczba_punktow_ECTS;
    }

    public void setLiczba_punktow_ECTS(int liczba_punktow_ECTS) {
        this.liczba_punktow_ECTS = liczba_punktow_ECTS;
    }

    @Override
    public String toString() {
        return String.format("%s-%d", nazwa_przedmiotu, liczba_punktow_ECTS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return liczba_punktow_ECTS == przedmiot.liczba_punktow_ECTS && Objects.equals(nazwa_przedmiotu, przedmiot.nazwa_przedmiotu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa_przedmiotu, liczba_punktow_ECTS);
    }


}
