package src.java8.features.codingpractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapConvertExample {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1, "cat"));
        animalList.add(new Animal(2, "Dog"));
        System.out.println(covertListToMap(animalList));
        System.out.println("$$$$$$$$$$$$$$$$");
        System.out.println(covertListToMapJava8(animalList));


        System.out.println("%%%%%%%%%");
        // Collectors.toMap() method
        LinkedHashMap<Integer, String>
                map = animalList.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Animal::getId,
                                        Animal::getName,
                                        (x, y)
                                                -> x + ", " + y,
                                        LinkedHashMap::new));

        // print map
        map.forEach(
                (x, y) -> System.out.println(x + "=" + y));

        System.out.println("MultiMap...");

        Map<Integer, List<String>>
                multimap = animalList
                .stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Animal::getId,
                                        Collectors
                                                .mapping(
                                                        Animal::getName,
                                                        Collectors
                                                                .toList())));

        // print the multiMap
        System.out.println("MultiMap = " + multimap);


    }

    //Before java 8
    public static Map<Integer, Animal> covertListToMap(List<Animal> animalList) {
        Map<Integer, Animal> map = new HashMap<>();
        for (Animal animal : animalList) {
            map.put(animal.getId(), animal);
        }
        return map;
    }

    //With Java 8
    public static Map<Integer, Animal> covertListToMapJava8(List<Animal> animalList) {
        Map<Integer, Animal> map1 = animalList.stream().collect(Collectors.toMap(Animal::getId, Function.identity()));
        return map1;
    }


}
