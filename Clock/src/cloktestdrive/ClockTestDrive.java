
package cloktestdrive;

/**
 *
 * @author Vladimir
 */
public class ClockTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Clock c = new Clock();
    c.setTime("12:34");
    String tod = c.getTime();
        System.out.println("Time:" + tod);
    }
    
}
