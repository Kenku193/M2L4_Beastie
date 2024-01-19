package org.example;

import org.example.contracts.Drivable;
import org.example.contracts.InterfaceWithStaticMethod;
import org.example.contracts.Stopable;
import org.example.entity.Boat;
import org.example.entity.Car;
import org.example.entity.Motorcycle;
import org.example.service.EncryptionInterface;
import org.example.view.ConsoleView;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        
        Drivable vehicle = new Car(); // new Boat(); new Motorcycle();
        Drivable waterVehicle = new Boat();
        Drivable motorcycle = new Motorcycle();

        vehicle.goStraight();
        vehicle.goBack();
        vehicle.goLeft();
        vehicle.goRight();
        // vehicle.someText();

        waterVehicle.goStraight();
        waterVehicle.goBack();
        waterVehicle.goLeft();
        waterVehicle.goRight();

        motorcycle.goStraight();
        motorcycle.goBack();
        motorcycle.goLeft();
        motorcycle.goRight();


        // РЕАЛИЗАЦИЯ ФУНКЦИОНАЛЬНОГО ИНТЕРФЕЙСА
        Stopable stopable = s -> System.out.println(s);
        stopable.stop("Привет!");

        InterfaceWithStaticMethod.toConsole();
        System.out.println(InterfaceWithStaticMethod.s);

    }
}