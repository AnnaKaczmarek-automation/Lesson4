package Interfejsy;

public interface PersonInterface {
//nie mozna tworzyc obiektów, tak jak w abstrakcji
//nie powie jak zrobic, tylko co masz zrobić

    public static final String gatunek = "człowiek";

    public String myActivity(String position);

    public default int averageLifeLite() {
        return 80;
    }
}