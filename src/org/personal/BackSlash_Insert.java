package org.personal;

import java.io.FileReader;
import java.io.PrintWriter;

public class BackSlash_Insert {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/daksh/Downloads/MultiAP_RRM");
            PrintWriter pw = new PrintWriter("/home/daksh/Downloads/backSlashOut.txt");
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                if ((char) i != '\n' && (char) i != '\t')
                    sb.append((char) i);
            }

            String str = "" + sb.charAt(0);
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j) == '"')
                    str += "\\\"";
                else
                    str += sb.charAt(j);
            }
            str = str.replaceAll("\\s", "");
            pw.print(str);

            pw.close();
            fr.close();
            System.out.println("-----------------Successfully Finished-------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
