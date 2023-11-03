package frc.team2412.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import com.revrobotics.SparkMaxAbsoluteEncoder.Type;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestSubsystem extends SubsystemBase {

	// CONSTANTS ARE ALWAYS IN ALL CAPS

	private final double MOTOR_SPEED = 0.5;
	private final double MAX_ANGLE = 60;

	private final CANSparkMax motor;
	private final SparkMaxAbsoluteEncoder motorEncoder;

	// constructor

	public TestSubsystem() {

		// initialize the variables that are important
		this.motor = new CANSparkMax(60, MotorType.kBrushless);
		this.motorEncoder = motor.getAbsoluteEncoder(Type.kDutyCycle);

		// configure the hardware

		motor.setIdleMode(IdleMode.kBrake);
	}

	// GETTER
	public double getSpeed() {

		return motor.get();
	}
	// WE GET THE ANGLES (IGNORE THIS)
	public double getAngle() {

		return motorEncoder.getPosition();
	}

	public void setMotorForward() {
		motor.set(MOTOR_SPEED);
	}

	public void setMotorReverse() {
		motor.set(-MOTOR_SPEED);
	}

	public void setMotor(double speed) {
		motor.set(speed);
	}

	// kinda a while loop, but for while motor on
	public void periodic() {
		// repeatedly print the current angle
		System.out.println(getAngle());
	}
}
