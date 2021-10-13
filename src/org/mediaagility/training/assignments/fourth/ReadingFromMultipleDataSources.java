package org.mediaagility.training.assignments.fourth;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFromMultipleDataSources {

    private static int count = 0;

    public static void main(String[] args) throws Exception {
        List<String> pathList = new ArrayList<>();

        try (Stream<Path> paths = Files.walk(Paths.get("src/org/mediaagility/training/assignments/fourth/dataset"))) {

            pathList = paths.filter(path->Files.isRegularFile(path))
                            .map(path -> path.toString())
                         .collect(Collectors.toList());
        }

        PrintWriter pw = new PrintWriter("out.csv");

        List<String> finalPathList = pathList;
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                try {
                    writeTo(pw, finalPathList, 0, 5);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                try {
                    writeTo(pw, finalPathList, 6, 11);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread3 = new Runnable() {
            @Override
            public void run() {
                try {
                    writeTo(pw, finalPathList, 12, 17);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread4 = new Runnable() {
            @Override
            public void run() {
                try {
                    writeTo(pw, finalPathList, 18, 23);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread5 = new Runnable() {
            @Override
            public void run() {
                try {
                    writeTo(pw, finalPathList, 24, 29);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        Thread t4 = new Thread(thread4);
        Thread t5 = new Thread(thread5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t3.join();
        t1.join();
        t2.join();
        t4.join();
        t5.join();


        pw.append("-----------------------------------------------------------------------------------------------------------\nTotal records"+count);

        pw.flush();
        pw.close();
    }

    private static void writeTo(PrintWriter pw, List<String> pathList, int start, int end) throws IOException {
        for(int i = start ; i <= end; i++){
            try{
                FileReader fr = new FileReader(pathList.get(i));
                BufferedReader br = new BufferedReader(fr);

                List<String> tempList = br.lines().toList();

                for(int j = 0 ; j < tempList.size() ; j++){
                    pw.append(++count+" "+tempList.get(j)+"\n");
                }

            }catch(Exception e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread()+" finished!");
        }
    }

}
