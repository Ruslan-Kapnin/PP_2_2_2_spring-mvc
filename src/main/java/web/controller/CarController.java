package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {


    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getAllCars(ModelMap model,
                             @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carService.getCars(count == null ? CarDAO.MAX_CARS : count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
