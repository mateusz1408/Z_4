// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int liczba1= scanner.nextInt();
    int liczba2= scanner.nextInt();
    int operacja= scanner.nextInt();

    int wynik=0;

    switch(operacja){
      case 1:
        wynik=liczba1+liczba2;
        break;
      case 2:
        wynik=liczba1-liczba2;
        break;
      case 3:
        wynik=liczba1*liczba2;
        break;
      case 4:
        wynik=liczba1/liczba2;
        break;
        
       }
    System.out.println("wynik to " + wynik);
  
    
  }

  
}