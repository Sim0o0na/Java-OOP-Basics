package com.company;

import java.util.*;
import java.util.stream.Collectors;

class Component {

}

class Light extends Component {

}

class Express extends Component {

}

class Heavy extends Component {

}

public class Main {

    public static void main(String[] args) {

        List<Component> components = new ArrayList<>();
        components.add(new Light());
        components.add(new Heavy());
        components.add(new Express());
        components.add(new Light());
        components.add(new Express());
        components.add(new Express());
        components.add(new Light());
        components.add(new Light());

        components.stream()
                .sorted(Comparator.comparing(c -> c.getClass().getSimpleName()))
                .collect(Collectors.groupingBy(Component::getClass, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .forEach(kvp -> System.out.println(kvp.getKey().getSimpleName() + " -> " + kvp.getValue()));

    }
}
