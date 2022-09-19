package shilaev.MusicPlayerExample;

public class Deathcore implements Music {

    private Deathcore() {}

    public static Deathcore getDeathcoreMusic(){
        return new Deathcore();
    }

    @Override
    public String getSong() {
        return "AngelMaker - I long for rest";
    }

    void doMyInit() {
        System.out.println("INITIALIZATION");
    }

    private void doMyDestroy() {
        System.out.println("DESTROY");
    }
}
