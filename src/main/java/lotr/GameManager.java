package lotr;
public class GameManager {
    public void fight(Character a, Character d) {
        System.out.println("The fight begins between " + a.getClass().getSimpleName() + " and " + d.getClass().getSimpleName());
        while (a.isAlive() && d.isAlive()){
            System.out.println(a.getClass().getSimpleName() + " kicks " + d.getClass().getSimpleName());
            a.kick(d);
            if (!d.isAlive()) {
                System.out.println(a);
                System.out.println(d);
                System.out.println(d.getClass().getSimpleName() + " is dead!");
                break;
            }
            System.out.println(d.getClass().getSimpleName() + " kicks " + a.getClass().getSimpleName());
            d.kick(a);
            if (!a.isAlive()) {
                System.out.println(a);
                System.out.println(d);
                System.out.println(a.getClass().getSimpleName() + " is dead!");
                break;
            }
        }
    }
}