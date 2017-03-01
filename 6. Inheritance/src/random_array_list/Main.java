package random_array_list;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        RandomArrayList arrayList = new RandomArrayList();


        for (Object obj : arrayList) {
            System.out.println(obj.toString());
        }

        System.out.println(arrayList.getRandomElement());

    }
}
