import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {

    }

    public static String factorial(int n) {
        BigInteger a = BigInteger.valueOf(1);
        if (n < 0) {
            return "0";
        } else {
            if (n <= 150) {
                for (int i = 1; i <= n; ++i) a = a.multiply(BigInteger.valueOf(i));// a *= i;


            }
        }
        return a.toString();
    }

    public static FlyableMachine result;

    public static void reset() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("helicopter")){
            result = new Helicopter();
        }
        if(s.equals("plane")){
            //int y = Integer.parseInt(reader.readLine());
            result = new Plane(5);
        }
        if(result == null)
        {
            System.out.println("null");
        }else
        System.out.println(result.getClass().getSimpleName());
    }

    void bufWriter(){
        try {
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("/home/amadey/Documents/file.txt"));
            bw.write("asldjaskd\n");
            bw.write("asdasdasd\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }

    static void Lesson15_dop12() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        switch (Integer.parseInt(k))
        {
            case 1:
            {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list =new ArrayList<>();
                String num;
                while (true)
                {
                    num = reader1.readLine();
                    if(num.equals("exit")){
                        break;
                    }
                    list.add(num);
                }

                for(String val : list){
                    if(val.contains(".")){
                        printClass.print(Double.valueOf(val));
                    }else {
                        try {
                            Integer in = Integer.valueOf(val);
                            if(in > 0 && in < 128){
                                printClass.print(Short.valueOf(val));
                            }else if(in >= 128)
                            {
                                printClass.print(in);
                            }else {
                                printClass.print(in);
                            }
                        }catch(NumberFormatException e){
                            printClass.print(val);
                        }
                    }

                }
                break;
            }
            case 2:
            {
                Duck duck = new Duck();
                Util.fly(duck);
                Util.move(duck);
                break;
            }
            case 3:
            {
                new Tree().info(new Integer("4"));
                new Tree().info(new Short("4"));
                new Tree().info(new BigDecimal("4"));

                //Блок 3.
                //Вызов для Number (Задание 3)
                new Tree().info(new Integer("4"));
                new Tree().info(new Short("4"));
                new Tree().info(new BigDecimal("4"));

                //Блок 4.
                //Вызов для String (Задание 4)
                new Tree().info(new String("4"));
                new Tree().info(new Integer("4").toString());
                new Tree().info(new Short("4").toString());
                new Tree().info(new BigDecimal("4").toString());
                break;
            }
            case 4:
            {
                readKeyFromConsoleAndInitPlanet();
                break;
            }
            case 5:
            {
                System.out.println("none");
                break;
            }
            case 6:
            {
                System.out.println("none2x");
                break;
            }
            case 7:
            {
                System.out.println(lines);
                break;
            }
            case 8:{
                new B(6);
                break;
            }
            case 9:
            {
                String link;
                link = reader.readLine();
                int indexM = link.indexOf("?");
                String s2 = link.substring(indexM + 1);
                ArrayList<String> Obj = new ArrayList<>();

                for (String retval : s2.split("&")) {
                    int index = retval.indexOf("=");
                    if(index!=-1){
                        String par = retval.substring(0,index);
                        System.out.println(par);
                        if(par.equals("obj"))
                            Obj.add(retval.substring(index+1));
                    }
                    else
                        System.out.print(retval);
                    System.out.println(" ");
                }
                for (int i = 0; i < Obj.size(); i++) {
                    try {
                        double d3 = Double.parseDouble( Obj.get(i));
                        alert(d3);

                    } catch (NumberFormatException e) {
                        alert(Obj.get(i));
                        //System.err.println("Неверный формат строки!");
                    }

                }
                break;
            }
            case 10:
            {
                System.out.println("none");
            }
        }
    }

    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Constant.FILE_NAME));
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static class Constant {
        public static String FILE_NAME = "/home/amadey/Documents/text.txt";
    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        try{
            s = reader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        if(s.equals(Planet.SUN))
        {
            thePlanet=Sun.getInstance();
        }else if(s.equals(Planet.MOON)){
            thePlanet=Moon.getInstance();
        }else if(s.equals(Planet.EARTH)) {
            thePlanet=Earth.getInstance();
        }else thePlanet=null;


        System.out.println(thePlanet);
    }
    public static class Tree {
        public static int globalNumber;
        public int number;

        public Tree(){
            this.number = ++globalNumber;
        }
        public void info(Object s){
            System.out.println(String.format("Tree № %d, method Object, parameter %s" , number,s.getClass().getSimpleName()));
        }
        public void info(Number s){
            System.out.println(String.format("Tree № %d, method Object, parameter %s" , number,s.getClass().getSimpleName()));
        }
        public void info(String s){
            System.out.println(String.format("Tree № %d, method Object, parameter %s" , number,s.getClass().getSimpleName()));
        }
    }

    public static class Duck implements Flyable,Movable2{
        @Override
        public void doAction() {
            System.out.println("flying");
        }
        @Override
        public void doAction1() {
            System.out.println("moving");
        }
    }

    public static class Util {
        static void fly(Flyable animal){
            animal.doAction();
        }
        static void move(Movable2 animal){
            animal.doAction1();
        }
    }

    public static interface Flyable{
        public void doAction();
    }

    public static interface Movable2 {
        public void doAction1();
    }

    static void Lesson15_9() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();

        switch (Integer.parseInt(k)){
            case 1:
            {
                System.out.println(Solution.labels);
                break;
            }
            case 2:
            {
                System.out.println(Solution.MIN);

                break;
            }
            case 3:
            {
                System.out.println(Solution.intVar);
                System.out.println(Solution.doubleVar);
                System.out.println(Solution.doubleVar);
                System.out.println(Solution.booleanVar);
                System.out.println(Solution.ObjectVar);
                System.out.println(Solution.ExceptionVar);
                System.out.println(Solution.StringVar);
                break;
            }
            case 4:
            {
                System.out.println(Solution.C);
                break;
            }
            case 5:
            {
                System.out.println(test);
                break;
            }
        }
    }

    public static Object cat;
    public static Test test =new Test();
    static {
        class Test {
            public  String name = "Pushok";
        }
        cat = test;
    }

    static class Test {
        public  int a = getSum();
        public  int b = getSum() - a;
        public  int c = getSum() - a - b;

        public static int getSum(){
            return 10 + 2 + 3;
        }

        public  void show(){
            System.out.println(String.format("a = %d,b = %d,c = %d",a,b,c));
        }
    }

    public static void add(int i,int j){
        System.out.println("Integer addition");
    }

    public static void add(int i,double j){
        System.out.println("Integer and double addition");
    }
    public static void add(double i,double j){
        System.out.println("Double addition");
    }

    public static void printName(Human man)
    {
        System.out.println(man);
    }

    public static class Human {}

    public static class Man extends Human {}

    public static class Woman extends Human {}

    public static void printt(Integer i){
        System.out.println("This in Integer");
    }

    public static void printt(Object i){
        System.out.println("This is Object");
    }

    public static void printt(double i){
        System.out.println("This is double");
    }

    static void Lesson15_4()throws Exception {
    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
    String k = reader.readLine();
        switch (Integer.parseInt(k))
        {
            case 1:
            {
                printt((short)1);
                printt((Number)1);
                printt(1);
                printt((Integer) 1);
                printt((int) 1);

                break;
            }
            case 2:
            {
                System.out.println("none");
                break;
            }
            case 3:
            {
                System.out.println("none");
                System.out.println("none");

                break;
            }
            case 4:
            {
                Man man = new Man();
                Woman woman = new Woman();
                printt(man);
                printt(woman);
                break;
            }
            case 5:
            {
                add((short) 1, 2f);
                add(1,2);
                add(2d,2);
                add((byte)1,2d);
                break;
            }
        }

    }



    public abstract static class Book {


        private String author;

        public Book(String author){
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType(){
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";

            if(this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            else output = agathaChristieOutput;

            return output;
        }

        @Override
        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        public String bookName = null;

        public MarkTwainBook(String bookName){
            super("Mark Twain");
            this.bookName = bookName;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public static class AgahtaChristieBook extends Book {
        public String bookName;
        public AgahtaChristieBook(String book){
            super("Agatha Christie");
            this.bookName = book;
        }

        @Override
        public AgahtaChristieBook getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    static void Lesson15_2() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        switch (Integer.parseInt(k)){
            case 1:
            {
                System.out.println("None");
                break;
            }
            case 2:
            {
                Goose goose = new Goose();
                Dragon dragon = new Dragon();

                System.out.println(goose.getSize());
                System.out.println(dragon.getSize());

                break;
            }
            case 3:
            {
                new Main.Job().printlnDesire();
                new Main.Money().printlnDesire();

                break;
            }
            case 4:
            {
                List<Book> books = new LinkedList<>();
                books.add(new MarkTwainBook("Tom Sawyer"));
                books.add(new AgahtaChristieBook("Hercule Poirot"));
                System.out.println(books);
                break;
            }
            case 5:
            {
                Finger.printlnFingers();
                Finger.printlnBodyParts();
                Finger.printlnAlives();

                break;
            }
        }
    }

    public static interface Alive {
        boolean containsBones();
    }

    public static class BodyPart implements Alive {
        private String name;

        public BodyPart(String name){
            this.name = name;
        }

        public boolean containsBones(){
            return true;
        }

        @Override
        public String toString() {
            return containsBones() ? name + " содержит кости" : name + " не сожержит кости";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isFoot;
        public Finger(String name, boolean isFoot){
            super(name);
            this.isFoot=isFoot;
        }
        public boolean containsBones(){
            return super.containsBones() && !isFoot;
        }

        private static void printlnAlives(){
            System.out.println(new BodyPart("Hand").containsBones());
        }

        private static void printlnBodyParts(){
            List<BodyPart> bodyParts = new ArrayList<>(5);
            bodyParts.add(new BodyPart("Hand"));
            bodyParts.add(new BodyPart("Foot"));
            bodyParts.add(new BodyPart("Head"));
            bodyParts.add(new BodyPart("Body"));
            System.out.println(bodyParts.toString());
        }

        private static void printlnFingers() {
            List<Finger> fingers = new ArrayList<Finger>(5);
            fingers.add(new Finger("Большой", true));
            fingers.add(new Finger("Указательный", true));
            fingers.add(new Finger("Средний", true));
            fingers.add(new Finger("Безымянный", false));
            fingers.add(new Finger("Мизинец", true));
            System.out.println(fingers.toString());
        }
    }


    public static class Constants {
        public static String FILE_NAME;
        public static String WANT_STRING = "I wanna get";
        public static String JOB = " a job";
        public static String MONEY = " to make a money";
        public static String ATLEAST = " atleast 12000 grn";
    }

    public static class Job {
        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.JOB);
        }
    }

    public static class Money {
        void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.MONEY);
        }
    }

    public static class BigAnimal {
        protected String getSize(){
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize(){
            return "like a cat";
        }
    }

     static class Cat {
        public Cat parent;
        public Cat getMyParent(){
            return this.parent;
        }
        public void setMyParent(Cat cat){
            this.parent=cat;
        }

        public
        String getName(){
            return "Vaska";
        }
    }
    interface HasName {
        String getName();
        int getWeight();
    }
    interface HasWeight {
        int getValue();
    }

    interface HasSize{
        int getValue();
    }

    static class Tiger extends Cat {
        public String getName() {

            return "Vasilii Tigranobich";
        }

        public Tiger getMyParent(){
            return (Tiger) this.parent;
        }
    }

    public static interface Movable {
        boolean getAllowedAction(String name);
    }
    public static interface Sellable {
        Object getAllowedAction(String name);
    }
    public static interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Discountable{
        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public boolean getAllowedAction(String name) {
            return false;
        }
    }

}