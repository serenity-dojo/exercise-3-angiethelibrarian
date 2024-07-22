package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void dog_should_make_noise() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.makeNoise(), Dog.DOG_NOISE);
    }

    @Test
    public void dog_should_be_fed() {
        Dog fido = new Dog("Fido", "Bone", 5);
        fido.feed();
        Assert.assertTrue(fido.isFed());
    }
}

class Dog {
    private String name;
    private String favoriteToy;
    private int age;
    private boolean isFed;
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.isFed = false;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean isFed() {
        return isFed;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public void feed() {
        this.isFed = true;
    }
}
