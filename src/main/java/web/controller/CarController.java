package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CarController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "black", 1));
        cars.add(new Car("Mercedes", "grey", 2));
        cars.add(new Car("Volkswagen", "white", 3));
        cars.add(new Car("Toyota", "zimaBlue", 14));
        cars.add(new Car("Lada", "crimson", 9));
        cars = CarService.getCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
