import java.security.SecureRandom;

public class PasswordGenerator {
     public static void main(String[] args) {
          int lunghezzaPassword = 12; // Lunghezza della password desiderata
          String passwordGenerata = generatorePassword(lunghezzaPassword);
          System.out.println("Password generata: " + passwordGenerata);
     }

     public static String generatorePassword(int lunghezza) {
          String caratteri = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
          StringBuilder password = new StringBuilder();
          SecureRandom random = new SecureRandom();

          for (int i = 0; i < lunghezza; i++) {
               int index = random.nextInt(caratteri.length());
               password.append(caratteri.charAt(index));
          }
          return password.toString();
     }
}