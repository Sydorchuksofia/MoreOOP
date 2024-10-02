package lotr;

public class HobbitKick implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        Hobbit.toCry();
    }
}