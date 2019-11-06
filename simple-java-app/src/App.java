import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public void display() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("****************************************");
        System.out.println("* Current Time: " + dtf.format(now) + " *");
        System.out.println("****************************************");
    }

    public static void main(String[] args) {
        new App().display();
    }
}

