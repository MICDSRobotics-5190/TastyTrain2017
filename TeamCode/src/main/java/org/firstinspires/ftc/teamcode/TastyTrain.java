package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * TastyTrain
 * @author Alex Migala
 * @since 9/7/17
 */
public class TastyTrain extends OpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private Servo leftServo;
    private Servo rightServo;

    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");

        leftServo = hardwareMap.servo.get("left_servo");
        rightServo = hardwareMap.servo.get("right_servo");
    }

    public void loop() {
        leftMotor.setPower(gamepad1.left_stick_y);
        rightMotor.setPower(gamepad2.right_stick_y);
    }
}