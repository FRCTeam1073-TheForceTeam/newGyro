// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1073.deadreckoning;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static ADXRS450_Gyro deadReckoningAnalogGyro1;
    public static BuiltInAccelerometer deadReckoningAnalogAccelerometer1;


    public static void init() {
        deadReckoningAnalogGyro1 = new ADXRS450_Gyro();
        LiveWindow.addSensor("deadReckoning", "AnalogGyro 1", deadReckoningAnalogGyro1);
        //deadReckoningAnalogGyro1.setSensitivity(0.007);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        deadReckoningAnalogAccelerometer1 = new BuiltInAccelerometer(Accelerometer.Range.k4G);
        LiveWindow.addSensor("deadReckoning", "AnalogAccelerometer 1", deadReckoningAnalogAccelerometer1);
        //deadReckoningAnalogAccelerometer1.setSensitivity(0.0);
        //deadReckoningAnalogAccelerometer1.setZero(2.5);

    }
}
