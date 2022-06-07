public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outter Loop run: " + i);

            // nested loop
            for (int j = 0; j < 3; j++) {
                System.out.println("Inner Loop: " + j);
            }
        }
    }

}
