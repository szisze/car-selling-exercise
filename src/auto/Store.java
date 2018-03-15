package auto;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static ArrayList<Car> auto = new ArrayList<>();
    private static ArrayList<Motorcycle> motorbiciklik = new ArrayList<>();
    private DrivingLesson vezetesiOkatatas;


    public static void main(String[] args) {
        boolean endOfProgram = false;

        Car audi65 = new Car("Audi65", 200, 4000);
        audi65.addCar(auto, audi65);
        Motorcycle suzukiGSX = new Motorcycle("Suzuki GSX", 250, 3000);
        suzukiGSX.addMotorcycle(motorbiciklik, suzukiGSX);
        DrivingLesson vezetesiOktatas = new DrivingLesson(30, "B", 2000);

        while (!endOfProgram) {
            System.out.println("If you want to see information about our " + audi65.getName() + " press number 1.");
            System.out.println("If you want to see information about our " + suzukiGSX.getName() + " press number 2.");
            System.out.println("If you want to see information about our the driving lessons for B, press number 3.");
            System.out.println("If you want to buy " + audi65.getName() + " press number 4");
            System.out.println("If you want to buy " + suzukiGSX.getName() + " press number 5");
            System.out.println("If you want to subscribe for a driving lesson, press number 6");
            System.out.println("If you want to describe for a driving lesson, press number 7");
            System.out.println("If you don't want anything, press 8");

            Scanner keyword = new Scanner(System.in);
            int s = keyword.nextInt();

            if (s == 1) {
                System.out.println(audi65.getInformation());
            } else if (s == 2) {
                System.out.println(suzukiGSX.getInformation());
            } else if (s == 3) {
                System.out.println(vezetesiOktatas.getInformation());
            } else if (s == 4) {
                if (searchForItemsInArrayListCar(auto, audi65)) {
                    System.out.println("Successfully sold " + audi65.getName());
                    audi65.removeCar(auto, audi65);
                } else {
                    System.out.println("Sorry in stock don't have " + audi65.getName());
                }
            } else if (s == 5) {
                if (searchForItemsInArrayListMotorcycle(motorbiciklik, suzukiGSX)) {
                    System.out.println("Successfully sold " + suzukiGSX.getName());
                    suzukiGSX.removeMotorcycle(motorbiciklik, suzukiGSX);
                } else {
                    System.out.println("Sorry in stock don't have " + suzukiGSX.getName());
                }
            } else if (s == 6) {
                vezetesiOktatas.subscribeToALesson();
            }else if(s == 7)
            {
                vezetesiOktatas.finishALesson();
            }
            else if (s == 8) {
                endOfProgram = true;
            } else {
                System.out.println("Bad character, try again!");
            }

        }

    }

    public static boolean searchForItemsInArrayListCar(ArrayList<Car> autos, Car auto) {

        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i) == auto) {
                return true;
            } else {
                return false;
            }

        }

        return false;

    }

    public static boolean searchForItemsInArrayListMotorcycle(ArrayList<Motorcycle> motorbiciklik, Motorcycle motorbicikli) {

        for (int i = 0; i < motorbiciklik.size(); i++) {
            if (motorbiciklik.get(i) == motorbicikli) {
                return true;
            } else {
                return false;
            }

        }

        return false;

    }
}
