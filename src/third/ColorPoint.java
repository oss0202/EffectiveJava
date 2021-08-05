package third;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color){
        super(x,y);
        this.color = color;
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
