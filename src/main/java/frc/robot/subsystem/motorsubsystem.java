package frc.robot.subsystem;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class motorsubsystem extends SubsystemBase {
    private final SparkMax m_motor = new SparkMax(1, MotorType.kBrushless);

    public void runIntake() {
        m_motor.set(0.8);
    }

    public void stopIntake() {
        m_motor.set(0.0);
    }

}