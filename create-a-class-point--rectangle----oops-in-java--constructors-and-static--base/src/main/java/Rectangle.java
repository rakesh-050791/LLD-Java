public class Rectangle {
    protected Point topLeft;
    protected Point bottomRight;

     public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
         this.topLeft = new Point(topLeftX, topLeftY);
         this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

     public Rectangle(Point topLeft, Point bottomRight){
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;

         this.topLeft = new Point(topLeft);
         this.bottomRight = new Point(bottomRight);
    }

     public Rectangle(Rectangle rectangle){
//        this.topLeft = rectangle.topLeft;
//        this.bottomRight = rectangle.bottomRight;

         this.topLeft = new Point(rectangle.topLeft);
         this.bottomRight = new Point(rectangle.bottomRight);
    }

}