package Week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileExample {
    public static void main(String[] args) {
        String filePath = "src/Week4/file.csv";

        //Writing to a CSV file
        try(FileWriter writer = new FileWriter(filePath)) {
            writer.append("John Doe,30,New York\n");
            writer.append("Jane Smith,25,London\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading the csv file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                if(count == 1)
                    System.out.println("Name\tAge\tCity");
                String[] data = line.split(",");
                String name = data[0], city = data[2];
                int age = Integer.parseInt(data[1]);
                System.out.println(name + "\t" + age + "\t" + city);
                count++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
