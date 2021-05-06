package practice;

abstract class dog {
    String breed;

    public void bark(){
        System.out.println("Bark!");
    }
}

class  dachshund extends dog{

}


public class abstractPractice {
    public static void main(String[] args){
        dachshund lucky = new dachshund();
        lucky.bark();
    }
}
