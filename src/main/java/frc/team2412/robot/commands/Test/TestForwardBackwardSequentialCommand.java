package frc.team2412.robot.commands.Test;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.team2412.robot.subsystems.TestSubsystem;

public class TestForwardBackwardSequentialCommand extends SequentialCommandGroup {

	private TestSubsystem testSubsystem;

	public TestForwardBackwardSequentialCommand(TestSubsystem testSubsystem) {
		this.testSubsystem = testSubsystem;

		// adds the commands in order 4!!!!!!!!!!!!!!!!!!!!!!!!!!
		addCommands(
				new testForwardCommand(testSubsystem),
				new WaitCommand(4),
				new TestBackwardCommand(testSubsystem),
				new WaitCommand(4),
				new TestStopCommand(testSubsystem));
	}
}
