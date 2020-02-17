/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor;
  public SpeedControllerGroup left, right;

  public DifferentialDrive m_drive;

  public DriveTrain(){
    leftFrontMotor = new WPI_TalonSRX(RobotMap.leftFrontMotor);
    leftBackMotor = new WPI_TalonSRX(RobotMap.leftBackMotor);
    rightFrontMotor = new WPI_TalonSRX(RobotMap.rightFrontMotor);
    rightBackMotor = new WPI_TalonSRX(RobotMap.rightBackMotor);

    leftFrontMotor.setNeutralMode(NeutralMode.Brake);
    leftBackMotor.setNeutralMode(NeutralMode.Brake);
    rightFrontMotor.setNeutralMode(NeutralMode.Brake);
    rightBackMotor.setNeutralMode(NeutralMode.Brake);

    left = newSpeedControllerGroup(leftFrontMotor, leftBackMotor);
    right = newSpeedControllerGroup(rightFrontMotor, rightBackMotor);

    m_drive = new DifferentialDrive(left, right);
  }
  public void tankDrive(double leftSpeed, double rightSpeed){
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }
  public void arcadeDrive(double forward, double turn){
    m_drive.arcadeDrive(forward, turn);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDriveWithJoystick());
  }
}
