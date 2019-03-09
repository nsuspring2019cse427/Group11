package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FrequencyOfWord {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
            new FileReader("questionpaper.txt"));
        
        String st = br.readLine();
        st = st + " ";
        int a = lengthx(st);
        String arr[] = new String[a];
        int p = 0;
        int c = 0;

        for (int j = 0; j < st.length(); j++) {
            if (st.charAt(j) == ' ') {
                arr[p++] = st.substring(c,j);
                c = j + 1;
            }
        }
    }

    static int lengthx(String a) {
        int p = 0;
        for (int j = 0; j < a.length(); j++) {
            if (a.charAt(j) == ' ') {
                p++;
            }
        }
        return p;
    }
}