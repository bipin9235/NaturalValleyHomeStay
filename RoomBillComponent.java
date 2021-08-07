/*
#Task-21: NATUREVALLEY homestay provides convenient and comfort stay for visitors. The resort wants to automate
its billing process. Homestay has three different types of rooms "Standard", "Deluxe" and "Cottage". They
provide accommodation for minimum one day and maximum of 15 days.

Registration ID: JIRSS1132
Name: Bipin Kumar
*/

public interface RoomBillComponent {
	double tax=12;
	double extraPersonCharge=500;
	double foodCharge=800;
	float calculateBill();
}
