package lotr;
import lombok.Setter;

@Setter
public class Elf extends Character {
    public Elf() {
        super(new ElfKick());
        this.power = 10;
        this.hp = 10;
    }
    
}