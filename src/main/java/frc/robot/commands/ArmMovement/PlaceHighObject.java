// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ArmMovement;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.AutoArmMovement;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class PlaceHighObject extends SequentialCommandGroup {
  /** Creates a new PlaceHighObject. */
  public PlaceHighObject() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
        // new command
        new WaitCommand(AutoArmMovement.kPnuematicWaitTime),
        // new arm command
        new WaitCommand(AutoArmMovement.kPnuematicWaitTime));
  }
}
