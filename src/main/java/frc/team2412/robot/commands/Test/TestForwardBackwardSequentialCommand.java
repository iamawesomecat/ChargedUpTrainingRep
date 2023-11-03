package frc.team2412.robot.commands.Test;

import javax.naming.InitialContext;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.team2412.robot.subsystems.TestSubsystem;
 import edu.wpi.first.wpilibj2.command.WaitCommand;

public class TestForwardBackwardSequentialCommand extends SequentialCommandGroup {


    private TestSubsystem testSubsystem;

    public TestForwardBackwardSequentialCommand(TestSubsystem testSubsystem){
        this.testSubsystem = testSubsystem;



        //adds the commands in order 4!!!!!!!!!!!!!!!!!!!!!!!!!!
        addCommands(new testForwardCommand(testSubsystem), new WaitCommand(4), new TestBackwardCommand(testSubsystem), new WaitCommand(4), new TestStopCommand(testSubsystem));
    }

}
