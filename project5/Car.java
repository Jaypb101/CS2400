/**
 * This class represents a Car in the project5 package.
 * 
 * <p>
 * The Car class is part of the Project0, specifically within the project5 package.
 * It is designed to model the properties and behaviors of a car.
 * </p>
 * 
 * <p>
 * Note: Ensure that the Car class is properly implemented with necessary attributes
 * and methods to fully represent a car's functionality.
 * </p>
 * 
 * <p>
 * Example usage:
 * <pre>
 *     Car myCar = new Car();
 *     myCar.setMake("Toyota");
 *     myCar.setModel("Corolla");
 * </pre>
 * </p>
 * 
 * @author Jayden Briones
 * @version 1.0
 * @since 2023-10-01
 */
package project5;
public class Car {
    private static final int maxSpeed = 180;
    private int minSpeed = 0;
    private int yearModel;
    private String make;
    private int speed;
    /**
     * Default constructor for the Car class.
     */
    public Car(int yearModel,String make ,int speed){
        setYearModel(yearModel);
        setMake(make);
        setCurrentSpeed(speed);
    }
    /**
     * Outputs the car's properties in a formatted string.
     */
    @Override
    public String toString(){
        return String.format("%-5d  %-20s  %5d", yearModel, make, speed);
    }
    /**
     * 
     * @return maxSpeed Returns the value of max speed.
     */
    public int getMaxSpeed(){
        return maxSpeed;
    }
    /**
     * 
     * @return minSpeed Returns the value of minimum speed.
     */
    public int getMinSpeed(){
        return minSpeed;
    }
    /**
     * 
     * @parum sets the year of the car
     */
    public void setYearModel(int yearModel){
        this.yearModel = yearModel;
    }
    /**
     * 
     * @parum sets the make of the car.
     */
    public void setMake(String make){
        this.make = make;
    }
    /**
     * 
     * @parum speed Returns the value of the speed.
     */
    public void setCurrentSpeed(int speed){
        this.speed = speed;
    }
    /**
     * @return speed
     */
    public int getCurrentSpeed(){
        return speed;
    }
}
