public class Main {

    public static void main(String[] args) {
        User[] users = new User[3];

        users[0] = new User("Michael");
        users[1] = new User("Brandon");
        users[2] = new User("Joey");

        users[0].addTask("Clean house");
        users[0].addTask("Finish group Sprint");
        users[0].addTask("Feed cats");

        users[1].addTask("Take blood pressure meds");
        users[1].addTask("Get power");
        users[1].addTask("Wake up and play WoW");

        users[2].addTask("Clean desk");
        users[2].addTask("Feed budgies");
        users[2].addTask("Fix the car");

        users[0].markTaskAsCompleted("Finish group Sprint");
        users[2].markTaskAsCompleted("Clean desk");
        users[1].markTaskAsCompleted("Take blood pressure meds");

        System.out.println("  TO-DO Lists  ");
        for (int i = 0; i < users.length; i++) {
            users[i].printAllTasks();
        }
    }
}
