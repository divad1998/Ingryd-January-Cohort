package Week1;

public class ArrayAndStringExercise {

    static void printFirstTenEvenNumbers() {
        int[] evenNumArray = {2,4,6,8,10,12,14,16,18,20};
        for (int i : evenNumArray) {
            System.out.println(i);
        }
    }

    static void printSumOfArray() {
        int integers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void printSomeStringsInArray() {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("First string: " + strings[0]);
        System.out.println("Fifth string: " + strings[4]);
        System.out.println("Last string: " + strings[9]);
    }

    static void concatAndSplitStrings() {
        String first = "Hello";
        String second = "World";
        String concatenated = first + ", " + second;
        String splitted[] = concatenated.split(", ");

        for (String s : splitted) {
            System.out.println(s);
        }
    }

    static void compareStrings() {
        String first = "Hello";
        String second = "World";

        System.out.println(first.equals(second));
    }

    static void replaceWorld() {
        String str = "Hello, World";
        String newStr = str.replace("World", "Java Globe");
        System.out.println(newStr);
    }

    static void splitString() {
        String website = "http://ingrydacademy.com/students";
        String host = website.substring(0,4);
        String protocol = website.substring(7,24);
        String endpoint = website.substring(24);
        System.out.println("Host: " + host);
        System.out.println("Protocol: " + protocol);
        System.out.println("Endpoint: " + endpoint);
    }

    public static void main(String[] args) {
        //printFirstTenEvenNumbers();
        //printSumOfArray();
        //printSomeStringsInArray();
        //concatAndSplitStrings();
        //compareStrings();
        //replaceWorld();
        splitString();
    }
}
