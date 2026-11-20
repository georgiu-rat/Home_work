package semester1.practice08;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width >= 0.0 ? width : 1.0;
        this.height = height >= 0.0 ? height : 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Прямокутник [Ширина: %.2f | Высота: %.2f | Площа: %.2f]",
                width, height, getArea());
    }
}
    class Box3D extends Rectangle {
        private double depth;
        public Box3D(double width, double height, double depth) {
            super(width, height);
            this.depth = depth >= 0.0 ? depth : 1.0;
        }

        public double getVolume() {
            return super.getArea() * depth;
        }

        @Override
        public String toString() {
            return String.format("Коробка 3D [Ширина: %.2f | Высота: %.2f | Глубина: %.2f | Объем: %.2f]",
                    getWidth(), getHeight(), depth, getVolume());
        }


    }