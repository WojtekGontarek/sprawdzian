import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Przedmiot informatyka = new Przedmiot("informatyka");
        Przedmiot matematyka = new Przedmiot("matematyka");
        Przedmiot biologia = new Przedmiot("biologia");
        Przedmiot chemia = new Przedmiot("chemia");
        Przedmiot geografia = new Przedmiot("geografia");
        ArrayList<Przedmiot> przedmioty = new ArrayList<>();
        przedmioty.add(informatyka);
        przedmioty.add(matematyka);
        przedmioty.add(biologia);
        przedmioty.add(chemia);
        przedmioty.add(geografia);



        Student Marek = new Student("Marek", "Towarek","2137", 3, przedmioty);
        Student Mateusz = new Student("Mateusz", "Nowak","2333", 2, przedmioty);
        Student Kamil = new Student("Kamil", "Kakol","3333", 1, przedmioty);
        Student Monika = new Student("Monika", "Kowalska","55555", 4, przedmioty);
        System.out.println(przedmioty);
    }
}