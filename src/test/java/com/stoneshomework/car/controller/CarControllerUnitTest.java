package com.stoneshomework.car.controller;

import com.stoneshomework.car.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CarControllerUnitTest {

    @Mock
    CarService carService;

    @InjectMocks
    CarController carController;

    @Test
    void findAllByMake() {
        String make = "BMW";
        carController.findAllByMake(make);
        Mockito.verify(carService).findAllyMake(make);
    }
}