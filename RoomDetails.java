
public class RoomDetails implements RoomBillComponent{
	
	String customerName;
	String typeOfRoom;
	int  noOfExtraPerson;
	int noOfDaysOfStay;
	int counter=1000;
	int  billId=counter++;
	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPerson, int noOfDaysOfStay) {
		super();
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPerson = noOfExtraPerson;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	int getBillId() {
		return billId;
	}
	String getCustomerName() {
		return customerName;
	}
	String getTypeOfRoom() {
		return typeOfRoom;
	}
	int getNoOfExtraPersons() {
		return noOfExtraPerson;
	}
	int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
	boolean validateNoOfDaysOfStay() {
		if(noOfDaysOfStay<=15) {
			return true;
		}
		else {
			System.out.println("Sorry!  we are not providing room for more than 15 days ");
			return false;
		}
			
	}
	boolean validateNoOfExtraPerson() {
		if(noOfExtraPerson<=2)
			return true;
		else {
			System.out.println("Sorry! we are provinding a room for only upto 2 extra persons please book another room");
			return false;
		}
			
	}
	boolean validateTypeOfRoom() {
		boolean value;
		switch(typeOfRoom) {
		case "Standard": value=true;
							break;
							
		case "Deluxe": value=true;
						break;
						
		case "Cottage": value=true;
						break;
		default : value=false;
		}
		if(value) {
			return value;
		}
		else {
			System.out.println("Sorry! no such room available please try with proper room type");
			return value;
		}
		
	}
	public float calculateBill() {
		float totalBill=0;
		if(validateTypeOfRoom()) {
			if(validateNoOfDaysOfStay()) {
				if(validateNoOfExtraPerson()) {
					double baseRoomFare=0;
					switch(typeOfRoom) {
					case "Standard": baseRoomFare=2500;
									 break;
					case "Deluxe"  : baseRoomFare=3500;
									 break;
					case "Cottage" : baseRoomFare=5500;
									 break;
					default        : System.out.println("Invalid! type of room");
					}
					double bill;
					bill = (noOfDaysOfStay*baseRoomFare) + noOfDaysOfStay*foodCharge + noOfExtraPerson*extraPersonCharge;
					totalBill = (float)(bill + tax*bill/100);
				}
			}
		}
		return totalBill;
		
	}
}
