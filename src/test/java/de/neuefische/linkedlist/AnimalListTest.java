package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testAdd(){
        //Given
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal horse = new Animal("Horse");

        AnimalList animalList = new AnimalList(bird);

        //When
        animalList.add(cat);
        animalList.add(horse);
        String actual = animalList.toString();
        //Then
        String expected = "Bird -> Cat -> Horse";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFirstItem(){
        //Given
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal horse = new Animal("Horse");

        AnimalList animalList = new AnimalList(bird);

        //When
        animalList.add(cat);
        animalList.add(horse);
        animalList.remove(bird);
        String actual = animalList.toString();
        //Then
        String expected = "Cat -> Horse";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveItem(){
        //Given
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal horse = new Animal("Horse");


        AnimalList animalList = new AnimalList(bird);

        //When
        animalList.add(cat);
        animalList.add(horse);
        animalList.remove(cat);
        String actual = animalList.toString();
        //Then
        String expected = "Bird -> Horse";
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveUnkownItem(){
        //Given
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal horse = new Animal("Horse");


        AnimalList animalList = new AnimalList(bird);

        //When
        animalList.add(cat);
        animalList.add(horse);
        animalList.remove(new Animal("Wal"));
        String actual = animalList.toString();
        //Then
        String expected = "Bird -> Cat -> Horse";
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringList(){
        //Given
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal horse = new Animal("Horse");

        AnimalList animalList = new AnimalList(bird);

        //When
        String actual = animalList.toString();

        //Then
        String expected = "Bird";
        assertEquals(expected, actual);
    }
}