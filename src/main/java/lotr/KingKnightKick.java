package lotr;

import java.util.Random;

public class KingKnightKick implements KickStrategy {
    private final Random random = new Random();

    @Override
    public void kick(Character attacker, Character defender) {
        defender.setHp(defender.getHp() - (random.nextInt(attacker.getPower())+1));
    }
}