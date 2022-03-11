package dziedziczenie;

public class Dziecko extends Osoba {

    private String position;

    public Dziecko(String position) {
        this.position = position;
    }


    @Override
    public String myActivity(String position) {
        String myPosition;
        switch (position) {
            case "uczen":
                myPosition =  "JEstem uczniem";
                break;
            case "student":
                myPosition =  "JEstem studentem";
                break;
            default:
                myPosition = "Jestem szczesliwym dzieckiem i mieszkam z rodzicami ";
        }
        return myPosition;
    }

}
