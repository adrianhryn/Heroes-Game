package characters;

public class Hobbit extends NewCharacter{
    public Hobbit(){
        super(0, 3, CharacterType.HOBBIT);
    }

    public void kick(NewCharacter c) {
        toCry();
    }
    private void toCry(){
        System.out.println("'Cry, cry, cry!'");
    }
}
