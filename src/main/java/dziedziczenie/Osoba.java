package dziedziczenie;

public class Osoba {

    protected static final String gatunek = "człowiek";

    private int age;

    public Osoba(int age) {
        this.age = age;
        System.out.println("Konstruktor parametrowy klasy nadrzednej");
    }

    public Osoba() {
        System.out.println("Konstruktor bezparametrowy klasy nadrzednej");
    }


    public String myActivity(String position) {
        return "Myślę więc jestem";
    }

    protected int averageLifeLite() {
        return 80;
    }
}
