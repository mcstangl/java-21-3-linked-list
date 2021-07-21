package de.neuefische.linkedlist;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value){
        this.value = value;
    }

    public void setNext(AnimalListItem animalListItem) {
        this.next = animalListItem;
    }

    public AnimalListItem getNext() {
        return next;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public void setValue(AnimalListItem animalItemToAdd) {
        this.value = animalItemToAdd.value;
    }

    public Animal getValue() {
        return value;
    }
}
