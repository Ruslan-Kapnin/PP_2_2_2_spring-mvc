package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDAO {
    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        for (int i = 1; i <= MAX_CARS; i++) {
            cars.add(new Car(i, "Model" + " " + i * 2, i * 101546));
        }
    }

    @Override
    public List<Car> getCars(int amount) {
        amount = Math.max(0, amount);
        return amount >= MAX_CARS ? cars : cars.subList(0, amount);
    }
}
