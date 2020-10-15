package application;
import java.util.Scanner;
import entities.Data;
public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double balance;
		
		System.out.print("ENTER ACCOUNT NUMBER: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("ENTER ACCOUNT HOLDER: ");
		String name = sc.nextLine();
		System.out.print("IS THERE AN INITIAL DEPOSIT? (Y/N): ");
		char quest = sc.next().charAt(0);
		if (quest == 'y' || quest == 'Y') {
			System.out.print("ENTER INITIAL DEPOSIT VALUE: $");
			balance = sc.nextDouble();
		} else {
			balance = 0.00;
		}
		Data data = new Data(account, name, balance);
		
		System.out.println("ACCOUNT DATA:");
		System.out.println(data);
		
		System.out.printf("ENTER DEPOSIT VALUE: $");
		double deposit = sc.nextDouble();
		data.dataDeposit(deposit);
		System.out.println("UPDATE ACCOUNT DATA:");
		System.out.println(data);
		System.out.printf("ENTER WITHDRAW VALUE: $");
		double withdraw = sc.nextDouble();
		data.dataWithdraw(withdraw);
		System.out.println("UPDATE ACCOUNT DATA:");
		System.out.println(data);
		
		
		
		sc.close();
	}

}
