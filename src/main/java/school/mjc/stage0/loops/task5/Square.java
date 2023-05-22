package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int h = 1; h <= sideLength; h++) {
            for (int l = 1; l <= sideLength; l++){
                if (h == 1 || h == sideLength) {
                    System.out.print(8);
                } else {
                    if (l == 1 || l == sideLength) {
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
