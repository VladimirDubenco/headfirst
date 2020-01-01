package testarrays;

/**
 *
 * @author Vladimir
 */
public class TestArrays {

    public static void main(String[] args) {
        int ref;
        int y = 0;
        int index[] = new int[4];
        String[] islands = new String[4];
        islands[0] = "Bermudas";
        islands[1] = "Fiji";
        islands[2] = "Azure";
        islands[3] = "Cosumel";
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        while (y < 4) {
            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }

}
