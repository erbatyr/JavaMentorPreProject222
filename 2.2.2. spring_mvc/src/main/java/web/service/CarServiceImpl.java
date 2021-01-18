package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private static List<Car> cars;

    @Override
    public int getLength() {
        return cars.size();
    }

    @Override
    public List<Car> createCars() {
        cars = new ArrayList<>();
        Car car1 = new Car(0,"Nissan", 1986, "sedan");
        Car car2 = new Car(1,"Mitsubishi", 1989, "sedan");
        Car car3 = new Car(2,"BMW", 2005, "sedan");
        Car car4 = new Car(3,"Mercedes", 1941, "sedan");
        Car car5 = new Car(4,"Toyota", 2012, "sedan");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
