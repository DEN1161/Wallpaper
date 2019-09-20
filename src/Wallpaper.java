public class Wallpaper {
    public static void main(String[] args) {
        double roomPerimeter = 25;
        double roomHeight = 2.5;
        double rollWidth = 0.8;
        int rollLength = 10;

//How many total panels do you need for gluing a room?
        int numberOfPanels = (int) (roomPerimetr / rollWight + 1);

//How many sheets will one roll have?
        int panelsFromOneRoll = (int) (rollLength / roomHight);

//How many rolls of wallpaper will you need?
        int numberOfRolls = numberOfPanels / panelsFromOneRoll + 1;
        System.out.println("We need " + numberOfRolls + " rolls of wallpaper");
    }
}
