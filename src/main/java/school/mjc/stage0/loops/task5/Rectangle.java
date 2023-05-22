package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int h = 1; h <= height; h++) {
            for (int l = 1; l <= length; l++){
                if (h == 1 || h == height) {
                    System.out.print(8);
                } else {
                    if (l == 1 || l == length) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
