public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistyGrade = 95;
        int biologyGrade = 75;

        System.out.println(biologyGrade < chemistyGrade);
        // returns a false boolean value

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales < costs);

        // FOR NUMBERS
        // equal operator is ==
        // NOT equal operator is !=

        // do not use == or != to compare String values

        // FOR STRINGS
        // STRING1.equals(STRING2)
        // !STRING1.equals(STRING2) - Not equal
    

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";

        System.out.println(!sentence.equals((sentence2)));
    }
}
