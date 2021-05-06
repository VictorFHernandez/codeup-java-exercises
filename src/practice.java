import java.util.Scanner;
interface waterBottle {

    String color = "green";
    public void fillup();
    public void pourOut();
}




public class practice implements waterBottle{

    public static void main(String[] args){
        System.out.println("Hey! lets get it started");
        System.out.println();
        randomNumber();
        System.out.println("having fun? | yes or no |");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.print("you've entered " + input);
        System.out.println();
        System.out.println(color);
        practice water = new practice();
        water.fillup();
        practice pour = new practice();
        pour.pourOut();

    }
    static void randomNumber(){
        double numbers = Math.ceil(Math.random() * 100);
        System.out.println("Your welcome code is " + numbers);
        System.out.println("Don't forget!");
    }

    @Override
    public void fillup() {
        System.out.println("Filled up the Water Bottle");

    }

    @Override
    public void pourOut() {
        System.out.println("Pours out the water");
    }


}
