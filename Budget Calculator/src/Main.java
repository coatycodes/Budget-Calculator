import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("How much is your monthly income?");
				String a = scanner.next();
				
				double n1=Double.parseDouble(a);
				
				double rent = n1*25/100;
				double food = n1*10/100;
				double insu = n1*2.5/100;
				double tran = n1*2.5/100;
				double save = n1*35/100;
				double heal = n1*5/100;
				double ente = n1*10/100;
				double pers = n1*10/100;
				
				System.out.println("These are your monthly limits.");
				System.out.println("Rent: $"+rent);
				System.out.println("Food: $"+food);
				System.out.println("Insurance: $"+insu);
				System.out.println("Transportation: $"+tran);
				System.out.println("Savings: $"+save);
				System.out.println("Health: $"+heal);
				System.out.println("Entertainment: $"+ente);
				System.out.println("Personal: $"+pers);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
			
			
			
			
			

	}

}
