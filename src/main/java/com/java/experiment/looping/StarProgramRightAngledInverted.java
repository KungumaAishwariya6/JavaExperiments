package com.java.experiment.looping;

public class StarProgramRightAngledInverted {

    public static void main(String[] args) {
        int depth=5;

        for(int i=depth;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


}
