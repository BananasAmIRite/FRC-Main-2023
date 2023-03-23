package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.util.DriverController;

public class FastDrive extends RunCommand {
    public FastDrive(Drivetrain drivetrain, DriverController driverController){
        super(() -> {
            drivetrain.arcadeDrive(driverController.getFastThrottle(), driverController.getFastTurn());
        }, drivetrain);
    }
}
