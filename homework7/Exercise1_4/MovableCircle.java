package Exercise1_4;

public class MovableCircle implements  Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);

    }
    public String toString(){
        return String.format("(%d,%d), speed=(%d,%d),radius=%d", center.x,center.y,center.x,center.y,radius );
    }
    public void moveUp(){
        center.y -= center.ySpeed;
    }
    public void moveDown(){
        center.y += center.ySpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
}
