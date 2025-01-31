import java.util.*;
class ElectricBill{
public static void main(String[] args){
int units,charge,amount;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter the meter number:");

int meterNo=scannernextInt();
System.out.println("Enter the Previous Bill:");
int previous=scanner.nextInt();
System.out.println("Enter the current Bill:");
int present=scanner.nextInt();
if(previous<present){
units=present-previous;
System.out.println("units is:"+units)
  if(units>0 && units<=100){
 	charge=2;
         }
	else if(units>100 && units<=200){
	charge=4;
	}
	else{
	charge=5;
	}
System.out.println("Charge is :"+charge);

amount=units*charge;
System.out.println("The amount of bill is "+amount);

  

}
  else{
	System.out.println("Enter the valid data");
}

}

}
