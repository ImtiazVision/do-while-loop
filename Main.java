import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner (System.in);
	  String input = " ";
	  do {
		  System.out.println("Input: ");
		  input = scanner.next().toLowerCase();
		  System.out.println(input);
	  } while ( !input.equals("quit"));
  }
}
