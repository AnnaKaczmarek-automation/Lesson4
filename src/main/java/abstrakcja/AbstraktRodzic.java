package abstrakcja;

public class AbstraktRodzic extends Abstraktosoba{


    @Override
    protected int averageLifeLite() {
        return 90;
    }

    @Override
    public String myActivity(String position) {
        return "Jestem w klasie AbstraktRodzic";
    }
}
