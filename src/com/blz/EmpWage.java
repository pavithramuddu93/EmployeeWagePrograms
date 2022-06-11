package com.blz;
import java.util.Random;

public class EmpWage {

    public static final int IS_PRESENT = 1;

        private static void wageComputation() {
            Random random = new Random();
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_PRESENT) {
                System.out.println("Employee is Present ");
            } else {
                System.out.println("Employee is Absent ");
            }
        }


        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            wageComputation();
        }
    }