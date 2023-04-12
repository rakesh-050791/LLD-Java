public class Student {
    // write the code of student class here
    String name;
    int age;

    void display(){
        System.out.println("My name is " + this.name + "." + " I am " + this.age + " years old");
    }

    void sayHello(String dataMemberName){
        System.out.println( this.name + " says hello to " + dataMemberName);
    }
}
