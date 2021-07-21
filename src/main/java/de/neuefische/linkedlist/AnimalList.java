package de.neuefische.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList(Animal animal) {
        head = new AnimalListItem(animal);
    }

    public void add(Animal animal) {
        AnimalListItem current = head;
        boolean isRunning = true;

        while (isRunning) {
            if (current.getNext() == null) {
                current.setNext(new AnimalListItem(animal));
                isRunning = false;
            } else {
                current = current.getNext();
            }

        }
    }

    public void remove(Animal animal) {
        if (head.getValue() == animal) {
            head = head.getNext();
            return;
        }
        AnimalListItem current = head;
        AnimalListItem next = head.getNext();
        boolean isRunning = true;
        while (isRunning) {
            if (next.getValue() == animal) {
                current.setNext(next.getNext());
                isRunning = false;
            } else {
                current = current.getNext();
                next = next.getNext();
            }
            if (next == null) {
                isRunning = false;
            }
        }

    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder(head.getValue().getName());

        AnimalListItem current = head.getNext();
        while (current != null) {
            builder.append(" -> ").append(current.getValue().getName());
            current = current.getNext();
        }

        return builder.toString();
    }
}
