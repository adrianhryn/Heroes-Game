import characters.*;
import gamemanager.GameManager;

public class Main {
    public static void main(String args[]){
        NewCharacter ch1 = new CharacterFactory().createCharacter();
        NewCharacter ch2 = new CharacterFactory().createCharacter();
        GameManager game = new GameManager();
        game.fight(ch1, ch2);
    }
}
