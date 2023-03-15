package frc.team2412.robot.util.auto;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;

public class AutonomousChooser {
	public interface CommandSupplier {
		Command getCommand();
	}

	private final SendableChooser<CommandSupplier> autonomousModeChooser = new SendableChooser<>();

	public AutonomousChooser() {
		autonomousModeChooser.setDefaultOption(
				"FlatLeaveCom", () -> AutonomousTrajectories.getAutoPathByName("FlatLeaveCom"));
		autonomousModeChooser.addOption(
				"BumpLeaveCom", () -> AutonomousTrajectories.getAutoPathByName("RightLeaveCom"));
		autonomousModeChooser.addOption(
				"MiddleLeaveComCharge",
				() -> AutonomousTrajectories.getAutoPathByName("MiddleLeaveComCharge"));
		autonomousModeChooser.addOption(
				"FlatScoreLeaveCom", () -> AutonomousTrajectories.getAutoPathByName("LeftScoreLeaveCom"));
		autonomousModeChooser.addOption(
				"MiddleScoreLeaveComCharge",
				() -> AutonomousTrajectories.getAutoPathByName("MiddleScoreLeaveComCharge"));
		autonomousModeChooser.addOption(
				"BumpScoreLeaveCom", () -> AutonomousTrajectories.getAutoPathByName("RightScoreLeaveCom"));
		autonomousModeChooser.addOption(
				"FlatScoreLeaveCom2", () -> AutonomousTrajectories.getAutoPathByName("LeftScoreLeaveCom2"));
		autonomousModeChooser.addOption(
				"ChargePreloadSecPiece",
				() -> AutonomousTrajectories.getAutoPathByName("ChargePreloadSecPiece"));
		autonomousModeChooser.addOption(
				"BumpScoreTwo", () -> AutonomousTrajectories.getAutoPathByName("BotScoreTwo"));
		autonomousModeChooser.addOption(
				"FlatScoreTwo", () -> AutonomousTrajectories.getAutoPathByName("FlatScoreTwo"));
		autonomousModeChooser.addOption(
				"ChargePickup", () -> AutonomousTrajectories.getAutoPathByName("ChargePickup"));
		autonomousModeChooser.addOption(
				"ChargePickupBot", () -> AutonomousTrajectories.getAutoPathByName("ChargePickupBot"));
		autonomousModeChooser.addOption(
				"BumpScoreTwo", () -> AutonomousTrajectories.getAutoPathByName("BumpScoreTwo"));

		// There are more paths that have been created in the deploy/pathplanner path, they should work
		// however they have not been tested and thus are not added here yet.
		ShuffleboardTab autonomousTab = Shuffleboard.getTab("Autonomous");

		autonomousTab.add("Choose Auto Mode", autonomousModeChooser).withPosition(0, 0).withSize(2, 1);
	}

	public Command getAuto() {
		return autonomousModeChooser.getSelected().getCommand();
	}
}
