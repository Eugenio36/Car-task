package com.stoneshomework.car;

import com.stoneshomework.car.controller.CarController;
import com.stoneshomework.car.domain.Car;
import com.stoneshomework.car.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApplicationIntegrationTest {

    @Autowired
    CarController carController;

    @Autowired
    CarRepository carRepository;

    @Test
    void findCarByMake(){

        String make = "Nissan";

        carRepository.save(new Car(
                make,
                "4-Series 318i Wagon",
                2017,
                "JH4KA4563LC009999",
                "AA-11"
        ));

        List<Car> car = carController.findAllByMake(make);

        assertNotNull(make);

    }

}


