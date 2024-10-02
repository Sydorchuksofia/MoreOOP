package lotr;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {

    int power;
    int hp;
    protected KickStrategy kickStrategy;

    public Character(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character d) {
        kickStrategy.kick(this, d);
    }

    public boolean isAlive() {
        return hp>0;
    }

}