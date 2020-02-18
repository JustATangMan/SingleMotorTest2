/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.MotorDrive;

public class ButtonMotor extends SubsystemBase {
  /**
   * Creates a new DriveMotor.
   */
  // private final PWMVictorSPX motor;
  // private final PWMVictorSPX motor2;
  private final SpeedController motor3;
  private final SpeedController motor4;

  public ButtonMotor() {
    // motor = new PWMVictorSPX(0);
    // motor2 = new PWMVictorSPX(1);
    motor3 = new PWMVictorSPX(2);
    motor4 = new PWMVictorSPX(3);
  }

  public void auto() {
    // motor.set(0.25);
    // motor2.set(0.25);
    motor3.set(0.25);
    motor4.set(0.25);
  }

  public void drive(double speed) {
    // motor.set(speed);
    // motor2.set(speed);
    motor3.set(speed);
    motor4.set(speed);
  }

  public void stop() {
    // motor.stopMotor();
    // motor2.stopMotor();
    motor3.stopMotor();
    motor4.stopMotor();
  }

  @Override
  public void setDefaultCommand(Command defaultCommand) {
    // TODO Auto-generated method stub
    super.setDefaultCommand(new MotorDrive());
  }

  @Override
  public void periodic() {
    System.out.println("periodic");
    // This method will be called once per scheduler run
  }
}
