package lotr;

import java.util.Random;

public class CharacterFactory {
    Random rand = new Random();
    int i = rand.nextInt(4);

    public Character createCharacter() {
        switch (i) {
            case 0:
                Character res1 = new Hobbit();
                return res1;
            case 1:
                Character res2 = new Elf();
                return res2;
            case 2:
                Character res3 = new King();
                return res3;
            case 3:
                Character res4 = new Knight();
                return res4;
        }
        return null;
        
    }
}