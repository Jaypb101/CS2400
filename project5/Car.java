//
// Name:    Briones, Jayden
// Project: 5
// Due:     11/21/24
// Course:  cs-1400-05-f24
//
// Description:
//           Variables to create object for RacingCarApp
//
package project5;
/**
 * @author Jayden Briones
 * @version 1.0
 */
public class Car {
    private static final int maxSpeed = 180;
    private int minSpeed = 0;
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int yearModel,String make ,int speed){
        setYearModel(yearModel);
        setMake(make);
        setCurrentSpeed(speed);
    }

    @Override
    public String toString(){
        return String.format("%-5d  %-20s  %5d", yearModel, make, speed);
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getMinSpeed(){
        return minSpeed;
    }

    /** 
   *  @param yearModel the yearModel is set
    */
    public void setYearModel(int yearModel){
        this.yearModel = yearModel;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setCurrentSpeed(int speed){
        this.speed = speed;
    }

    public int getCurrentSpeed(){
        return speed;
    }
}
