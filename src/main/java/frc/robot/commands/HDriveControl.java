// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HDrive;

public class HDriveControl extends CommandBase {
  private final HDrive h_Drive;
  private final double m_x;
  private final double m_y;
  private final double m_z;

  /** Creates a new HDriveControl. */
  public HDriveControl(double x, double y, double z, HDrive sub) {
    m_x = x;
    m_y = y;
    m_z = z;
    h_Drive = sub;

    addRequirements(sub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    h_Drive.hDriveControl(m_x, m_y, m_z);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
