package characters;
import config.Config;

import java.util.Random;

public class Knight extends Swordman {

    public Knight() {
        super(2, 12);
        this.setType(CharacterType.KNIGHT);
    }

    public void kick(NewCharacter c) {
        int punch = Config.random.nextInt(15 - 5 + 1) + 5;
        c.setHp(c.getHp() - punch);
    }

}
