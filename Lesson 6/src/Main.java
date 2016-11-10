import java.util.Arrays;
import java.util.Random;

/**
 * Created by denis.selutin on 17.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        int [][] array= new int[5][];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            int [] inner = new int[rnd.nextInt(10)];
            array[i] = inner;
        }
        System.out.println(Arrays.deepToString(array));
        /*
            0    1    2    3
         ---------------------
  i   0  | 1  | 2  | 3  | 4  |
         ---------------------
      1  | 5  | 6  | 7  | 8  |
         ---------------------
      3  | 9  | 10 | 11 | 12 |
         ---------------------
      3  | 13 | 14 | 15 | 16 |
         ---------------------
         */

        Cell[][] field = {
                {c(1), c(0), c(0), c(0)},
                {c(0), c(0), c(1), c(0)},
                {c(1), c(0), c(0), c(0)},
                {c(0), c(1), c(0), c(0)}
        };

        Player player = new Player();
        player.setX();
        player.setY();

        Random random = new Random();

        random.nextInt();

        Player player = new Player();
        player.setX(0);
        player.setY(0);

        boolean result;
        do {
        int x = random.nextInt(xDimension);
        int y = random.nextInt(yDimension);
        Cell cell = field [x][y];
        boolean result = moveTo(cell);
        System.out.println("(" + x + "," + y + ")");
        if(result) {
            player.setX(x);
            player.setY(y);
        }

        while (moveTo(field)[random.nextInt()][]));


    }

    public static Cell c(boolean value) {
        Cell cell = new Cell();
        cell.setHasMine(value);
        return cell;
    }

    public static Cell c(int value) {
        Cell cell = new Cell();
        cell.setHasMine(value == 1);
        return cell;
    }

    public static boolean moveTo(Player player, Cell cell) {
        if (cell.getHasMine()){
            System.out.println("You`re dead");
            } else {
            System.out.println("OK");
        }
        return !cell.getHasMine();
    }

}
