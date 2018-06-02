package com.lesson1;

public class App {
    public static void main(String[] args) {

        /*Sending messages to Vehicle objects
        Below two objects are completely different from one another and they are both capable
        of responding to the accelerate messages
        */
        Vehicle myCar = new Vehicle ( );
        Vehicle anotherCar = new Vehicle ( );

        myCar.accelerator ( );
        anotherCar.accelerator ( );
        //Behavior during runtime

    }


}
