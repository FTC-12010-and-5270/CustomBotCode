package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp (name = "TeleopALl")
public class Teleop extends OpMode {
    public hardware robot = new hardware();

    @Override
    public void init(){robot.init(this.hardwareMap);}
    @Override
    public void loop(){
        double r = -gamepad1.right_stick_y;
        double l = -gamepad1.left_stick_x;
        double shoot = -gamepad2.left_trigger;
        double intake = -gamepad2.right_trigger;
        if -gamepad2.a == true{
            intake=gamepad2.right_trigger;
        }

        robot.backright.setPower(r);
        robot.backleft.setPower(l);
        robot.frontright.setPower(r);
        robot.frontleft.setPower(l);
        robot.shooter.setPower(shoot);
        robot.intake.setPower(intake);
        telemetry.addData("RR",RR);
        telemetry.addData("FR", FR);
        telemetry.addData("FL", FL);
        telemetry.addData("RL", RL);
    }
}
