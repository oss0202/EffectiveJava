package third;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return true;
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }
}
