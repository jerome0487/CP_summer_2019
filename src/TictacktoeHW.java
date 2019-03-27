public class TictacktoeHW {
    public static void main(String[] args) {
        int [][] tictactoe = new int [][] {
            new int [] { -1 , 1 , 1},
            new int [] { 0 , 1 , 0},
            new int [] { 1 , 0 , 1},
        };

        // 1 represent X
        // -1 represent O
        //and 0 to represent an empty field


        for (int i=0;i<3;i++) {
            if (tictactoe[i][0]+tictactoe[i][1]+tictactoe[i][2] == 3 ) {
                System.out.println("X win");
            }
            break;
        }

        for (int i=0;i<3;i++) {
            if (tictactoe[i][0]+tictactoe[i][1]+tictactoe[i][2] == -3) {
                System.out.println("O win");
            }
            break;
        }

        for (int j=0;j<3;j++) {
            if (tictactoe[0][j]+tictactoe[1][j]+tictactoe[2][j] == 3) {
                System.out.println("X win");
            }
            break;
        }

        for (int j=0;j<3;j++) {
            if (tictactoe[0][j] + tictactoe[1][j] + tictactoe[2][j] == -3) {
                System.out.println("O win");
            }
            break;
        }

        if (tictactoe[0][0] + tictactoe[1][1] + tictactoe[2][2] == 3) {
            System.out.println("X win");
        }

        if (tictactoe[0][0] + tictactoe[1][1] + tictactoe[2][2] == -3) {
            System.out.println("O win");
        }

        if (tictactoe[0][2] + tictactoe[1][1] + tictactoe[2][0] == 3) {
            System.out.println("X win");
        }

        if (tictactoe[0][2] + tictactoe[1][1] + tictactoe[2][0] == -3) {
            System.out.println("O win");
        }





    }

}
