package Week5;

import Week4.projectOne.ContentSource;

import java.util.Scanner;

public class ConsoleSource implements ContentSource {

    String promptForData(String data) {
        System.out.println("Enter " + data + " below:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
