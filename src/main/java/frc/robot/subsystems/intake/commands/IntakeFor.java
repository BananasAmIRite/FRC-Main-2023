package frc.robot.subsystems.intake.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;
import frc.robot.Constants.Intake.ScoreSpeed;
import frc.robot.subsystems.intake.Intake;

public class IntakeFor extends SequentialCommandGroup {
    public IntakeFor(Intake intake, ScoreSpeed speed, double time) {
        addCommands(new ParallelRaceGroup(new RunCommand(() -> {
            if (speed == ScoreSpeed.FAST) {
                intake.intakeFast();
            } else {
                intake.intakeSlow();
            }
        }), new WaitCommand(time)), new InstantCommand(intake::off, intake));

        addRequirements(intake);
    }
    
}
