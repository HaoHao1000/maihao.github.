package Exercise1_2;

class Circle implements GeometricObject {

    private double radious;
    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radious=" + radious +
                ']';
    }
    public double getArea(){
        return Math.PI * radious * radious;
    }
    public double getPerimeter(){
        return Math.PI * 2 * radious;
    }
}
