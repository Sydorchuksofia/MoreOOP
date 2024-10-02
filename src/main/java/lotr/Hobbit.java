package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hobbit extends Character {
    public Hobbit() {
        super(new HobbitKick());
        this.power = 0;
        this.hp = 3;
    }

    public static void toCry() {
        System.out.println("Hobbit is crying...");
    }
}