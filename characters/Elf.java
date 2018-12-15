package characters;

public class Elf extends NewCharacter{
    public Elf(){
        super(10, 10, CharacterType.ELF);
    }

    public void kick(NewCharacter c) {
        if (this.getPower() > c.getPower() || c.getType() == CharacterType.ELF){
            c.setHp(0);
        }else{
            c.setPower(c.getPower()-1);
        }
    }
}
