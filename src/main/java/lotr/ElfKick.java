package lotr;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (attacker.getPower() > defender.getPower()) {
            defender.setHp(0);
        } else {
            defender.setHp(defender.getHp() + 1);
        }
    }
}