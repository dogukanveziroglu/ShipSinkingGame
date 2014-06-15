import java.util.Scanner;

public class Helper {

     boolean ship_control(char[][] board,int x, int y, int size){
        for(int i = x; i < x + size; i++){
            if(board[y][i] == 'S'){
                return true;
            }
        }
        return false;
    }

    void print_board(char[][] board){
         for (int i = 0; i <= Main.board_size; i++){
             System.out.printf("%3d", i);
         }
        System.out.println();
         for (int i = 0; i < Main.board_size; i++){
             System.out.printf("%3c",65 + i);
             for(int j = 0; j < Main.board_size; j++){
                 System.out.printf("%3c",board[i][j]);
             }
             System.out.println();
         }
    }

    int ship_hit_control(int x, int y){
         for(int i = 0; i < Ship.coordinate_list.size();i++){
                 if (Ship.coordinate_list.get(i)[1] == y && Ship.coordinate_list.get(i)[2] == x){
                     return (Ship.coordinate_list.get(i)[0]);
                 }
         }
         return -1;
    }

    int input_scanner(Scanner scan, String prompt){
        String input;
        int value;
        System.out.println(prompt);
        input = scan.next();
        if(Character.isUpperCase(input.charAt(0))){
            value = (10 * (input.charAt(0) - 64)) + Character.getNumericValue(input.charAt(1));
        } else {
            value = (10 * (input.charAt(0) - 96)) + Character.getNumericValue(input.charAt(1));
        }
        return value;

    }


}
