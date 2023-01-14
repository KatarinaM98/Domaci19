import java.lang.reflect.Array;

public class Zadatak2 {
    public static void main(String[] args) {
        int [] array = {2, 5, 6, 5};
        deljenjeSa5(array);
        System.out.println(deljenjeSa5(array));

        System.out.println(mnozenjeSa5(array));


    }

    public static double deljenjeSa5 (int [] array) {
        double deljenje = array [0]/5;
        double deljenje1 = array [1]/5;
        double deljenje2 = array [2]/5;
        double deljenje3 = array [3]/5;

       double deljenjeX = deljenje + deljenje1 + deljenje2 + deljenje3;
                return deljenjeX;
    }

    public static double mnozenjeSa5 (int [] array) {
        double deljenje = array [0]*5;
        double deljenje1 = array [1]*5;
        double deljenje2 = array [2]*5;
        double deljenje3 = array [3]*5;

        double deljenjeX = deljenje + deljenje1 + deljenje2 + deljenje3;
        return deljenjeX;
    }

}
