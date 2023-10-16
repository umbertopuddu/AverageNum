import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        double sum = 0; //Sum of all numbers contained in the file
        int count = 0; //Coumting the quantity of
        // numbers contained in the file

        long start = System.currentTimeMillis();


        try {
            //Hey user, want to reuse this repository? Enter your path instead of the one in quotation marks
            Scanner data = new Scanner(new File("/Users/umbertopuddu/Downloads/random_numbers_1e+06.txt"));

            while (data.hasNext()) {
                sum += data.nextInt();
                count++;
            }

            data.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.err.println("No numbers found in the file.");
        }


        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;

        System.out.println("It took: " + timeElapsed + " milli-seconds.");
    }
}