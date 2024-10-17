import java.util.ArrayList;
import java.util.Random;

public class Player  {
    private Random random;
    private String name;
    private String position;
    private double salary;
    private double PPG;
    private double height;
    private double wingSpan;
    private double weight;
    private double reach;


    public Player( String position, double height, double weight, double reach) {
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.reach = reach;
    }
    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }

    public double getHeight() {
        return height;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public double getWeight() {
        return weight;
    }
    public double getReach() {
        return reach;
    }

    private double randomInRange(double min, double max) {
        return min + (max - min) * random.nextDouble(); // Use initialized random object
    }


    //Generates Player Heights depending on the probabilities.
    private double generateHeight()
    {
        double rand = random.nextDouble() * 100; // Random value between 0-100
        double height = 0;

        if (rand<=1.5){
            height=randomInRange(70,72); //5'10 to 6'0
        }
        else if(rand >= 30 && rand<=35){
            height= randomInRange(72,76); //6'0 to 6'4
        }
        else if (rand>= 40 && rand<= 45){
            height = randomInRange(78, 82.8);
        }
        else if (rand>= 20 && rand<= 25){
            height = randomInRange(73.2, 85.2);
        }
        else if (rand>= 1 && rand<= 3){
            height = randomInRange(88.8, 93.6);
        }
        return height;
    }

    public Player generatePlayer(int playerNumber){
        double height=generateHeight();
        String position = null;
        double weight=0;
        double reach=0;

        if (height>= 70 && height<= 72){
            weight= randomInRange(160, 190);
            reach= randomInRange(72, 78);
            position= "G";
        }
        else if (height> 72 && height<= 76){
            weight= randomInRange(180, 220);
            reach= randomInRange(78, 84);
            position= "G";
        }
        else if (height>76 && height<= 81){
            weight= randomInRange(200, 240);
            reach= randomInRange(86, 90);
            position = "F";
        }
        else if (height> 81 && height<= 85){
            weight= randomInRange(220, 270);
            reach= randomInRange(86, 90);
            position= "C";
        }
        else if (height> 85){
            weight= randomInRange(230, 300);
            reach= randomInRange(88, 92);
            position= "C";
        }
        return new Player(position,height, weight,reach);
    }
    public void generatePlayers(){
        for (int i=0; i<15; i++){
            Player player = generatePlayer(i+1);

        }
    }
}
