public class ageCalculator {
    public static void main(String[] args) {
        int age = 10;       // Your age in 2040 will be 58.
        int year = 2040;

        int difference = year - 2022;

        int futureAge = age + difference;

        System.out.println("Your age in " + year + " will be " + futureAge + '.');
    }
}