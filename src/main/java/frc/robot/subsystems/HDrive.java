// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class HDrive extends SubsystemBase {
  /** Creates a new HDrive. */
  //private final DifferentialDrive d;
  public HDrive() {
  }

  public void hDriveControl(double x, double y, double z){
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
