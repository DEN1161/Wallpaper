public class Wallpaper {
    public static void main(String[] args) {
        int roomPerimetr = 25;
        double roomHight = 2.5;
        double rollWight = 0.8;
        int rollLength = 10;

//How many total panels do you need for gluing a room?
        int numberOfPanels = (int) (roomPerimetr / rollWight);

//How many sheets will one roll have?
        int panelsFromOneRoll = (int) (rollLength / roomHight);

//How many rolls of wallpaper will you need?
        int numberOfRolls = numberOfPanels / panelsFromOneRoll;
        System.out.println("We need " + numberOfRolls + " rolls of wallpaper");
    }
}
