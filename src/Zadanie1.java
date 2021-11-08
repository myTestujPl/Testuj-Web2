import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        // przywitanie
        // zapytaj ile użytkownik ma lat

        System.out.println("Hello user!");
        System.out.println("How old are you?");

        // zapisz liczbę lat do zmiennej
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        // wyświetl napis, w którym podasz użytkownikowi ile lat będzie miał w przyszłym roku
        age++;
        System.out.println("Next year you will be "+age+ " years old");


        String text = "moj tekst";
        System.out.println("text");
        System.out.println(text);
    }
}
