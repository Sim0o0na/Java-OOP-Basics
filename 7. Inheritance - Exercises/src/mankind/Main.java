package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] studentInfo = reader.readLine().split("\\s+");
        String[] workerInfo = reader.readLine().split("\\s+");

        try{
            Student student = new Student(studentInfo[0], studentInfo[1], studentInfo[2]);
            Worker worker = new Worker(workerInfo[0], workerInfo[1], Double.parseDouble(workerInfo[2]), Double.parseDouble(workerInfo[3]));
            System.out.println(student.toString());
            System.out.println(worker.toString());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
