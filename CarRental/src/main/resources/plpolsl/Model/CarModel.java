package plpolsl.Model;


/**
 * CarRentalModel
 * 
 * @see The class CarRentalModel is a Model in my MVC
 * @author Kevin Gruszka
 * @version 1.0, 09.12.2022
 * @since 1.0
 */

public class CarModel {
    private String carName;
    private String carModel;
    private double carPrice; 
    private String carCategory;

    public CarModel(String carName, String carModel, double carPrice){
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carCategory = setCategory(carPrice);
    }

    private String setCategory(double carPrice) {
        if (carPrice <= 10000) {
            return "A";
        } else if (carPrice > 10000 && carPrice <= 20000) {
            return "B";
        } else {
            return "C";
        }
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
        this.carCategory = setCategory(carPrice);
    }
}



