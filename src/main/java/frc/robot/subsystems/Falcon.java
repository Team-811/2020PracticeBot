/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import frc.robot.commands.Test.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

/**
 * This is a subsystem class.  A subsystem interacts with the hardware components on the robot.  
 */

public class Falcon extends Subsystem implements ISubsystem{

  private static Falcon instance = new Falcon();  
  
  private static TalonFX falcon;

  public static Falcon getInstance() {
    return instance;
  }


  public Falcon()
  {
      falcon = new TalonFX(RobotMap.FALCON_TEST);
  }


  public void FalconTest(double value)
  {     
      falcon.set(ControlMode.PercentOutput, value);
      SmartDashboard.putNumber("Speed Value", value);
  }  

  public void stopFalcon()
  {
    falcon.set(ControlMode.PercentOutput,0);
  }     

  @Override
  public void outputSmartdashboard() 
  {
    SmartDashboard.putNumber("Falcon Encoder ", falcon.getSelectedSensorPosition());
    SmartDashboard.putNumber("Falcon Velocity ", falcon.getSelectedSensorVelocity());     
   
  }

  @Override
  public void zeroSensors() 
  {
    falcon.setSelectedSensorPosition(0);
  }

  @Override
  public void resetSubsystem() 
  {
    
  }

  @Override
  public void testSubsystem() {
    
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new FalconTest());
  }

}
