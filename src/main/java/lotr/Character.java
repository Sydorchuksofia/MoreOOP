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
        return hp > 0;
    }
    
    public void setHp(int i) {
        this.hp = Math.max(0, i);
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

}