package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.subsystems.arm.Arm;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.subsystems.drivetrain.commands.MoveBackward;
import frc.robot.subsystems.drivetrain.commands.TurnBy;
import frc.robot.subsystems.drivetrain.commands.TurnToAngle;
import frc.robot.subsystems.intake.Intake;

public class BottomLaneAuto extends SequentialCommandGroup {
    public BottomLaneAuto(Drivetrain drivetrain, Arm arm, Intake intake, Constants.Arm.ScoringPosition position) {

        addCommands(new Score(arm, intake, position), new MoveBackward(drivetrain, 5));

        // double BOTTOM_TURN_ANGLE_RED = 30; 
        // double allianceMultiplier = DriverStation.getAlliance() == Alliance.Red ? 1 : -1; 
        // switch(position) {
        //     case HIGH_CUBE: 
        //     case MID_CUBE:
        //     case LOW_CUBE: 
        //         addCommands(
        //             new Score(arm, intake, position), 
        //             new MoveBackward(drivetrain, 0.5), 
        //             new TurnBy(drivetrain, BOTTOM_TURN_ANGLE_RED * allianceMultiplier), 
        //             new MoveBackward(drivetrain, 0.5), 
        //             new TurnBy(drivetrain, -BOTTOM_TURN_ANGLE_RED * allianceMultiplier), 
        //             new MoveBackward(drivetrain, 4)
        //         );
        //         break;
        //     case HIGH_CONE: 
        //     case MID_CONE:
        //     case LOW_CONE:
        //         addCommands(
        //             new Score(arm, intake, position), 
        //             new MoveBackward(drivetrain, 5)
        //         ); 
        //         break; 
        // }

    }
}
