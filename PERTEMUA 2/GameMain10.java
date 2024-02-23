public class GameMain10 {
    public static void main(String[] args) {
        Game10 gm1 = new Game10(0, 0, 10, 10);
        gm1.moveRight();
        gm1.printPosition();
        gm1.moveDown();
        gm1.printPosition();
        gm1.moveLeft();
        gm1.moveUp();
    }
}
