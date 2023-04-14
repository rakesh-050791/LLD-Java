public class ThreedPoint extends Point {
    int z;

    void display(){
        //System.out.println("<<" + x + ">>" + "," + "<<" + y + ">>" + "," + "<<" + z + ">>");
        System.out.println("<<" + z + ">>");

    }
}

//    Create a set of class with following requirements:
//
//
//        a. Create a class Point
//
//
//i. It should have two data members 1. x:int
//        y: int
//        It should have a display method that prints in following format - “[<<x>>, <<y>>]”
//
//        b. Create another class ThreedPoint which extends the Point class
//
//
//It should have the following data members: z:int
//        It should have a display method to override the parent’s display method which prints in following format - “[<<x>>, <<y>>, <<z>>]”