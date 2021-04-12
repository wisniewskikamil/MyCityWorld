import java.util.Scanner;

public class Wybieranie {

    public static int wybor;

    public void wybieranie(){

        String wyb;

        Scanner scan = new Scanner(System.in);

        wyb = scan.nextLine();

        try {
            wybor = Integer.parseInt(wyb);
        }
        catch (NumberFormatException e)
        {
            wybor = 0;
        }
    }
}
