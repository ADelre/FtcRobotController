package org.firstinspires.ftc.robotcontroller.custom.opmodes;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

/***********************************************************************
 *                                                                      *
 * OnbotJava Editor is still : beta! Please inform us of any bugs       |
 * on our discord channel! https://discord.gg/e7nVjMM                   *
 * Only BLOCKS code is submitted when in Arena                          *
 *                                                                      *
 ***********************************************************************/


public class MyFIRSTJavaOpMode extends LinearOpMode {
    CRServo leftWheel;
    CRServo rightWheel;
    DcMotor backLeftDrive;
    DcMotor backRightDrive;
    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor wrist;
    DcMotor leftShoulder;
    DcMotor rightShoulder;
    BNO055IMU imu;

    @Override
    public void runOpMode() {
        //
        backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
        backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
        frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
        frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
        //
        leftWheel = hardwareMap.get(CRServo.class, "leftWheel");
        rightWheel = hardwareMap.get(CRServo.class, "rightWheel");
        //
        wrist = hardwareMap.get(DcMotor.class, "wrist");
        //
        leftShoulder = hardwareMap.get(DcMotor.class, "leftShoulder");
        rightShoulder = hardwareMap.get(DcMotor.class, "rightShoulder");

        imu = hardwareMap.get(BNO055IMU.class, "imu");
        // Put initialization blocks here
        waitForStart();
        // Put run blocks here
        while (opModeIsActive()) {
            // Put loop blocks here
        }
    }

}
