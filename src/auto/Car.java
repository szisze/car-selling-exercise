package auto;
// TODO please modify the package names to src.auto - to make the code compile (or to the src.main.auto standard)

import java.util.ArrayList;

public class Car extends Vehicles {
// TODO please refactor the code: remove empty lines;
// keep the order of the variables/methods in a class: constants, global vars, constructors, other methods

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

    // TODO using a static method here doesn't make sens. (explain why not?) And fix it. :)
    // TODO using a list as a parameter is not bad, but is this method really related to this class? Please try to argue about this...
    public static void addCar(ArrayList<Car> auto, Car autos) {
        auto.add(autos);

    }

    public static void removeCar(ArrayList<Car> auto, Car autos) {
      auto.remove(autos);
    }


}
