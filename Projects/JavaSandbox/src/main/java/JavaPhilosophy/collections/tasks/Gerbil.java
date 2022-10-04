package JavaPhilosophy.collections.tasks;

import java.util.ArrayList;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String hop(){
        String result = gerbilNumber + " and short message";
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }

        for (int i = 0; i < gerbils.size(); i++) {
            System.out.println(gerbils.get(i).hop());
        }
    }

}
