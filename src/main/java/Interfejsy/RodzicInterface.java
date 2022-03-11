package Interfejsy;

public class RodzicInterface implements PersonInterface {
    @Override
    public String myActivity(String position) {
        return null;
    }

    @Override
    public int averageLifeLite() {
        return PersonInterface.super.averageLifeLite();
    }

}
