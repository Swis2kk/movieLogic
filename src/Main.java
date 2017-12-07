import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] movieLength = {8, 5};
        int fligthLength = 10;

        System.out.println(checkIfPressent(fligthLength, movieLength));
    }

    public static boolean checkIfPressent (int fligthLength, int[] InputArray) {

        int size = InputArray.length;
        int half =size/2;
        int [] firHalf = new int[half];
        int [] secHalf = new int[half+1];

        //dividing InputArray in two parts and sorting each by value.

        for (int i=0; i<half; i++) {
            firHalf[i] = InputArray[i];
        }
        Arrays.sort(firHalf);

        for (int i=0; i<size-half; i++) {
            secHalf[i] = InputArray[i+half];
        }
        Arrays.sort(secHalf);

        //getting the highest value in each half but not longer them half flight time

        int highestFirst =0;
        for (int i=0; i<firHalf.length; i++) {
            if (fligthLength/2 >= firHalf[i]) {
                highestFirst = firHalf[i];
            }
        }

        int highestSecond = 0;
        for (int i=0; i<secHalf.length; i++) {
            if (fligthLength/2 >= secHalf[i]) {
                highestSecond = secHalf[i];
            }
        }

        if (highestFirst !=0 && highestSecond !=0) {
            return true;
        } else {
            return false;
        }
    }
}
