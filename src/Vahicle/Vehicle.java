package Vahicle;

public class Vehicle {

    private String typeVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public Vehicle(String typeVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeVehicle = typeVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    @Override
    public String toString(){
        String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", typeVehicle,modelOfVehicle,colorOfVehicle,horsepowerOfVehicle);
        return result;
    }
}
