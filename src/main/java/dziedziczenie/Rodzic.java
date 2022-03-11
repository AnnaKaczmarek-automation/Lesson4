package dziedziczenie;

public class Rodzic extends Osoba{
    private String position;

    public Rodzic(String position){

        this.position = position;
    }
    @Override
    public String myActivity(String position) {
        String myPosition;
        switch (position) {
            case "tester":
                myPosition =  "JEstem testerem";
                break;
            case "deweloper":
                myPosition =  "JEstem deweloperem";
                break;
            default:
                myPosition = "Jestem szczesliwym rodzicem";
        }
//        super.myActivity("tester");
        return myPosition;
    }

}
