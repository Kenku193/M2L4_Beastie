package org.example.entity;

import org.example.contracts.Drivable;
import org.example.contracts.Sellable;
import org.example.contracts.Stopable;

import java.io.Serializable;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Car implements Drivable, Sellable, Serializable, Cloneable {

    public void someText(){
        System.out.println("Какой-то текcт");
    }

    @Override
    public void goStraight() {
        System.out.println("Машина едет вперед и вверх");
    }

    @Override
    public void goBack() {
        System.out.println("Машина едет назад");
    }

    @Override
    public void goLeft() {
        System.out.println("Машина едет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Машина едет направо");
    }
}
