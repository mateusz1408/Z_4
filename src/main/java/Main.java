// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę:");
    int liczba1 = scanner.nextInt();
    System.out.println("Podaj drugą liczbę:");
    int liczba2 = scanner.nextInt();
    System.out.println("Wybierz operację: 1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie");
    int operacja = scanner.nextInt();

    int wynik = 0;

    switch(operacja) {
      case 1:
        wynik = liczba1 + liczba2;
        break;
      case 2:
        wynik = liczba1 - liczba2;
        break;
      case 3:
        wynik = liczba1 * liczba2;
        break;
      case 4:
        if (liczba2 != 0) {
          wynik = liczba1 / liczba2;
        } else {
          System.out.println("Błąd: Dzielenie przez zero.");
          scanner.close();
          return; 
        }
        break;
    }

    System.out.println("Wynik to " + wynik);
    scanner.close();
  }
}
