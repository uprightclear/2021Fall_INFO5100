package final_1;

public class Main {
    public static void main(String[] args) {
        int[][] room = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, -1, 0}
        };

        Roomba robot = new Roomba(room);
    }
}
