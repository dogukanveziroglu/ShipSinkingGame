import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int board_size = 9;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Board board_org = new Board(board_size);
        Board board_user = new Board(board_size);
        Helper helper = new Helper();

        List<Ship> ship_list = new ArrayList<>();
        ship_list.add(new Ship("Submarine", 3, board_org, helper));
        ship_list.add(new Ship("Destroyer", 4, board_org, helper));
        ship_list.add(new Ship("Carrier", 5, board_org, helper));


        while (true) {

            int coordinate, x, y;
            helper.print_board(board_user.board);
            System.out.println();

            coordinate = helper.input_scanner(scan, "Please enter a coordinate: ");
            x = (coordinate % 10) - 1;
            y = (coordinate / 10) - 1;

            if (board_org.board[y][x] == 'S') {
                System.out.println("Hit!");
                board_user.board[y][x] = 'S';

                ship_list.get((helper.ship_hit_control(x, y) - 1)).hit();

                if (Ship.ship_number == 0) {
                    System.out.println("Congratulations! You sank all the ships!");
                    System.exit(0);
                }


            } else {
                System.out.println("Missed!");
                board_user.board[y][x] = 'X';
            }
        }

    }
}