package plpolsl.Model;


/**
 * CarRentalModel
 * 
 * @see The class CarRentalModel is a Model in my MVC
 * @author Kevin Gruszka
 * @version 1.0, 09.12.2022
 * @since 1.0
 */

public class CarModel
{
    private String carName;
    private String carModel;
    private double carPrice; 
    private String carCategory;

    /**
     *
     * @param carName
     * @param carModel
     * @param carPrice
     */
    public CarModel(String carName, String carModel, double carPrice){
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.setCategory(carPrice);
    }
   
    /**
     * the method that set category dependent on the price
     * @version 1.0
     * @param carPrice
     * @since 1.0
     */
    public void setCategory(double carPrice)
    {
        
        if (carPrice <= 10000) 
        {
            carCategory = "A";
        } else if (carPrice > 10000 && carPrice <= 20000) 
        {
            carCategory = "B";
        } else if (carPrice > 20000) 
        {
            carCategory = "C";
        }  
    }


    /**
     *
     * the car category getter method
     * @return String (A, B or C) - the category of car
     * @version 1.0
     * @since 1.0
     */
    public String getCarCategory() 
    {
        return carCategory;
    }

    /**
     * The getter method that get car name
     * @return the string with car name
     * @version 1.0
     * @since 1.0
     */
    public String getCarName() 
    {
        return carName;
    }

    /**
     * The getter method that get car model
     * @return the string with car model
     * @version 1.0
     * @since 1.0
     */
    public String getCarModel() 
    {
        return carModel;
    }

    /**
     * The getter method that get car price
     * @return the Float with car price
     * @version 1.0
     * @since 1.0
     */
    public double getCarPrice() 
    {
        return carPrice;
    }   
    
    public void setCarName(String carName){
        this.carName=carName;
    }
    
    public void setCarModel(String carModel){
        this.carModel = carModel;
    }
    
    public void setCarPrice(double carPrice){
        this.carPrice = carPrice;
    }
}




