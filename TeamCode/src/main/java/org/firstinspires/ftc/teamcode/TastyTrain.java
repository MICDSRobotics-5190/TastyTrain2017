package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * TastyTrain
 * @author Alex Migala
 * @since 9/7/17
 */
@TeleOp(name = "Tasty Train", group = "Driver")
public class TastyTrain extends OpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private Servo leftServo;
    private Servo rightServo;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        leftServo = hardwareMap.servo.get("left_servo");
        rightServo = hardwareMap.servo.get("right_servo");
    }

    @Override
    public void loop() {
        leftMotor.setPower(gamepad1.left_stick_y);
        rightMotor.setPower(gamepad1.right_stick_y);

        if (gamepad1.a) {
            leftServo.setPosition(1);
            rightServo.setPosition(0);
        } else if (gamepad1.b){
            leftServo.setPosition(0);
            rightServo.setPosition(1);
        }
    }

    @Override
    public void stop() {
    }
}