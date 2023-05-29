package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarService {
    @Autowired
    private CarDAO carDao;

    public List<Car> getCars(int amount) {
        return carDao.getCars(amount);
    }

    public List<Car> getCars() {
        return carDao.getCars(CarDAO.MAX_CARS);
    }
}
