//
// Name:    Briones, Jayden
// Project: 5
// Due:     11/21/24
// Course:  cs-1400-05-f24
//
// Description:
//           8 Cars race at different speeds 30 times
//
package project5;
import java.util.Random;
public class RacingCarApp {
    public static void main(String[] args) {
        Random rand = new Random();
        Car[] cars = {
            new Car(2020, "Toyota Corolla", 0),
            new Car(2015, "Ford Mustang", 0),
            new Car(2018, "Honda Civic", 0),
            new Car(2012, "Chevrolet Silverado", 0),
            new Car(2023, "BMW X5", 0),
            new Car(2016, "Subaru Outback", 0),
            new Car(2008, "Nissan Altima", 0),
            new Car(2021, "Jeep Wrangler", 0)
        };
        
        for(int i=0; i < 30; i++){ //break and accelerate by 15
            for(Car car : cars){
                int number = rand.nextInt(20) + 1;
                if(number >= 1 && number <= 15){
                    if(car.getCurrentSpeed() + 15 > car.getMaxSpeed()){
                        car.setCurrentSpeed(car.getMaxSpeed());
                    } else{
                        car.setCurrentSpeed(car.getCurrentSpeed() + 15);
                        }
                } else{
                    if(car.getCurrentSpeed() - 15 < car.getMinSpeed()){
                        car.setCurrentSpeed(car.getMinSpeed());
                    } else{
                        car.setCurrentSpeed(car.getCurrentSpeed() - 15);
                    }
                    }
                }
            }
            
            System.out.println("Racing Car by J. Briones\n");
            System.out.printf("%-5s  %-20s  %5s%n","Model","Make","Speed");
            System.out.println("-----  --------------------  -----");
            for(Car car : cars){
                System.out.println(car.toString());
            }
        }
    }

