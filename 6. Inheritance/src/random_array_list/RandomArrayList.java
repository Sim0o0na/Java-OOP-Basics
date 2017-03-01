package random_array_list;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class RandomArrayList extends ArrayList {
    private Random randomGenerator;

    public Object getRandomElement() {
        int index = randomGenerator.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.remove(super.size() - 1));
        return element;
    }

}
