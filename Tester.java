import java.util.Scanner;
public class Tester {
		public static void main(String... args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("-----Welcome to NATUREVALLEY Homestay-----");
			System.out.println("Enter the required details to book you room");
			System.out.print("Enter the name: "); String name=sc.nextLine();
			System.out.print("Enter the Type of Room : "); String typeOfRoom=sc.next();
			System.out.print("Enter the No of extra persons : "); int noOfExtraPerson=sc.nextInt();
			System.out.print("Enter the No of days of Stay : "); int noOfDaysOfStay=sc.nextInt();
			
			RoomDetails roomOne=new RoomDetails(name, typeOfRoom, noOfExtraPerson, noOfDaysOfStay);
			System.out.println();
			System.out.println("BillId              :"+roomOne.getBillId());
			System.out.println("Customer Name       :"+roomOne.getCustomerName());
			System.out.println("No. of Days of Stay :"+roomOne.getNoOfDaysOfStay());
			System.out.println("Total Bill          :"+roomOne.calculateBill());
		}
}
