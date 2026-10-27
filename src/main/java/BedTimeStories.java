package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            BufferedReader bufReader =
                    new BufferedReader(new FileReader("poem.txt"));

            System.out.println("Select the story file to read:");
                 string line;
while ((line = bufferedReader.readLine()) != null) {
    System.out.println(line);

    bufferedReader.close();
}
catch(IOException) {
    System.out.println("Something went wrong");
            }
            System.out.println();
        }
     }