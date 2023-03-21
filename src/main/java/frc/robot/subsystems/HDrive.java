// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class HDrive extends SubsystemBase {

  /** Creates a new HDrive. */
  // private final DifferentialDrive d;
  public HDrive() {
  }

  public void hDriveControl(double x, double y, double z, boolean isSlowed) {

    if (!isSlowed) {
      // Tank Drive
      Constants.HDriveConstants.DIFFERENTIAL_DRIVE.arcadeDrive(x, z);

      // Central drive movement -- strafing
      Constants.HDriveConstants.k_middle_left_motor.set(ControlMode.PercentOutput, y);
      Constants.HDriveConstants.k_middle_right_motor.set(ControlMode.PercentOutput, y);
    }

    else if (isSlowed) {
      // Tank Drive
      Constants.HDriveConstants.DIFFERENTIAL_DRIVE.arcadeDrive(x * Constants.HDriveConstants.slow_drive_multiplier,
          z * Constants.HDriveConstants.slow_drive_multiplier);

      // Central drive movement -- strafing
      Constants.HDriveConstants.k_middle_left_motor.set(ControlMode.PercentOutput,
          y * Constants.HDriveConstants.slow_drive_multiplier);
      Constants.HDriveConstants.k_middle_right_motor.set(ControlMode.PercentOutput,
          y * Constants.HDriveConstants.slow_drive_multiplier);
    }

    else {
            // Tank Drive
            Constants.HDriveConstants.DIFFERENTIAL_DRIVE.arcadeDrive(x, z);

            // Central drive movement -- strafing
            Constants.HDriveConstants.k_middle_left_motor.set(ControlMode.PercentOutput, y);
            Constants.HDriveConstants.k_middle_right_motor.set(ControlMode.PercentOutput, y);
    }

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
