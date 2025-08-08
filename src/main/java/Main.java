public class Main {

    public static void main (String [] args) {
        /** TODO 2: Create an object of the SideKick class named "sideKickObject" **/
        SideKick sideKickObject = new SideKick(); // Create the object, starts in Cleaning mode

        /** TODO 3: Try accessing the property "modeOfOperation" using the dot operator
         *          like:
         *          System.out.println("Mode of operation is: " + sideKickObject.modeOfOperation);
         *
         **/
        // Access private field via getter
        System.out.println("Mode of operation is: " + sideKickObject.getModeOfOperation());

    /** TODO 4: Comment out the line created by TODO 3    **/

    /** TODO 6: Display the current value of the property "modeOfOperation"  of the object
     *         "sideKickObject" within a println() using the getter method of the object
     *         you created in TODO 5
     **/

    /** TODO 9: Set the value of the property "modeOfOperation" of the object
     *        "sideKickObject", using the setter you created in TODO 8, to a
     *        a value of 3
     **/
    // Set modeOfOperation to 3 using the setter
        sideKickObject.setModeOfOperation(3);
    // Print the value using getter
        System.out.println("Mode of operation is: " + sideKickObject.getModeOfOperation());

    /** TODO 10: Call the method takeAction() of the object "sideKickObject" **/
        sideKickObject.takeAction();


    /** TODO 12: Set the value of the property "modeOfOperation" of the object
     *          "sideKickObject to a value of 1
     *           using the setter method you created in TODO 7 and TODO 8.
     *           After that is done, call the method takeAction() using object
     *           "sideKickObject" and the dot operator.
     **/
        sideKickObject.setModeOfOperation(1);
        System.out.println("Mode of operation is: " + sideKickObject.getModeOfOperation());


    /** TODO 15: Set the value of the property "modeOfOperation" of the object
     *          "sideKickObject to a value of 2
     *           using the setter method you created in TODO 7 and TODO 8.
     *           After that is done, call the method takeAction() using object
     *           "sideKickObject" and the dot operator.
     **/
        sideKickObject.setModeOfOperation(2);
        System.out.println("Mode of operation is: " + sideKickObject.getModeOfOperation());

        /** TODO 14: Create an object of the
         *           "WatADriver" class
         *           named "driverBot"
         **/
        WhatADriver driverBot = new WhatADriver();

        /** TODO 15:  Call the method rechargeBattery()
         *            and then
         *            displayBatteryLevel()
         *            with the object "driverBot"
         **/
        driverBot.rechargeBattery();
        driverBot.displayBatteryLevel();

        /** TODO 19: Call the methods "setChoice"
         *           and "takeAction"
         *           with the object "driverBot"
         *           which you created in
         *           "TODO 16".
         **/
        driverBot.setChoice();
        driverBot.takeAction();
    }
}
