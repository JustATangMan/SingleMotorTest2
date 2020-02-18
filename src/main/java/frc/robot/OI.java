package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.MotorDrive;
import edu.wpi.first.wpilibj2.command.button.*;

public class OI {

    private final Joystick logi = new Joystick(0);
    private final Button button;

    public OI() {
        button = new JoystickButton(logi, 2);
        button.whileHeld(new MotorDrive());
    }

    public boolean wheelCheck() {
        return button.get();
    }

    public Joystick getLogi() {
        return logi;
    }
}