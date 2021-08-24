package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Config
@Autonomous
public class dashTest extends OpMode {

    DcMotor fl;

    public static double velocity;

    @Override
    public void init() {
        fl = hardwareMap.dcMotor.get("fl");
        fl.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        velocity = 0.1;
    }

    @Override
    public void loop() {

        fl.setPower(velocity);
    }
}
