package com.stoneshomework.car.controller;

import com.stoneshomework.car.domain.Car;
import com.stoneshomework.car.service.CarService;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/search/{make}")
    @ResponseStatus(HttpStatus.OK)
    public List<Car> findAllByMake(@PathVariable("make") String make) {
        return carService.findAllyMake(make);
    }

    @GetMapping("/export")
    public List<Car> findAllCars() {
        return carService.findAllCars();
    }

    @PostMapping("/import")
    public void importCars(@RequestParam("file") MultipartFile file) throws IOException, ParseException {
        carService.importCars(file);
    }
}
