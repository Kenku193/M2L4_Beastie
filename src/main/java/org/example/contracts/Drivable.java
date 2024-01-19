package org.example.contracts;

public interface Drivable {

    default void goStraight(){
        System.out.println("Что-то двигается прямо");
    }

    default void goBack(){
        System.out.println("Что-то двигается назад");
    }

    default void goLeft(){
        System.out.println("Что-то двигается налево");
    }

    void goRight();

}
