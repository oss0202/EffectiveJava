package third;

import java.util.Objects;

public class ColorPoint{

    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color){
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }
    /*
    이 ColorPoint의 Point 뷰를 반환한다.
     */
    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point))
            return false;
        // o가 일반 Point면 색상을 무시하고 비교한다.
        if(!(o instanceof ColorPoint))
            return o.equals(this);
        // o가 CollerPoint면 색상까지 비교한다.
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
