public class ControlFlowExercises {
    public static void main(String[] args){

        /* Exercise 1 part A:

        int i = 5;
        while(i <= 15){
            System.out.println("i is " + i);
            i++;
        } */


        /* Exercise 1 Part B-1:

        int maxNumber = 100;
        int count = 0;
        do{
            System.out.println(count += 2);
        }while(count < maxNumber);
        */

        /* Exercise 1 Part B-2:

        int maxNum = 105;
        int minNum = -10;
        do{
            System.out.println(maxNum -= 5);
        }while(maxNum > minNum);
        */

        long startingNumber = 2;
        long leMillion = 1000000;
        do{
            System.out.println(startingNumber);
            startingNumber *= startingNumber;
        }while (startingNumber < leMillion);



    }
}
