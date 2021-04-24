/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningclasses;

/**
 *
 * @author sofiajonsson
 */
public class LearningClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Vehicles Car = new Vehicles();
       Vehicles Car2 = new Vehicles();
       Vehicles Car3 = new Vehicles();
       Vehicles Car4 = new Vehicles();
       Vehicles Car5 = new Vehicles();
       Vehicles Car6 = new Vehicles();
       
       
       Car.vehicleName = "Subaru Outback";
       Car.topSpeed = 215;

       Car.GetDetails();
       Car.SayHi();
       
       
       Vehicles Bike = new Vehicles();
       Bike.vehicleName = "Bicicleta";
       Bike.number_of_tires = 2;
       Bike.topSpeed = 55.55;
       Bike.GetDetails();
    }
    
}

//Create Vehicles class outside of main body class so they can be accessed individually
//Automatically public if not specified, if private getDetails !work in main function block
class Vehicles{
    String vehicleName;
    int number_of_tires;
    double topSpeed;
    
//Declare as static because it will work as a common function for all Objects created in your class
   static void SayHi(){
        System.out.println("Hi!");
    }
    
    void GetDetails(){
        System.out.println("Name of the Vehicle is:");
        System.out.println(vehicleName);
        System.out.println(number_of_tires);
        System.out.println(topSpeed);
    }
//Ceate a constructor, similar to function but doesnt need a data type
//Used to provide default values in case input is forgotten

    Vehicles(){
        number_of_tires=4;
    }
    
}
