import java.sql.Driver;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList robots = new ArrayList();

        robots.add(new Whale());
        robots.add(new Tiger());
        robots.add(new Bull());
        robots.add(new Cat());


        for (Object robot: robots) {
            if(robot instanceof Tiger){
                System.out.println("Tiger");
            }
            else if(robot instanceof Cat){
                System.out.println("Cat");
            }
            else if(robot instanceof Bull){
                System.out.println("Bull");
            }
            else
                System.out.println("Hz");

        }

        int[] mass = {1,2,3,4,5,6,7,-12};

        System.out.println(minMass(mass));
    }

    static String minMass(int[] mass){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < mass.length ; i++) {
            if(mass[i] < min){
                min = mass[i];
                index = i;
            }
        }

        return "Min is " + min + " index is " + index;
    }

static class Tiger implements Eat,Moveable {
    public void FastFood(){

    }
    public void move(String newAddress){

    }
}



static class Bull {}
    interface Fly {
        void FastFly();
    }

    interface Run {
        void FastRun();
        //void SlowRun();
    }

    interface Swim {
        void FastSwim();
        //void SlowSwim();
    }

    interface Move {
        void FastMove();
    }
    interface Eat {
        void FastFood();
    }

    class DogClass implements Move,Eat {
        public void FastMove(){

        }
        public void FastFood(){

        }
    }
    class Duck implements Fly,Move,Eat {
        public void FastFly(){

        }
        public  void FastMove(){

        }
        public void FastFood(){

        }
    }
    class Airplane implements Fly {
        public void FastFly(){

        }
    }

    abstract class Human implements Run,Swim {
        abstract public void FastRun();
        abstract public void FastSwim();
    }

    interface WallBuilder {
        void buildWall();
    }

    static class RobotWorker implements WallBuilder {
        public void buildWall(){
            System.out.println("xvcx");
        }
    }

    static class RobotSecurity implements WallBuilder {
        public void buildWall(){
            System.out.println("xvcx");
        }
    }

    static class WaterPoliwaka implements WallBuilder{
        public void buildWall(){
            System.out.println("xvcx");
        }
    }
    interface Moveable {
        void move(String newAddress);
    }

    interface Driveable {
        void drive(Driver driver);
    }

    interface Transport {
        void addStaff(Object staff);
        Object removeStaff();
    }

    class Wheel implements Moveable {
        public void move(String newAddress){
            System.out.println(newAddress);
        }
    }






    static void print(int i){
        System.out.println("int : " + i);
    }

    static void print(Integer i){
        System.out.println(i.getClass() + " : " + i);
    }

    static String identifyClass(Object obj){
        if(obj instanceof Cat){
            return "This is Cat";
        }
        if(obj instanceof Dog){
            return "This is Dog";
        }


        return "None";
    }

}

interface Drawable {
    void draw();
}
interface HasValue {
    int getValue();
}
interface Element extends Drawable, HasValue {
    int getX();
    int getY();
}

abstract class ChessItem2 implements Drawable,HasValue {
    private int x,y,value;

    public int getValue(){
        return value;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void draw(){
        System.out.println("cxvxcv");
    }

}

abstract class Animal {
    abstract String getName();
}

class Cow extends Animal {

    public void printColor(){
        System.out.println("I'm white");
    }
    public void printName(){
        System.out.println("I'm a cow");
    }
    public void printAll(){
        printColor();
        printName();
    }
    public String getName(){
        return "I'm cow";
    }
}
class Whale extends Cow {

    public void printName(){
        System.out.println("Это неправда: ");
        super.printName();

        System.out.println("I'm a whale");
    }
    public void Func(){
        System.out.println("Method");
    }
    public String getName(){
        return "I'm not cow, i'm whale";
    }

}
abstract class Pet {
    protected String name;
    abstract public Pet getChild();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Cat extends Pet {
    public Cat getChild(){
        return new Cat();
    }
    public void setName(String name){
        //super.setName("Я - кот");
        this.name = "";
    }

}

class Dog {
    public Dog getChild(){
        return new Dog();
    }
}

abstract class ChessItem{
    public abstract String toString();
}
class Queen extends ChessItem {
    public String toString(){
        return "Queen";
    }
}
class Bishop  extends ChessItem{
    public String toString(){
        return "Bishop";
    }
}
class King  extends ChessItem {
    public String toString(){
        return "King";
    }
}

interface IStudent {
    public String getName();

}
class Student {

    private String name;
    public Student(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    private void setName(String name){
        this.name = name;
    }

}

class StudentImpl implements IStudent {
    private String name;
    public StudentImpl(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    private void setName(String name){
        this.name = name;
    }
}
