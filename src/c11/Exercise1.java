package c11;

import java.util.ArrayList;

/**
 * Created by SuSong on 2015-01-11 1:02.
 */

class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    @Override
    public String toString() {
        return "Gerbil " + gerbilNumber;
    }

    void hop() {
        System.out.println(this +" is hopping");

    }
}

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i=0;i<5;i++){
            gerbils.add(new Gerbil(i));
        }

        for(Gerbil g:gerbils){
            g.hop();
        }
    }
}
