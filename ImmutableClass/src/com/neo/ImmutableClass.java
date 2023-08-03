package com.neo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> items;

    public ImmutableClass(String name, List<Integer> items) {
        this.name = name;
        
        this.items = new ArrayList<>(items);
    }

    public String getName() {
        return name;
    }

  
    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

    public ImmutableClass addItem(int newItem) {
       
        List<Integer> newItems = new ArrayList<>(items);
        newItems.add(newItem);
        return new ImmutableClass(this.name, newItems);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> originalItems = new ArrayList<>();
        originalItems.add(1);
        originalItems.add(2);
        originalItems.add(3);

        ImmutableClass immutableObj = new ImmutableClass("ImmutableObject", originalItems);

        System.out.println(immutableObj);

       
        try {
            immutableObj.getItems().add(4); 
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }

       
        ImmutableClass newImmutableObj = immutableObj.addItem(4);
        System.out.println(newImmutableObj); 

       
        System.out.println(immutableObj); 
    }
}

