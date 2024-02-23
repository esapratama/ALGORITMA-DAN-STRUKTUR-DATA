public class Game10 {
    int x, y, width, height;

    Game10(int x, int y, int width, int height) {
        x = x;
        y = y;
        width = width;
        height = height;
    }

    void moveLeft() {
        x--;
        if (x < 0 || x >= width) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;
        if (x < 0 || x >= width) {
            detectCollision();
        }
    }

    void moveUp() {
        y--;
        if (y < 0 || y >= height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 || y >= height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi snake: (" + x + "," + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }
}
