package characters;

import kickbehavior.Behavior;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

public abstract class NewCharacter {
    private int power;
    private int hp;
    private CharacterType type;
    public NewCharacter(int power, int hp, CharacterType type){
        this.power = power;
        this.hp = hp;
        this.type = type;
    }

    public abstract void kick(NewCharacter c);
    public boolean isAlive(){
        return hp > 0;
    }
}
