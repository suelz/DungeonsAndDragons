import java.util.Random;

public class Dice {

    //Takes input as number of sides of a die
    //IE D4, D6, D8, D10, D12, D20
    public static int dice(int sides){
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    //Roll D6 4 times and sum for starting stat roll
    public static int statRoll(){
        int value = 0;
        for(int i = 0; i < 4; i++){
            value += dice(6);
        }
        return value;
    }
}
