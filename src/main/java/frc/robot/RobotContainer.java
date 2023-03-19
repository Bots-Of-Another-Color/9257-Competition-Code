package frc.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.*;
import frc.robot.subsystems.*;


public class RobotContainer {   

/* Controllers */
    private final SendableChooser<Command> autoChooser = new SendableChooser<>();
    private final Joystick joystick = new Joystick(0);//joystick, this should be registering in port 0 of your driver station
    private final Joystick xbox = new Joystick(1); //xbox controller, this should be registering in port 1 of your driver station

    
//Controls

//Driving, this is where you declare the axis that your robot will drive off of
    private final int translationAxis = joystick.getYChannel();
    private final int strafeAxis = joystick.getXChannel();
    private final int rotationAxis = joystick.getZChannel();

//Driver Buttons, this is where you declare the diffent buttons and keybinds, and give them the name.//
    private final JoystickButton button1 = new JoystickButton(joystick, 1);
    private final JoystickButton button2 = new JoystickButton(joystick, 2);
    private final JoystickButton button3 = new JoystickButton(joystick, 3);
    private final JoystickButton button4 = new JoystickButton(joystick, 4);
    private final JoystickButton button5 = new JoystickButton(joystick, 5);
    private final JoystickButton button6 = new JoystickButton(joystick, 6);
    private final JoystickButton button7 = new JoystickButton(joystick, 7);

//Operator Buttons, this is where you declare the diffent buttons and keybinds, and give them the name.//
    private final JoystickButton leftbumper = new JoystickButton(xbox, XboxController.Button.kRightBumper.value);
    private final JoystickButton rightbumper = new JoystickButton(xbox, XboxController.Button.kRightBumper.value);
    private final JoystickButton abutton = new JoystickButton(xbox, XboxController.Button.kA.value);
    private final JoystickButton xbutton = new JoystickButton(xbox, XboxController.Button.kX.value);
    private final JoystickButton ybutton = new JoystickButton(xbox, XboxController.Button.kY.value);
    private final JoystickButton bbutton = new JoystickButton(xbox, XboxController.Button.kB.value);

/* Subsystems, this is where you declare the subsystems you are using on your robot */
  private final solenoidcontrol m_solenoidcontrol = new armSub();

/*This is where you declare the driving commands for your robot. 
This says that the x axis will control translation movement, Y will control strafing, and z will change the rotaiton*/
    public RobotContainer() {
      hdrive.setDefaultCommand(

      new hdrive(
        joystick.getRawAxis(translationAxis),
        joystick.getRawAxis(strafeAxis),
        joystick.getRawAxis(rotationAxis)
      ));
        configureButtonBindings();
    }
    private void configureButtonBindings() {
        /* Driver Buttons to change the binding button, change the left bumper, right bumper, et cetera to a different butotn */
       button1.onTrue(new InstantCommand(() -> kCubeGripperOpen()));
       button2.onTrue(new InstantCommand(() -> kCubeGripperClose()));
       button3.onTrue(new InstantCommand(() -> kUpperArmExtend()));
       button4.onTrue(new InstantCommand(() -> kUpperArmRetract()));
       button5.onTrue(new InstantCommand(() -> kLowerArmExtend()));
       button6.onTrue(new InstantCommand(() -> kLowerArmRetract()));
       button7.onTrue(new InstantCommand(() -> /*solenoid command*/()));

       /*Operator Buttons to change the binding button, change the left bumper, right bumper, et cetera to a different butotn*/
       leftbumper.onTrue(new InstantCommand(() -> /*solenoid command*/()));
       rightbumper.onTrue(new InstantCommand(() -> /*solenoid command*/()));
       abutton.onTrue(new InstantCommand(() -> /*solenoid command*/()));
       xbutton.onTrue(new InstantCommand(() -> /*solenoid command*/()));
       ybutton.onTrue(new InstantCommand(() -> /*solenoid command*/()));
       bbutton.onTrue(new InstantCommand(() -> /*solenoid command*/()));
    }
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
      //An ExampleCommand will run in autonomous
    return autoChooser.getSelected();
  }
}
