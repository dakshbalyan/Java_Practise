package org.mediaagility.training.week2;

import java.io.*;

public class ReadingPrinting {
    public static void main(String[] args) throws IOException {



        try(FileWriter fw = new FileWriter("myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw))
        {
//            pw.println("adding through println!3");
//            pw.println("adding through println again in the same method!");
            pw.append("adding through append!2");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("myfile.txt"));
        int i = bufferedReader.read();
        while(i != -1) {
            System.out.println((char)i + bufferedReader.readLine());
            i = bufferedReader.read();
        }
    }
}
