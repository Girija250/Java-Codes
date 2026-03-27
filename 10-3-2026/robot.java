public class robot {
    public boolean judgeCircle(String moves) {
        int x = 0 , y = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U' : y++; break;
                case 'D' : y--; break;
                case 'L' : x--; break;
                case 'R' : x++; break;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        robot obj = new robot();

        String moves1 = "UD";
        String moves2 = "LL";

        System.out.println("Moves: " + moves1 + " -> " + obj.judgeCircle(moves1));
        System.out.println("Moves: " + moves2 + " -> " + obj.judgeCircle(moves2));

    }
}
