package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp (name = "25-26 teleop test")
    public StarterBotHardware robot = new StarterBotHardware();
    @Override
    public void init() {robot.init(this.hardwareMap);}

    @Override
    public void loop() {
        double dr = gamepad1.right_stick_y;
        double dl = gamepad1.left_stick_y;
        robot.dl.setPower(dl);
        robot.dr.setPower(dr);
    }
}