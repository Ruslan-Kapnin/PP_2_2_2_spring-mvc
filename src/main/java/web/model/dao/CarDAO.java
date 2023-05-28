package web.model.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    int MAX_CARS = 5;
    List<Car> getCars(int amount);
}
