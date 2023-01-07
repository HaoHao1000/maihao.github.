package Exercise1_1;

public class Square extends Retangle{
    public Square(){

    }
    public Square(double side){
        super.width = side;
        super.length = side;
    }

    public Square(String color, Boolean filled, double side) {
        super.color = color;
        super.filled = filled;
        super.length = side;
        super.width = side;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public double getSide(){
        return getWidth();
    }
    public  void setWidth(double side){
        width = side;
    }
    public void  setLength(double side){
        length = side;
    }

    @Override
    public String toString() {
        return "Square[Retangle[Shape" +
                "[color=" + color +
                ", filled=" + filled +
                "], width='" + width + '\'' +
                ", length=" + length +
                ']';
    }
}
