package class_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double len = Double.parseDouble(scan.readLine());
        double w = Double.parseDouble(scan.readLine());
        double h = Double.parseDouble(scan.readLine());

        Figure figure = new Figure(len, w, h);
        System.out.printf("Surface Area - %.2f\n", figure.surfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n", figure.lateralArea());
        System.out.printf("Volume - %.2f", figure.volume());
    }
}
