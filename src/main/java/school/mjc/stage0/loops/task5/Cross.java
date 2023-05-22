package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int h = 1; h <= sideLength; h++) {
            for (int l = 1; l <= sideLength; l++){
                if (h == ((sideLength - 1) / 2) + 1) {
                    System.out.print(8);
                } else {
                    if (l == ((sideLength - 1) / 2) + 1){
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
