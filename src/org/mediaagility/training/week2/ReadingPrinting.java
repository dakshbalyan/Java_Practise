package org.mediaagility.training.week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadingPrinting {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("test.txt");
        pw.print("This is printed using printWriter!");
        pw.append("\nHello this is appending... ");
        pw.flush();
        FileReader fileReader = new FileReader("test.txt");
//        System.out.println((char)(fileReader.read()));

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = bufferedReader.read();
        while(i != -1) {
            System.out.println((char)i + bufferedReader.readLine());
            i = bufferedReader.read();
        }
    }
}
