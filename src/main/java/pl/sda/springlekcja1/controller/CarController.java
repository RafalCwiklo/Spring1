package pl.sda.springlekcja1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.sda.springlekcja1.service.CarService;

@Controller
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

}
