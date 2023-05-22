package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int h = 1; h <= height; h++) {
            for (int l = 1 ; l <= height; l++) {
                if (h >= l && h >= (height +1) - l ||(h <= l && h <= (height + 1 ) - l))
                {
                    System.out.print(8);
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
