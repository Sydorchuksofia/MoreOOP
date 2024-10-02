package lotr;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Knight extends Character {
    int power = random.nextInt(11) + 2;
    int hp = random.nextInt(11) + 2;
    private static final Random random = new Random();

    public Knight() {
        super(new KingKnightKick());
    }
}