public class Class3 {

    static String hello = "hello"; //zmienna globalna

    public static void main(String[] args) {

        printHello();

        String name = "Ania";
        printName(name);

        printName("Kamil");
        printName("Asia");

    }

    public static void printHello() { //nic nie zwraca, nie przyjmuje argumentów
        System.out.println(hello);
    }

    public static void printName(String name) { // nic nie zwraca, przyjmuje jeden argument
        System.out.println("Hello " + name);
    }

    //zla praktyka
    public static double sum(double firstNumber, double secondNumber){
        double sum = firstNumber+secondNumber; // niepotrzebnie zadeklarowana zmienna - zjada nam pamięć
        return sum;
    }

    //dobra praktyka
    public static double sum2(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }


}
