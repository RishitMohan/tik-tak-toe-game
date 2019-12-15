package tik.tak.toe.game;

import java.util.*;

class check {

    public char[][] arr = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

}

class showit {

    public char[][] arr = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    public void showing() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + "      ");
            }
            System.out.println("  \n");
        }
    }
}

class board {

    Scanner s = new Scanner(System.in);
    check c = new check();

    public static char[][] arr = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    public void bord() {
        for (int bb = 0; bb < 7; bb++) {
            // the game is draw after 6 chances
            System.out.println("player 1");
            int x = s.nextInt();
            if (x == 1) {

                arr[0][0] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 2) {

                arr[0][1] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 3) {
                arr[0][2] = 'x';
            }

            if (x == 4) {

                arr[1][0] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 5) {

                arr[1][1] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 6) {
                arr[1][2] = 'x';
            }

            if (x == 7) {

                arr[2][0] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 8) {

                arr[2][1] = 'x';                                                             // will not work if inside constructor board
            } else if (x == 9) {
                arr[2][2] = 'x';
            }

            board.checking();

            System.out.println("player2");
            int o = s.nextInt();

            if (o == 1) {

                arr[0][0] = '0';                                                             // will not work if inside constructor board
            } else if (o == 2) {

                arr[0][1] = '0';                                                             // will not work if inside constructor board
            } else if (o == 3) {
                arr[0][2] = '0';
            }

            if (o == 4) {

                arr[1][0] = '0';                                                             // will not work if inside constructor board
            } else if (o == 5) {

                arr[1][1] = '0';                                                             // will not work if inside constructor board
            } else if (o == 6) {
                arr[1][2] = '0';
            }

            if (o == 7) {

                arr[2][0] = '0';                                                             // will not work if inside constructor board
            } else if (o == 8) {

                arr[2][1] = '0';                                                             // will not work if inside constructor board
            } else if (o == 9) {
                arr[2][2] = '0';
            }

            board.checking();
            //static variable works in static method
          
            
            
            
            
            
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    System.out.print(arr[i][j] + "      ");
                }
                System.out.println("\n");
            }
        }
    }

    public static void checking() {

        if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) 
            System.out.println("you won ");
        

        if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]) 
            System.out.println("you won ");
        

        if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) 
            System.out.println("you won ");
        

        if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) 
            System.out.println("you won ");
        

        if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]) 
            System.out.println("you won ");
        

        if (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2]) 
            System.out.println("you won ");
     
        
        
        
          if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) 
            System.out.println("you won ");
          
          if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]) 
            System.out.println("you won ");
          
        
        
        
        
        
        
        
    




        
        
        
        
        
        
        
        
        
          }
}////////////////////////////////////////////use escape to go out of the output screen
        
        
        class TikTakToeGame {

    public static void main(String[] args) {

        showit variable = new showit();
        variable.showing();

        board bo = new board();
        bo.bord();






    }
}
    