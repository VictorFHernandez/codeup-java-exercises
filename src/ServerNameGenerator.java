public class ServerNameGenerator {

    static void randomGenerator() {

        String[] adjetives = {"big", "cool", "scary", "brave", "happy", "powerful", "fierce", "great", "small", "colossal"};
        String[] nouns = {"robot", "cat", "monkey", "state", "ocean", "bird", "army", "team", "lion", "banana"};
        String randomAdjetive = adjetives[(int) Math.floor(Math.random() * (adjetives.length - 1))];
        String randomNouns = nouns[(int) Math.floor(Math.random() * (nouns.length - 1))];
        System.out.println("Your Server name is:");
        System.out.println(randomAdjetive + "-" + randomNouns);
    }
    public static void main(String[] args){
        randomGenerator();//called it
    }
}
