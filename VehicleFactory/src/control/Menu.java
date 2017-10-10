package control;
import java.io.IOException;
import java.util.Scanner;

import model.Bridge.VehicleCommand;
import model.eNums.*;
import model.concreteClasses.*;
public class Menu {
	
	
	public void start() throws IOException {
		boolean isMenuOver = false;
		int userInput = 0;
		System.out.println("Enter selection.");
		Scanner reader = new Scanner(System.in);
		while(!isMenuOver) {
			
			showFirstMenu();
			userInput = reader.nextInt();
			switch(userInput) {
				case	1 : 	
					ElectricCar electricCar = (ElectricCar) VehicleCommand.orderBuild(eVehicleTypes.ELECTRICCAR);
					electricCar.show();
					break;
						
				case	2	:	
					SportCar sportCar = (SportCar) VehicleCommand.orderBuild(eVehicleTypes.SPORTCAR);
					sportCar.show();
					break;
				case	3	:
					SportMotorcycle sportMotorcycle = (SportMotorcycle) VehicleCommand.orderBuild(eVehicleTypes.SPORTMOTORCYCLE);
					sportMotorcycle.show();
					break;
				case	4	:
					FieldMotorcycle fieldMotorcycle = (FieldMotorcycle) VehicleCommand.orderBuild(eVehicleTypes.FIELDMOTORCYCLE);
					fieldMotorcycle.show();
					break;
				case	5 :
					HoverMotorcycle hoverMotorcycle = (HoverMotorcycle) VehicleCommand.orderBuild(eVehicleTypes.HOVERMOTORCYCLE);
					hoverMotorcycle.show();
					break;
				case	6	:
					HoverCar hoverCar = (HoverCar) VehicleCommand.orderBuild(eVehicleTypes.HOVERCAR);
					hoverCar.show();
					break;
				case	7	:
					FieldTruck fieldTruck = (FieldTruck) VehicleCommand.orderBuild(eVehicleTypes.FIELDTRUCK);
					fieldTruck.show();
					break;
				case	8	:
					HoverTruck hoverTruck = (HoverTruck) VehicleCommand.orderBuild(eVehicleTypes.HOVERTRUCK);
					hoverTruck.show();
					break;
				default :
					isMenuOver = true;
					System.out.println("Menu Done, press ENTER to end.");
					System.in.read();
					reader.close();
					break;
			}
				
		}
	}
	
	private void showFirstMenu() {
		int i =1;
		for(eVehicleTypes carType : eVehicleTypes.values()) {
			System.out.println(i + ". " + carType.toString());
			i++;
			
		}
		System.out.println(i + ". EXIT");
	}
}
