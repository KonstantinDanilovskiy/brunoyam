package lesson7;

public class Robot {
    private Direction direction;
    private char DEFAULT_TRACE;
    private int x;
    private int y;


    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = Direction.STOP;
        this.DEFAULT_TRACE = '#';
    }

    public Robot(int x, int y, Direction direction) {
        this(x, y);
        this.direction = direction;
        this.DEFAULT_TRACE = '#';
    }

    public Robot(int x, int y, Direction direction, char trace) {
        this(x, y, direction);
        this.DEFAULT_TRACE = trace;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public char getTrace() {
        return DEFAULT_TRACE;
    }

}
