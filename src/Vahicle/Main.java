package Vahicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String[]tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            Vehicle vehicle;
            if ("car".equals(type)){
                vehicle = new Vehicle("Car",model,color,horsepower);

            }else{
                vehicle = new Vehicle("Truck",model,color,horsepower);

            }vehicles.add(vehicle);

            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)){
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModelOfVehicle().equals(model)){
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }
        double carHP = printHorsepower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHP));
        double truckHP =  printHorsepower(vehicles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHP));


    }
    public static double printHorsepower(ArrayList<Vehicle> vehicles, String type){
        double sum = 0.0;
        int counter = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeVehicle().equals(type)){
                sum+= vehicle.getHorsepowerOfVehicle();
                counter++;
            }
        }
        if (counter == 0){
            return 0;
        }
        return sum/counter;
    }
}
