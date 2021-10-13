package org.mediaagility.training.assignments.third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RefugeeAcceptanceStatus {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("src/org/mediaagility/training/assignments/third/refugees.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        System.out.println("NAME \t\t COUNTRY \t\t STATUS");
        while(br.ready()){
            String line = br.readLine();

            // Reading and processing for every line in the text file refugees.txt
            String[] infoArray = line.split(",");
            try{
                if (infoArray[1].equals("Pakistan")) {
                    throw new NotFoundException(infoArray[0] + " \t\t " + infoArray[1] + " \t\t Unaccepted");
                } else
                    System.out.println(infoArray[0] + " \t\t\t" + infoArray[1] + " \t\t Accepted");
            }catch(NotFoundException e){
                e.printStackTrace();
                continue;
            }
        }
    }
}

class NotFoundException extends Exception{
    public NotFoundException(String message) {
        super(message);
    }
}
