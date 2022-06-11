package com.blz;
import java.util.Random;

public class EmpWage {
        public static final int IS_PRESENT = 1;
        public static final int EMP_RATE_PER_HOUR = 20;

        public static int empHrs = 0;

        private static void wageComputation() {
            Random random = new Random();
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_PRESENT) {
                System.out.println("Employee is Present ");
                empHrs = 8;
            } else {
                System.out.println("Employee is Absent ");
            }

            int empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage is : " + empWage);
        }


        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            wageComputation();
        }
    }