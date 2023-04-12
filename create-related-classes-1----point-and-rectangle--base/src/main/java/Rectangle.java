public class Rectangle {
    Point topLeft;
    int height;
    int width;

    int getArea(){
        return this.height * this.width;
    }

    int getParameter() {
        return 2 * (this.height + this.width);
    }

     Point getBottomRight(){
        Point bottomRight = new Point();
        bottomRight.x = topLeft.x + this.width;
        bottomRight.y = topLeft.y + this.height;
        return bottomRight;
    }
}