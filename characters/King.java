package characters;

import config.Config;

public class King extends Swordman{
    public King(){
        super(5, 15);
        this.setType(CharacterType.KING);
    }
    public void kick(NewCharacter c) {
        int punch = Config.random.nextInt(15 - 5 + 1) + 5;
        c.setHp(c.getHp() - punch);
    }
}
