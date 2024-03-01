package Week1;

import java.util.Scanner;

public  class Solution {

    public static String findTheFirstCharDifference(String s, String t){
        String result = "";
        char[] chArray = t.toCharArray();
        for (char ch : chArray) {
            if (s.contains(ch + "")) {
                result = "false";
            } else {
                result = ch + "";
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string - s");
        String s = scanner.nextLine();
        System.out.println("Enter the second string - t");
        String t = scanner.nextLine();
        String result = findTheFirstCharDifference(s, t);

        if (result.equals("false")) {
            System.out.println("null");
        } else {
            System.out.println(result);
        }
    }
}
