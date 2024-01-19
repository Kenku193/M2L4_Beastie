package org.example.entity;

import org.example.contracts.Drivable;

public class Boat implements Drivable {
    @Override
    public void goStraight() {
        System.out.println("Лодка плывет вперед");
    }

    @Override
    public void goBack() {
        System.out.println("Лодка плывет назад");
    }

    @Override
    public void goLeft() {
        System.out.println("Лодка плывет налево");
    }

    @Override
    public void goRight() {
        System.out.println("Лодка плывет направо");
    }
}
