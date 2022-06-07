import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        // YOU CANNOT CHANGE THE LENGTH OF AN ARRAY!
        System.out.println(Arrays.toString(menu));
    }
    
}
