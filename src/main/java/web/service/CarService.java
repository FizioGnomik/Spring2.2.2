package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> getCars(List<Car> cars, int number) {
        if (number >= 5) {
            return cars;
        }
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
