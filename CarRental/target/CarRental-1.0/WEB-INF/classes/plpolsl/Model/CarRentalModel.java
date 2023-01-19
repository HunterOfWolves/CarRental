package plpolsl.Model;

import java.util.ArrayList;

public class CarRentalModel {
    private ArrayList<CarModel> carList;

    public CarRentalModel() {
        carList = new ArrayList<>();
    }

    public void addCar(CarModel car) {
        carList.add(car);
    }

    public ArrayList<CarModel> getCars() {
        return carList;
    }
}