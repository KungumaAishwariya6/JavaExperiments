package com.java.experiment.looping;

public class StarProgramRightAngled180To270Degree {

    public static void main(String[] args) {

        int depth=5;

        int i,j;

        for(i=0;i<depth;i++){

            for(j=0;j<i;j++){
                System.out.print(" ");
            }

            for(j=depth-1;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
