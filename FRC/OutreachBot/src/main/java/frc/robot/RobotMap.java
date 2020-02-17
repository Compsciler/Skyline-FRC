/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static int switchSolenoidPort = 0;

  public static int leftFrontMotorPort = 0;
  public static int leftBackMotorPort = 1;
  public static int rightFrontMotorPort = 2;
  public static int rightBackMotorPort = 3;

  public static int rightIntakeMotor = 4;
  public static int leftIntakeMotor = 5;

  public static int driveStickPort = 0;

  public static int A = 1;
  public static int B = 2;
  public static int X = 3;
  public static int Y = 4;
  public static int LBumper = 5;
  public static int RBumper = 6;
  public static int LJoystickButton = 9;
  public static int RJoystickButton = 10;

  public static int Lx = 0;
  public static int LY = 1;
  public static int LTrigger = 2;
  public static int RTrigger = 3;
  public static int LX = 4;
  public static int RX = 5;
}
