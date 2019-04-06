/*
 * author : Meghna Tolani
 * To run on online compilers rename the class TicTacToe to Main
 * */

import java.util.*;

public class TicTacToe {

    static String[][] ticTacToe;
    static String[] nameOfPlayers;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=0;
        int n=0;
        int numberOfPlayers=0;

        try {
            do {
                System.out.print("Enter the value of N for (N X N) Tic Tac Toe. ");
                System.out.println("[ Minimum Value - 3 ]");
                n = sc.nextInt();
                System.out.print("Number Of Players : ");
                System.out.println("[ Minimum Value - 2 , Number Of Players should be less than N ] ");
                numberOfPlayers = sc.nextInt();
            } while (n < 3 || numberOfPlayers > n || numberOfPlayers < 2);

            nameOfPlayers = new String[numberOfPlayers];

            System.out.println("Name Of Players : ");
            while (numberOfPlayers-- > 0) {
                nameOfPlayers[x++] = sc.next();
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input ! ");
            System.exit(0);
        }
        make(n);
        winningSequence();

        if(checkWinner()) System.out.println("THERE IS A WINNER");
        else System.out.println("NO WINNER");

    }

    static void make(int n){

        Random r=new Random();
        ticTacToe = new String[n][n];

        System.out.println("Generating Random Tic Tac Toe Sequence ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomNumber=r.nextInt(nameOfPlayers.length);
                ticTacToe[i][j]=nameOfPlayers[randomNumber];
                System.out.print(ticTacToe[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

    }

    /*
     * Winning Sequence incase of N = 3 and X and 0 as player is XXX and 000
     * */
    static void winningSequence(){

        int n=ticTacToe[0].length;
        int numberOfPlayers=nameOfPlayers.length;
        for(int j=0;j<numberOfPlayers;j++){
            nameOfPlayers[j]= String.join("", Collections.nCopies(n, nameOfPlayers[j]));
        }
    }

    /*
     * Check if any of the winning sequences occur in Rows, Columns or Diagonally
     *
     * */
    static boolean checkWinner(){

        int n=ticTacToe[0].length;
        String[] sumRow=new String[n+1];
        Arrays.fill(sumRow,"");

        String[] sumColumn=new String[n+1];
        Arrays.fill(sumColumn,"");

        for(int col=0, row=0; col<n && row<n; col++){
            sumRow[row]+=ticTacToe[row][col];
            if(col==row) sumRow[n]+=ticTacToe[row][col];
            if(row==n-1){
                row=-1;
                col++;
            }
        }

        for(int row=0, col=0; row<n && col<n; row++){
            sumColumn[col]+=ticTacToe[row][col];
            if(row+col==n-1) sumColumn[n]+=ticTacToe[row][col];
            if(row==n-1){
                row=-1;
                col++;
            }
        }

        List<String> rowColumnList = new ArrayList(Arrays.asList(sumRow));
        rowColumnList.addAll(Arrays.asList(sumColumn));

        List<String> winningList = new ArrayList(Arrays.asList(nameOfPlayers));

        rowColumnList.retainAll(winningList);
        if(rowColumnList.size()>=1)
            return true;

        return false;
    }

}


