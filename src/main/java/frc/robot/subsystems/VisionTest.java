/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.lib.Pixy2;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.lib.links.SPILink;

/**
 * This is a subsystem class. A subsystem interacts with the hardware components
 * on the robot.
 */

public class VisionTest extends Subsystem implements ISubsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static VisionTest instance = new VisionTest();

    public static VisionTest getInstance() {
        return instance;
    }

    private static final Pixy2 pixy = Pixy2.createInstance(new SPILink());;

    public static void initialize() {
        pixy.init(); // Initializes the camera and prepares to send/receive data
        pixy.setLamp((byte) 1, (byte) 1); // Turns the LEDs on
        pixy.setLED(255, 0, 0); // Sets the RGB LED to purple
    }

    public VisionTest() {

    }

    @Override
    public void outputSmartdashboard() {

    }

    @Override
    public void zeroSensors() {

    }

    @Override
    public void resetSubsystem() {

    }

    @Override
    public void testSubsystem() {

    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());

    }
}
