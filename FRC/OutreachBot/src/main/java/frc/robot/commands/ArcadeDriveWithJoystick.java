/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDriveWithJoystick extends Command {
  double speed;
  double rotation;
  public ArcadeDriveWithJoystick() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.drivetrain.tankDrive(0, 0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    speed = Robot.m_oi.driveStick.getRawAxis(RobotMap.LY);
    rotation = Robot.m_oi.driveStick.getRawAxis(RobotMap.RX);
    Robot.drivetrain.arcadeDrive(speed, rotation);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drivetrain.tankDrive(0, 0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
