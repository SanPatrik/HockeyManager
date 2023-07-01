public class Main {
    public static void main(String[] args) {
        HockeyManager manager = new HockeyManager();

        manager.addNewForward("John", 25, 20);
        manager.addNewDefender("Mike", 27, 50);
        manager.addNewGoalie("Tom", 19, 15);

        manager.printNameAndAgeOfTheYoungestPlayer();
    }
}