package main.java.builder;

import java.util.*;

import main.java.inmutable.Animal;

public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build() {
        return new Animal(species, age, favoriteFoods);
    }

    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder()
            .setAge(4)
            .setFavoriteFoods(Arrays.asList("grass", "fish")).setSpecies("duck");
        Animal duck = duckBuilder.build();

        Animal flamingo = new AnimalBuilder()
            .setFavoriteFoods(Arrays.asList("algae", "insects"))
            .setSpecies("flamingo").build();
    }
}
