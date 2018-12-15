package characters;

import config.Config;
import kickbehavior.Behavior;
import kickbehavior.OrdinaryBehavior;
import kickbehavior.RandomBehavior;

public class Swordman extends NewCharacter {
    public Swordman(int min, int max){
        super(Config.random.nextInt(max - min + 1) + min, Config.random.nextInt(max - min + 1) + min, CharacterType.SWORDMAN);

    }

    public void kick(NewCharacter c) {
        this.kick(c);
    }
}
