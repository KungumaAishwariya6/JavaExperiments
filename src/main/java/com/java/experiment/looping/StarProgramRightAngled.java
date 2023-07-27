package com.java.experiment.looping;

public class StarProgramRightAngled {

    public static void main(String[] args) {
        int height=5;
        for(int row=0;row<height;row++){ //row
            for(int column=0;column<=row;column++){ //column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
