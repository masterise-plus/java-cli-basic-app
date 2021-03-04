import com.services.appworker.Menu;

public class App {

    public App() {
        //This is header of the App
        System.out.println("=========================");
        System.out.println("======= WELCOME =========");
        System.out.println("THIS IS BASIC CLI APP");
        Menu mn = new Menu();
    }

    public static void main(String[]args) {
        new App();
    }

}
