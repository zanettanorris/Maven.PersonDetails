package com.zipcodewilmington;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = personArray[counter].toString();
            result += currentPerson;
            counter++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";
        for (int i=0; i < personArray.length;){
            String currentPerson = personArray[i].toString();
            result += currentPerson;
            i++;}
        return result;
    }


    public String forEachLoop() {
        String result = "";
        for (Person i : personArray) {
            String currentPerson = i.toString();
            result += currentPerson;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
