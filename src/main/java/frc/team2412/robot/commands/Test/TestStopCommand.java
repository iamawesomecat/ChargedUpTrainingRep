package frc.team2412.robot.commands.Test;

import javax.naming.InitialContext;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.subsystems.TestSubsystem;
 

public class TestStopCommand extends CommandBase{
    
    //variables
    
    private TestSubsystem testSubsystem;

    
    
    //Contructing timeeee
    public TestStopCommand(TestSubsystem testSubsystem) {
        this.testSubsystem = testSubsystem;


        //makes it so you cant use multiple comands at once in a subsystem  
        addRequirements(testSubsystem);
    }

    @Override
    public void initialize() {
        //this will be runned upon initialization
        testSubsystem.setMotor(0);
    }

    @Override
    public void execute(){
        //loops set of code on robot


    }
    @Override
    public void end(boolean interrupted) {
        //runs when command stops. Opposite of initialize

    }
    @Override
    public boolean isFinished(){
        return true;
    }

}
