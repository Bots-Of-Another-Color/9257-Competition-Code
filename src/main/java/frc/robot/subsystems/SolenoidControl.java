// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.SolenoidConstants;

enum SolenoidState{
  OPEN,
  CLOSE
}

public class SolenoidControl extends SubsystemBase {
  /** Creates a new SolenoidControl. */
  public SolenoidControl() {




  }

  public void setDefaultStartPos(){
      Constants.SolenoidConstants.CubeManipulator.set(SolenoidConstants.CubeM_StartState);
      Constants.SolenoidConstants.kConeManip.set(SolenoidConstants.ConeM_StartState);
      Constants.SolenoidConstants.Upper10Manip.set(SolenoidConstants.Upper10M_StartState);
      Constants.SolenoidConstants.UpperHyperExtender.set(SolenoidConstants.UpperHE_StartValue);
      Constants.SolenoidConstants.kUpperRotator.set(SolenoidConstants.UpperR_StartState);
      Constants.SolenoidConstants.kLowerArmRotation.set(SolenoidConstants.LAR_StartState);
      Constants.SolenoidConstants.kLowerManip.set(SolenoidConstants.LM_StartState);
  }

  public void setSolenoidPos(int solenoid_to_toggle){
    switch(solenoid_to_toggle){
      case 0: {
        SolenoidConstants.CubeManipulator.toggle();
      }
      case 1: {
        SolenoidConstants.kConeManip.toggle();
      }
      case 2: {
        SolenoidConstants.Upper10Manip.toggle();
      }
      case 3: {
        SolenoidConstants.UpperHyperExtender.toggle();
      }
      case 4: {
        SolenoidConstants.kUpperRotator.toggle();
      }
      case 5: {
        SolenoidConstants.kLowerArmRotation.toggle();
      }
      case 6: {
        SolenoidConstants.kLowerManip.toggle();
      }
      default: {
        SmartDashboard.putString("Default'd Solenoid Pos", "Entered Default Pos");
      }
    }
    

  }



  /*
  1. Gripper Extened
  2.
  3.
  4.
  5.
  6.
  7.
   */  



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
