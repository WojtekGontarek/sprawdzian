import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private final String imie;
    private final String nazwisko;
    private final String numer_indeksu;
    private int rok_studiow;
    private ArrayList<Przedmiot> lista_przedmiotow;

    public Student(String imie, String nazwisko, String numer_indeksu, int rok_studiow, ArrayList<Przedmiot> lista_przedmiotow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_indeksu = numer_indeksu;
        this.rok_studiow = rok_studiow;
        this.lista_przedmiotow = lista_przedmiotow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumer_indeksu() {
        return numer_indeksu;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public ArrayList<Przedmiot> getLista_przedmiotow() {
        return lista_przedmiotow;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", imie, nazwisko, numer_indeksu, rok_studiow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rok_studiow == student.rok_studiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(numer_indeksu, student.numer_indeksu) && Objects.equals(lista_przedmiotow, student.lista_przedmiotow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numer_indeksu, rok_studiow, lista_przedmiotow);
    }
    public void dodajPrzedmiotDoListy(Przedmiot przedmiot){
        lista_przedmiotow.add(przedmiot);
    }

}
