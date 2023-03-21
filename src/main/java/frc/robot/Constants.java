// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final boolean kEnableJoystickButtons = true;

    /* Following are the ids assigned to each Solenoid Object which is used in choosing which buttons toggle  */


  }

  public static class SolenoidConstants {
    // Cube Control
    private static final int kCubeGripperOpen = 0;
    private static final int kCubeGripperClose = 1;
    public static final DoubleSolenoid CubeManipulator = new DoubleSolenoid(PneumaticsModuleType.REVPH,
        kCubeGripperOpen, kCubeGripperClose); // Creating double solenoid objects for each of our manipulators
    public static final Value CubeM_StartState = Value.kReverse;

    // UpperArm movement
    private static final int kUpperArmExtend = 2;
    private static final int kUpperArmRetract = 3; // 10in -- Retracts 7inHyperExtends rotator
    public static final DoubleSolenoid Upper10Manip = new DoubleSolenoid(PneumaticsModuleType.REVPH, kUpperArmExtend,
        kUpperArmRetract);
    public static final Value Upper10M_StartState = Value.kReverse;

    private static final int kUpperAdditionalExtend = 4;
    private static final int kUpperAdditionalRetraction = 5;
    public static final DoubleSolenoid UpperHyperExtender = new DoubleSolenoid(PneumaticsModuleType.REVPH,
        kUpperAdditionalExtend, kUpperAdditionalRetraction);
    public static final Value UpperHE_StartValue = Value.kReverse;

    private static final int kUpperArmRotationOpen = 12;
    private static final int kUpperArmRotationClose = 13;
    public static final DoubleSolenoid kUpperRotator = new DoubleSolenoid(PneumaticsModuleType.REVPH,
        kUpperArmRotationOpen, kUpperArmRotationClose);
    public static final Value UpperR_StartState = Value.kReverse;

    // Lower Arm Movement
    private static final int LowerArmRotationOpen = 6;
    private static final int LowerArmRotationClose = 7;
    public static final DoubleSolenoid kLowerArmRotation = new DoubleSolenoid(PneumaticsModuleType.REVPH,
        LowerArmRotationOpen, LowerArmRotationClose);
    public static final Value LAR_StartState = Value.kReverse;

    private static final int LowerArmExtend = 8;
    private static final int LowerArmRetract = 9;
    public static final DoubleSolenoid kLowerManip = new DoubleSolenoid(PneumaticsModuleType.REVPH, LowerArmExtend,
        LowerArmRetract);
    public static final Value LM_StartState = Value.kReverse;

    // Cone Movement
    private static final int kConeGripperOpen = 10;
    private static final int kConeGripperClose = 11;
    public static final DoubleSolenoid kConeManip = new DoubleSolenoid(PneumaticsModuleType.REVPH, kConeGripperOpen,
        kConeGripperClose);
    public static final Value ConeM_StartState = Value.kReverse;
    /*
     * 1. GripperCube 2in
     * 2. GripperCone 1in
     * 3. UpperArmExtend
     * 4. UpperArmRotation
     * 5. UpperArmRetraction
     * 6. LowerArmRotation
     * 7. LowerArmExtend [0,1]
     */
  }

  public static class HDriveConstants {
    // 6 Drive Motors
    /*
     * m1 m2
     * 
     * m5m6
     * 
     * m3 m4
     */

    private static final WPI_TalonFX k_front_left_motor = new WPI_TalonFX(0);
    private static final WPI_TalonFX k_back_left_motor = new WPI_TalonFX(1);

    private static final WPI_TalonFX k_front_right_motor = new WPI_TalonFX(2);
    private static final WPI_TalonFX k_back_right_motor = new WPI_TalonFX(3);

    public static final WPI_TalonFX k_middle_left_motor = new WPI_TalonFX(4); // maybe when turning
    public static final WPI_TalonFX k_middle_right_motor = new WPI_TalonFX(5);

    private static final MotorControllerGroup LEFT_MOTOR_CONTROLLER_GROUP = new MotorControllerGroup(k_front_left_motor,
        k_back_left_motor);
    private static final MotorControllerGroup RIGHT_MOTOR_CONTROLLER_GROUP = new MotorControllerGroup(k_front_right_motor,
        k_back_left_motor);

    public static final DifferentialDrive DIFFERENTIAL_DRIVE = new DifferentialDrive(RIGHT_MOTOR_CONTROLLER_GROUP,
        LEFT_MOTOR_CONTROLLER_GROUP);

    //How much to slowdown drivertrain during slow driving mode
    public static final double slow_drive_multiplier = 0.5;

  }

  public static class AutoArmMovement {
    public static final double kPnuematicWaitTime = 0.5;
  }

}
