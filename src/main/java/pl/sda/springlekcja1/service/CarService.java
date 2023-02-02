package pl.sda.springlekcja1.service;

import org.springframework.stereotype.Service;
import pl.sda.springlekcja1.model.Car;

import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        Car car1 = new Car("BMW", "E46");
        Car car2 = new Car("Ford", "Mondeo");
        Car car3 = new Car("FSO", "Warszawa");

    }


}
