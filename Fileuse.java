import javax.sound.sampled.Line;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Fileuse {


            String line[]=new String[20];
            int r;


    BufferedReader buffread;

    public String[] readPassengersFile() {
        r=0;
        try {
            buffread = new BufferedReader(new FileReader("/home/ayman/IdeaProjects/untitled/src/Passengers.txt"));
            while ((line[r++]=buffread.readLine())!=null){
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return line;

    }

        public String[] readDriverssFile() {
        r=0;
            try {
                buffread = new BufferedReader(new FileReader("/home/ayman/IdeaProjects/untitled/src/Drivers.txt"));
                while ((line[r++]=buffread.readLine())!=null){
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        }


    public String[] ReadTrips() {
        r=0;
        try {
            buffread = new BufferedReader(new FileReader("/home/ayman/IdeaProjects/untitled/src/Trips.txt"));
            while ((line[r++]=buffread.readLine())!=null){
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }


}
