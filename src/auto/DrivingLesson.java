package auto;

public class DrivingLesson extends Item {
// TODO: code format and method ordering
    private String vehiclesType;
    private int lengthOfTheLesson;
    private static int maxAccept = 10;


    public String getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(String vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public int getLengthOfTheLesson() {
        return lengthOfTheLesson;
    }

    public void setLengthOfTheLesson(int lengthOfTheLesson) {
        this.lengthOfTheLesson = lengthOfTheLesson;
    }

    public int getMaxAccept() {
        return maxAccept;
    }

    public void setMaxAccept(int maxAccept) {
        this.maxAccept = maxAccept;
    }


    @Override
    public String getInformation() {
        return "Driving lesson informations : " + "\n" +
                "'" + getVehiclesType() + "'" + " this type of vehicle works" + "\n" +
                "It take " + getLengthOfTheLesson() + " hour" + "\n" +
                "Maximum applicants they accept " + getMaxAccept() + "\n" +
                "Driving lessons price are " + getPrice() + " Ron";
    }

    public DrivingLesson(int setLengthOfTheLesson, String setVehiclesType, int setPrice) {

        setLengthOfTheLesson(setLengthOfTheLesson);
        setVehiclesType(setVehiclesType);
        setPrice(setPrice);

    }

    public static void subscribeToALesson() {
        if(maxAccept ==0)
        {
            System.out.println("Sorry, we don't have anymore place!");
        }else{
    // TODO is not right to modify the maxAccept parameter. That should indicate the nr of total possible subscriptions for the store
    // count the filled in places in a separate variable
        maxAccept = maxAccept - 1;
        System.out.println(maxAccept);
        System.out.println("Now you have "+ maxAccept+ " place");}
    }

    public static void finishALesson() {
        // TODO please rethink this implementation. you shouldn't have hardcoded values inside a function.
        if (maxAccept >= 10) {
            System.out.println("We don'T have mor place!");
        } else {
            maxAccept = maxAccept + 1;
            System.out.println("Now you have "+ maxAccept+ " place");
        }

    }
}
