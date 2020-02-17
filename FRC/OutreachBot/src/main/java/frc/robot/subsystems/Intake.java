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
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public WPI_TalonSRX rightIntakeMotor, leftIntakeMotor;
  public Intake(){
    rightIntakeMotor = new WPI_TalonSRX(RobotMap.rightIntakeMotor);
    leftIntakeMotor = new WPI_TalonSRX(RobotMap.leftIntakeMotor);
    rightIntakeMotor.setNeutralMode(NeutralMode.Brake);
    leftIntakeMotor.setNeutralMode(NeutralMode.Brake);
    rightIntakeMotor.setInverted(true);
  }
  public void setPower(double power){
    rightIntakeMotor.set(power);
    leftIntakeMotor.set(power);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

  }
}
