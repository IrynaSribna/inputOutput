package com.ira;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MyGrep
{
    public static void main( String[] args )
    {
        if (args.length !=2) {
            System.err.println("Please pass the name of the file and the keyword");
            System.exit(-1);
        }

        String fileName = args[0];
        String keyword = args[1];

        try (Scanner input = new Scanner(new FileReader(fileName))) {
            while (input.hasNext()) {
                String initialLine = input.nextLine();
                if (initialLine.contains(keyword)) {
                    System.out.println(initialLine);
                }

            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot read the input file");
        }

    }
}
