package Exercise1_5;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString(){
        return "ResizableCircle[Circle[radius=" + super.radius;
    }
    public void resize(int percent){
        radius *= percent/100.0;
    }
}
