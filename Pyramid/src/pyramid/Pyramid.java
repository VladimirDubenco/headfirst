package pyramid;
//////////////////////////////////////////////// De verificat cu indexii

import java.util.Random;


/**
 *
 * @author Vladimir
 */
public class Pyramid {

    final int size = 10;
    int[][] triangleMatrix;                                                     //initializare M
    int randval;
    
    Random rand;

    void createPyramid() {
        this.triangleMatrix = new int[size][];                                        //initialize number of rows (size)
        for (int i = 0; i < size; i++) {
            this.triangleMatrix[i] = new int[i+1];
        }//for i
        
        rand = new Random();
        for (int i = 0; i < triangleMatrix.length; i++) {
            for (int j = 0; j < triangleMatrix[0].length; j++) {

//                rand = (int) ((int) 100 * Math.random());
                this.triangleMatrix[i][j] = 1+rand.nextInt(100);
            }

        }

    }//createPyramid()

    void printPyramid() {
        for (int i = 0; i < size ; i++) {
            //  this.triangleMatrix[i] = new int[i+1];

            for (int j = 0; j < size; j++) {
                System.out.print(this.triangleMatrix[i][j] + "  ");
            }//for j
            System.out.println(" ");
        }//for i
    }//printPyramid()

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.createPyramid();
//        p.printPyramid();

    }//main()

}//Pyramid
