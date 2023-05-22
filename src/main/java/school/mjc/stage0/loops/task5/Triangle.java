package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int h = 1; h <= cathetusLength; h++) {
            for (int l = 1; l <= h; l++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}