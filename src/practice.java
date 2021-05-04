public class practice {
    public static void main(String[] args){
        System.out.println("Hey! lets get it started");
        System.out.println();
        randomNumber();




    }
    static void randomNumber(){
        double numbers = Math.ceil(Math.random() * 100);
        System.out.println("Your welcome code is " + numbers);
        System.out.println("Don't forget ;)");
    }
}
