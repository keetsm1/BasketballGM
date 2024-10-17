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


    public Player(String name, String position, double height, double weight, double reach) {
        this.name = name;
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

    private double randomInRange(int min, int max) {
        return min + (max - min) * random.nextDouble(); // Use initialized random object
    }

    private double generateHeight(){
        double rand = random.nextDouble() * 100; // Random value between 0-100
        double height = 0;

        if (rand<=1.5){
            height=randomInRange(70,72); //5'10 to 6'0
        }
        else if(rand >= 30 && rand<=35){
            height= randomInRange(72,76); //6'0 to 6'4
        }
        else if (rand>= 40 && rand<= 45){
            height = randomInRange();
        }
    }
}
