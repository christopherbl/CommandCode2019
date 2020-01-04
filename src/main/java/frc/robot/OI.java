/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeInOut;
//import frc.robot.subsystems.DriveTrain;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  //Joystick driveJoystick, buttonsJoystick, driveController, buttonsController;
  
  // public Joystick driveJoystick = new Joystick(RobotMap.driveJoystick);
  //public Joystick buttonsJoystick = new Joystick(RobotMap.buttonsJoystick);

  public Joystick driveController = new Joystick(RobotMap.driveController);

  public Joystick buttonsController = new Joystick(RobotMap.buttonsController);

  Button button1 = new JoystickButton(buttonsController, 1);



public OI(){

  //Get trigger pull to send to IntakeInOut command
  //driveController_1.whenPressed(new IntakeInOut()); //uses boolean Robot.intakeOut to track state
  //true = extended out

  button1.whenPressed(new IntakeInOut());
  


}

}

