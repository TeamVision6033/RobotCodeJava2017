// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6033.RobotCodeJava2017.subsystems;

import org.usfirst.frc6033.RobotCodeJava2017.RobotMap;
import org.usfirst.frc6033.RobotCodeJava2017.commands.*;

import edu.wpi.first.wpilibj.Servo;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class CameraMount extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Servo pan = RobotMap.cameraMountpan;
    private final Servo tilt = RobotMap.cameraMounttilt;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new CameraDefaultPosition());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public double getPanPosition()
    {
    	return this.pan.getPosition();
    }
    
    public double getTiltPosition()
    {
    	return this.tilt.getPosition();
    }
    
    public void setPanPosition(double position)
    {
    	this.pan.setPosition(position);
    }
    
    public void setTiltPosition(double position)
    {
    	this.tilt.setPosition(position);
    }
}
