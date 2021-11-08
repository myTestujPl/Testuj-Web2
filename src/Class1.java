import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // to jest komentarz, tego komputer nie przeczyta

        /* wielolinijkowy
        komentarz
        jest
        tutaj
         */

        int wiekUzytkownika; // deklaracja
        wiekUzytkownika = 5;  // inicjalizacja
        System.out.println(wiekUzytkownika);

        // trzy sposoby na inkrementacje - zwiekszenie o 1
        wiekUzytkownika++;
        wiekUzytkownika = wiekUzytkownika + 1;
        wiekUzytkownika += 1;

        wiekUzytkownika--; // dekrementacja - zmniejszenie o 1

        System.out.println(wiekUzytkownika);

        int a = 5, b = 6, z = 8; //deklaracja + inicjalizacja wielu zmiennych

        Scanner scanner = new Scanner(System.in);
    }
}
