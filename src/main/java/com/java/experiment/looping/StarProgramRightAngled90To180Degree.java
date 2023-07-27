package com.java.experiment.looping;

public class StarProgramRightAngled90To180Degree {

    public static void main(String[] args) {
        int depth = 5;

        for (int i = 0; i < depth; i++) {
            for (int j = 2 * (depth - i); j >=0; j--) {
                System.out.print(" ");
            }


            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
