package auto;

import java.util.ArrayList;

public class Car extends Vehicles {

    @Override
    public String getInformation() {
        return getName() + " informations : " + "\n" +
                "The car name is = " + getName() + "\n" +
                "The car max speed = " + getMaxSpeed() + "\n" +
                "The car price is = " + getPrice() + " Ron";
    }

    public Car() {
    }

    public Car(String setName, int setMaxSpeed, int setPrice) {
        setName(setName);
        setMaxSpeed(setMaxSpeed);
        setPrice(setPrice);

    }

    public static void addCar(ArrayList<Car> auto, Car autos) {
        auto.add(autos);

    }

    public static void removeCar(ArrayList<Car> auto, Car autos) {
      auto.remove(autos);
    }


}
