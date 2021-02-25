import com.services.appworker.Home;

public class App {

    public App() {
        //This is header of the App
        System.out.println("=========================");
        System.out.println("======= WELCOME =========");
        System.out.println("THIS IS BASIC CLI APP");
        Home hm = new Home();
    }

    public static void main(String[]args) {
        new App();
    }

}
