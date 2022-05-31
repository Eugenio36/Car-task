package com.stoneshomework.car.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.stoneshomework.car.domain.Car;
import com.stoneshomework.car.repository.CarRepository;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.DataInput;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAllyMake(String make) {
        return carRepository.findAllByMake(make);
    }

    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Transactional
    public void importCars(MultipartFile file) throws IOException {
        carRepository.deleteAll();

        // MultipartFile --> String
        String content = new String(file.getBytes());

        // String to Java object
        ObjectMapper objectMapper = new ObjectMapper();
        List<Car> cars = objectMapper
                .readValue(content, objectMapper.getTypeFactory().constructCollectionType(List.class, Car.class));

        carRepository.saveAll(cars);

    }

}
