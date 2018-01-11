// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2181.FPU2181;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

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
    public static DoubleSolenoid driveTrainSpeedSwitch;
    public static DigitalInput driveTrainLeftEncoder;
    public static DigitalInput driveTrainRightEncoder;
    public static CANTalon driveTrainMotorL;
    public static CANTalon driveTrainMotorR;
    public static Solenoid boxFlikrsLeftFlikr;
    public static Solenoid boxFlikrsRightFlikr;
    public static Compressor boxFlikrsCompressor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainSpeedSwitch = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("DriveTrain", "SpeedSwitch", driveTrainSpeedSwitch);
        
        driveTrainLeftEncoder = new DigitalInput(0);
        LiveWindow.addSensor("DriveTrain", "LeftEncoder", driveTrainLeftEncoder);
        
        driveTrainRightEncoder = new DigitalInput(1);
        LiveWindow.addSensor("DriveTrain", "RightEncoder", driveTrainRightEncoder);
        
        driveTrainMotorL = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "MotorL", driveTrainMotorL);
        
        driveTrainMotorR = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "MotorR", driveTrainMotorR);
        
        boxFlikrsLeftFlikr = new Solenoid(0, 2);
        LiveWindow.addActuator("BoxFlikrs", "LeftFlikr", boxFlikrsLeftFlikr);
        
        boxFlikrsRightFlikr = new Solenoid(0, 3);
        LiveWindow.addActuator("BoxFlikrs", "RightFlikr", boxFlikrsRightFlikr);
        
        boxFlikrsCompressor = new Compressor(0);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
