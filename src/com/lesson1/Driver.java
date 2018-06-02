package com.lesson1;

public class Driver {

    /*Objects have dependencies.Driver object will need vehicle objects to drive.
    Driver depends on Vehicle objects
    This dependency driver have on vehicle object is referred to as association.Association should always be organized
    how object behaves.
    Association defines relationship between classes.There can be different kinds of Association.When we saw in below
    eg is Dependency Association.
    Driver receives vehicle reference only in the scope of the driver operation.So, the driver is dependent on vehicle
    object to be handed to it as a parameter to the driver operation,only then can he perform the driver operation.
    The association is formed in terms of scope of the operation not the class in general.This is called Dependency Association.
     */
    /* Composition Association - A particular object is composed of other objects that make up a whole and if the containing
    objects seizes to exist the internal part is composed of no longer either.
    Composition employees ownership
     */
    public void driver(Vehicle raceCar) {
        raceCar.accelerator ( );
    }
}
