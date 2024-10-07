package pl.eu.pjatk.String_Boot.controllers;

import org.springframework.web.bind.annotation.*;
import pl.eu.pjatk.String_Boot.model.Car;
import pl.eu.pjatk.String_Boot.services.CarService;

import java.util.List;

@RestController
public class MyRestController {
    private CarService carService;

    public MyRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("car/all") // <- endpoint
    public List<Car> getAll() {
        return this.carService.getCatList();
    }

    @GetMapping("car/{id}") // <- endpoint
    public Car get(@PathVariable int id) {
        return this.carService.getCar(id);
    }

    @PostMapping("car")
    public void addCar(@RequestBody Car car) {
        this.carService.add(car);
    }
}
