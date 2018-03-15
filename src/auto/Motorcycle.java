package auto;

import java.util.ArrayList;

public class Motorcycle extends Vehicles {


    @Override
    public String getInformation() {
        return "Motorcycle informations : " + "\n" +
                "The motorcycles name is = " + getName() + "\n" +
                "The motorcycles max speed = " + getMaxSpeed() + "\n" +
                "The motorcycles price is = " + getPrice() + " Ron";
    }

    public Motorcycle() {
    }

    public Motorcycle(String setName, int setMaxSpeed, int setPrice) {
        setName(setName);
        setMaxSpeed(setMaxSpeed);
        setPrice(setPrice);

    }

    public static void addMotorcycle(ArrayList<Motorcycle> motorbiciklik, Motorcycle motorbicikli) {
        motorbiciklik.add(motorbicikli);

    }

    public static void removeMotorcycle(ArrayList<Motorcycle> motorbiciklik, Motorcycle motorbicikli) {
        motorbiciklik.remove(motorbicikli);
    }
}
