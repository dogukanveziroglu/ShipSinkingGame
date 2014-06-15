import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    static int ship_number = 0;
    static List<int[]> coordinate_list = new ArrayList<>();

    Random random = new Random();

    String name;
    int size;
    Board board;
    Helper helper;
    int health;

    Ship(String name, int size, Board board, Helper helper) {
        this.board = board;
        this.name = name;
        this.size = size;
        this.helper = helper;
        health = size;
        ship_number++;

        set_ship_location();
    }

    void set_ship_location() {
        boolean placed = false;
        while (!placed) {
            int x = random.nextInt((Main.board_size - size));
            int y = random.nextInt(Main.board_size);

            if (!(helper.ship_control(board.board, x, y, size))) {
                for (int i = 0; i < size; i++) {
                    board.board[y][x + i] = 'S';
                    coordinate_list.add(new int[]{ship_number, y, (x + i)});
                }
                placed = true;
            }
        }
    }
    void hit(){
        health--;
        if(health == 0){
            System.out.println("The " + name + " sunk!");
            ship_number--;

        }
    }
}
