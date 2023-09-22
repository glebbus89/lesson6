package ocp;

public class CircleV2 implements ShapeV2{

        public CircleV2(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        private final int radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
