package frc.team2412.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorController, java.lang.AutoCloseable;
import com.revrobotics.CANSparkMax.IdleMode;

public class TestSubsystem extends SubsystemBase {
    
    //CONSTANTS ARE ALWAYS IN ALL CAPS


    private final double MOTOR_SPEED = 0.5;
    private final double MAX_ANGLE = 60;


    private final CANSparkMax motor;
    private final SparkMaxAbsoluteEncoder motorEncoder;
    
    
    
    
    //constructor 
    
public TestSubsystem(){

        //initialize the variables that are important
        this.motor = new CANSparkMax(0, MotorType.kBrushless)
        this.motorEncoder = motor.getAbsoluteEncoder();


        //configure the hardware

        motor.setIdleMode(IdleMode.kBrake);
    }

    //GETTER
    public double getSpeed(){

        return motor.get();


    }

    public double getAngle(){ 

        return motorEncoder.getPosition
    }


    public void setSpeed(){
        motor.set(MOTOR_SPEED);
    }

    public void setMotor(double speed){
        motor.setSpeed(speed)
    }

    // kinda a while loop, but for while motor on
    public void periodic() {
        //repeatedly print the current angle
        System.out.println(getAngle());
    }

}