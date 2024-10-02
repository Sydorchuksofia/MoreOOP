package lotr;
import lombok.Getter;
import lombok.Setter;
import java.util.Random;

@Getter
@Setter
public class King extends Character {
    int power = random.nextInt(11) + 5;
    int hp = random.nextInt(11) + 5;
    private static final Random random = new Random();

    public King() {
        super(new KingKnightKick());
    }

}