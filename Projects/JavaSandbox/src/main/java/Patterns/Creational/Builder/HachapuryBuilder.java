package Patterns.Creational.Builder;

public class HachapuryBuilder implements BakeBuilder {
    private String Hachahpury = "";

    public String getHachahpury() {
        return Hachahpury;
    }

    @Override
    public void setBase(String Hachahpury) {
        Hachahpury += "|Hachahpury: " + Hachahpury + "|" + "\n";
    }

    @Override
    public void setStuff(String stuff) {
        Hachahpury += "|stuff: " + stuff + "|" + "\n";
    }

    @Override
    public void bake(int bakeTime) {
        Hachahpury+= "|bake time: " + bakeTime + "|" + "\n";
    }
}
