import java.util.*;
public class Fuel {
	public void main(String arg[]){
		System.out.println("PREFERRED CONVERSION:");
		System.out.println("1.kpl to mpg");
		System.out.println("2.mpg to kpl");
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your choice(1 or 2):");
		int MyChoice = reader.nextInt();
		System.out.println("Enter miles per gallon value:");
		int Value=reader.nextInt();
		
		if(MyChoice==1){
			System.out.println("The equivalent kiometres per litre is:"+(Value*1.609)/3.785);
		}
		if(MyChoice==2){
			System.out.println("The equivalent kiometres per litre is:"+(Value/1.609)*3.785);
		}
		
	}

}
