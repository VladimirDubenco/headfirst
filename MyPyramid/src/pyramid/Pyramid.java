package pyramid;


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
        triangleMatrix = new int[size][];                                        //initialize number of rows (size)
        for (int i = 0; i < size; i++) {
            triangleMatrix[i] = new int[i];
        }
        
        rand = new Random();
        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < triangleMatrix[0].length; j++) {
              for (int j = 0; j < i; j++) {
//                rand = (int) ((int) 100 * Math.random());
                triangleMatrix[i][j] = 1+rand.nextInt(100);
            }

        }

    }//createPyramid()

    void printPyramid() {
        for (int i = 0; i < size ; i++) {
            //  this.triangleMatrix[i] = new int[i+1];
            for (int k = 0; k < 40+i; k++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++) {
                if (triangleMatrix[i][j] < 10) {
                    System.out.print(triangleMatrix[i][j] + "   ");
                } else {
                    System.out.print(triangleMatrix[i][j] + "  ");
                }
                
            }//for j
            System.out.println(" ");
        }//for i
    }//printPyramid()

    public static void main(String[] args) {
        Pyramid p = new Pyramid();
        p.createPyramid();
        p.printPyramid();

    }//main()

}//Pyramid
