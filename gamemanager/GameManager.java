package gamemanager;

import characters.CharacterType;
import characters.NewCharacter;

public class GameManager {
    public void fight(NewCharacter first, NewCharacter second){
        System.out.println("The first character is " + first.getType() + ". His hp: " + first.getHp() + " and his " +
                "power: " + first.getPower());
        System.out.println("The second one is " + second.getType() + ". His hp: " + second.getHp() + " and his " +
                "power: " + second.getPower());
        String firstName;
        String secondName;
        if (first.getType() == second.getType()){
            firstName = "Blue " + first.getType();
            secondName = "Red " + second.getType();
        }else{
            firstName = "" + first.getType();
            secondName = "" + second.getType();
        }
        System.out.println("Let's the battle begin!!");
        if (first.getType() == CharacterType.HOBBIT && second.getType() == CharacterType.HOBBIT){
            second.setHp(0);
            System.out.println(firstName + " kicks " + secondName);
            first.kick(second);
            System.out.println("The " + secondName + " is scared to death");
        }
        int i = 1;


        while(first.isAlive() && second.isAlive()){
            System.out.println("ROUND " + i);
            if (i > 0)
            {
                System.out.println("The " + firstName + " has " + first.getHp() + " hp left and his power " +
                        "is " + first.getPower());
            }
            System.out.println(firstName + " kicks the " + secondName);
            first.kick(second);


            if (second.getHp() > 0){
                System.out.println("The " + secondName + " has " + second.getHp() + " hp left and his power " +
                        "is " + second.getPower());
                System.out.println(secondName + " kicks the " + firstName);
                second.kick(first);
            } else{
                second.setHp(0);
            }
            i += 1;
            if (i > 11){
                if (first.getPower() > second.getPower()){
                    first.setHp(0);
                    System.out.println("The " + firstName + " is died from bored");
                }else{
                    second.setHp(0);
                    System.out.println("The " + secondName + " is died from bored");
                }
            }
            System.out.println("_____________________________");
        }
        if  (first.getHp() <= 0){
            System.out.println("The " + firstName + " is died." + " The " + secondName + " wins");
        }
        if (second.getHp() <= 0){
            System.out.println("The " + secondName + " is died." + " The " + firstName + " wins");
        }
        System.out.println("THE END");
    }
}
