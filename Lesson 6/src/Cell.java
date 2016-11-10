/**
 * Created by denis.selutin on 17.10.2016.
 */
public class Cell {
    private boolean hasMine;

    public String toString() {
        return hasMine ? "M" : " ";
    }

    /*
        <???> <??? ??????????>
        <?????????> <?????. ????> <???>([?????????]) {

        }
        protected void myMethod() {}
        public String myMethod2() {
            return "";
        }
        public String myMethod3(int x, int y) {
            return "" + x + " " + y;
        }

     */

    public boolean getHasMine() {
        return hasMine;
    }

    public void setHasMine(boolean hasMine) {
        this.hasMine = hasMine;
    }
}
