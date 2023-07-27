package com.java.experiment.dsa;

public class SetMatrixToZero {

    public static void main(String[] args) {

        int[][] matrix= new int[][]{{1,1,1},{5,0,6},{0,8,9}};

        int rowLength= matrix.length;
        int columnLength= matrix[0].length;
        int[][] zeroedMatrix= setZero(matrix,rowLength,columnLength);

        for(int row=0;row<rowLength;row++){
            for(int column=0;column<columnLength;column++){
                System.out.print(matrix[row][column]+" ");
            }
                System.out.println();
            }
    }

    private static int[][] setZero(int matrix[][], int rowLength, int columnLength){


        int column0=1;

        //mark first row and first column as zero and also column[0] as zero for reference

        for(int row=0;row<rowLength;row++){
            for(int column=0;column<columnLength;column++){
                if(matrix[row][column]==0){
                    //mark row as zero
                    matrix[row][0]=0;
                    //mark column as zero
                    if(column!=0){
                        matrix[0][column]=0;
                    }else {
                        column0=0;
                    }
                }
            }
        }

        //set rest of the elements as zero

        for(int row=1;row<rowLength;row++){
            for(int column=1;column<columnLength;column++){
                if(matrix[row][column]!=0){
                    if(matrix[row][0]==0||matrix[0][column]==0){
                        matrix[row][column]=0;
                    }
                }
            }

        }

        //set first row and first column as zero and also column[0] as zero

        if(matrix[0][0]==0){
            for(int column=0;column<columnLength;column++){
                matrix[0][column]=0;
            }
        }

        if(column0==0){
            for(int row=0;row<rowLength;row++){
                matrix[row][0]=0;
            }
        }

        return matrix;
    }
}
