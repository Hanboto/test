import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class smekalka {
      public int() throws IOException;  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);

        System.out.print("\nВыберете пункт меню: ");

        boolean isCorrectInput = false;
        int menuItemInput = -1;
        int menuSize = menu.size();
        while (!isCorrectInput) {
            try {
                menuItemInput = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                isCorrectInput = false;
                continue;
            } catch (Exception e) {
                isCorrectInput = false;
                continue;
            }
            //if (sc.hasNextInt()) menuItemInput = sc.nextInt();
            if (menuItemInput >= 1 && menuItemInput <= menuSize)
                isCorrectInput = true;
        }

        return menuItemInput;
    }
}