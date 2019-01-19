package com.zoo;

import java.util.EnumMap;

public class AnimalFactory {
    private static final EnumMap<Animals,Sound> sounds = new EnumMap<Animals, Sound>(Animals.class);

    public Sound getSound(Animals animals){
        return sounds.get(animals);
    }

    static {
        sounds.put(Animals.Cat,new Cat());
        sounds.put(Animals.Cow,new Cow());
        sounds.put(Animals.Dog,new Dog());
    }

}
