package pl.eu.pjatk.String_Boot.services;

import org.springframework.stereotype.Component;
import pl.eu.pjatk.String_Boot.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component //każda klasa musi mieć tą adnotację
public class CarService {
    List<Car> carList = new ArrayList<>();

    public CarService() {
        this.carList.add(new Car("Tesla", 2017));
        this.carList.add(new Car("Lamborghini", 2016));
        this.carList.add(new Car("BMW", 2015));
    }

    public List<Car> getCatList() {
        return this.carList;
    }

    public void add(Car car) {
        this.carList.add(car);
    }

    public Car getCar(int id) {
        return this.carList.get(id);
    }

    public void delete(int id) {
        this.carList.remove(id);
    }

    public void edit(int id, Car car) {
        this.carList.set(id, car);
    }
}
