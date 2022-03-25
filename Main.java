import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("podaj bok a");
    int a = scan.nextInt();
       System.out.println("podaj bok b");
    int b = scan.nextInt();
    System.out.println("pole prostokąta wynosi: " + a*b );
  }
}