public class Rectangle {
    Point topLeft;
    Point bottomRight;

     public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){

    }

     public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

     public Rectangle(Rectangle rectangle){
        this.topLeft = rectangle.topLeft;
        this.bottomRight = rectangle.bottomRight;
    }

}