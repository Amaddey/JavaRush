import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    }

    static class Singleton {
        private static final Singleton INSTANCE = new Singleton();
        private Singleton(){}
        static Singleton getInstance() {
            return INSTANCE;
        }
    }
    static int nod(int a,int b){
        if(b == 0) return a;
        int x = a % b;

        return nod(b,x);
    }

    static Integer check(ArrayList<Integer> nums1,ArrayList<Integer> nums2){
        int size1 = (nums1.size() > nums2.size()) ? nums1.size() : nums2.size();
        int size2 = (nums1.size() < nums2.size()) ? nums1.size() : nums2.size();
        int result = 1;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if(nums1.get(i).equals(nums2.get(j)))
                {
                    result *= nums1.get(i);
                    nums1.remove(i);
                    nums2.remove(j);
                    size1--;
                    size2--;
                }
            }
        }
        return result;
    }
    static void Nod(ArrayList<Integer> nums,int a)
    {
        while(a > 1)
        {
            int i = 2;
            while (true){
                if(a % i == 0)
                {
                    a /= i;
                    nums.add(i);
                    break;
                }else
                    i++;
            }
        }
    }


    private static void initException() {
        try { // divide by zero
            float i = 1/ 0;
        }catch (Exception e){
            exceptions.add(e);
        }
        try { // list is out of bound
            exceptions.get(1231231);
        }catch (Exception e){
            exceptions.add(e);
        }
        try { //file not found
            File file = new File("c:/asd?asdaskdjkj");
            FileReader fr = new FileReader(file);
        }catch (Exception e){
            exceptions.add(e);
        }
        try { //array is out of bound
            int mass[] = {1,2};
            System.out.println(mass[1213]);
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try {
            String s = null;
            Object x =new Integer(0);
            s = (String) x;
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            exceptions.add(e);
        }
        try
        {
        int[] asd = new int[-123];
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt("asda");
            System.out.println(num);
        }catch (Exception e){
            exceptions.add(e);
        }


    }

    public static class NotIncapsulatedClass {
        public NotIncapsulatedClass(){
            List<Number> list = new LinkedList<>();

        }
        private List<Number> initList(List<Number> list){
            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float(-90 / -3));
            list.add(new Integer(123));
            list.remove(new Double("123e-123123"));
            return list;
        }

        private void printListValues(List<Number> list){

        }

        private void processCastedObjects(List<Number> list){
            for (Number object : list) {

            }
        }
    }

    public static void test(Swimable animal){
        animal.swim();
    }

    static interface Walkable {
        void walk();
    }

    static interface Swimable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimable {
        @Override
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming(){
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {
        @Override
        Swimable getCurrentAnimal() {
            return this;
        }
    }

    static class Whale extends OceanAnimal {
        @Override
        Swimable getCurrentAnimal() {
            return this;
        }
    }
    static class Otter implements Walkable,Swimable{
        @Override
        public void swim() {
            System.out.println(this.getClass().getSimpleName() + " is walking.");
        }

        @Override
        public void walk() {
            System.out.println(this.getClass().getSimpleName() + " is swimming");
        }
    }

    public static void cleanAllApartaments(List<Apartament> apartaments)
    {
        for (int i = 0; i < apartaments.size(); i++) {
            if (apartaments.get(i) instanceof Apt1Room)
                ((Apt1Room) apartaments.get(i)).clean1Room();
            else if(apartaments.get(i) instanceof Apt2Room)
                 ((Apt2Room) apartaments.get(i)).clean2Rooms();
            else if(apartaments.get(i) instanceof Apt3Room)
                ((Apt3Room) apartaments.get(i)).clean3Rooms();
        }
    }

    static interface  Apartament {

    }

    static class Apt1Room implements Apartament {
        static void clean1Room(){
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartament {
        void clean2Rooms(){
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartament{
        void clean3Rooms(){
            System.out.println("3 rooms are cleaned");
        }
    }


    static class MovieFactory {
        static Movie getMovie(String key){
            Movie movie = null;

            if("soapOpera".equals(key)){
                movie = new SoapOpera();
            }
            else if("cartoon".equals(key)){
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{
    }

    static class Thriller extends Movie {
    }


    public  static boolean isWork(CompItem item){
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

    public static void doWork(Person person){
        if(person instanceof Person.User) {  ((Person.User) person).live(); }
        if(person instanceof Person.Coder) { ((Person.Coder) person).coding();}
        if(person instanceof Person.Looser) { ((Person.Looser) person).doNothing();}
        if(person instanceof Person.Proger) { ((Person.Proger) person).enjoy();}
    }

    static abstract class Drink {

        void taste(){
            System.out.println("Tasty");
        }
    }
    public static Drink getDeliciousDrink(){
           return new Wine();
    }
    public static Wine getWine(){
        return new Wine();
    }

    static public BubblyWine getBubblyWine(){
        return new BubblyWine();
    }
    static class Wine extends Drink {
        String getHolidayName(){
            return "Happy birthday!";
        }

    }
    static class BubblyWine extends Wine {
        @Override
        String getHolidayName() {
            return "Happy new year!";
        }

    }


    static void DopTask() throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        switch (Integer.parseInt(k)){
            case 1:
            {
                println(new WaterBridge());
                println(new SuspensionBridge());

                break;
            }
            case 2:
            {
                getDeliciousDrink().taste();
                System.out.println(getWine().getHolidayName());

                break;
            }
            case 3:
            {

                Person person = null;
                String key = null;
                key = reader.readLine();
                while (key.equals("user") || key.equals("proger") || key.equals("coder") || key.equals("looser")){

                    if(key.equals("user")) {
                        person = new Person.User();
                    }
                    else if(key.equals("proger")){
                        person = new Person.Proger();
                    }
                    else if(key.equals("coder")){
                        person = new Person.Coder();
                    }
                    else if(key.equals("looser")){
                        person = new Person.Looser();
                    }

                    doWork(person);
                    key = reader.readLine();
                }

                break;
            }
            case 4:{


                Object g = new Hz();
                Movable movable = (Movable) g;
                Drawable drawable = new Hz();

                printMainInfo(drawable);
                printMainInfo(movable); //разбить на 2 класса Circle & Rectangle

                break;
            }
            case 5:
            {
                Keyboard keyboard = new Keyboard();
                Monitor monitor = new Monitor();
                Mouse mouse = new Mouse();

                Computer computer = new Computer(keyboard, mouse,monitor);

                if(isWork(computer.getKeyboard()) && isWork(computer.getMonitor()) && isWork(computer.getMouse())){
                    System.out.println("Work!");
                }

                break;
            }
            case 6:
            {

                String key = reader.readLine();
                while (true){
                    if(key.equals("cartoon") || key.equals("soapOpera") || key.equals("thriller"))
                    {
                        Movie movie = MovieFactory.getMovie(key);
                        System.out.println(movie.getClass().getSimpleName());
                        key = reader.readLine();
                    }
                    else break;
                }
                break;
            }
            case 7:
            {
                List<Apartament> apartaments = new ArrayList<>();
                apartaments.add(new Apt1Room());
                apartaments.add(new Apt2Room());
                apartaments.add(new Apt3Room());

                cleanAllApartaments(apartaments);
                break;
            }
            case 8:
            {
                Swimable animal = new Orca();
                animal.swim();
                animal = new Whale();
                animal.swim();
                animal = new Otter();
                animal.swim();
                break;
            }
            case 9:
            {
                System.out.println("none");
                    //none
                break;
            }
            case 10:
            {
                System.out.println("none");
                System.out.println("none");
                //
                break;
            }
            case 11:
            {
                initException();

                for (Exception exception: exceptions) {
                    System.out.println(exception);
                }
                break;
            }
            case 12:{

                break;
            }
            case 13:
            {

                break;
            }
        }

    }
    static void printMainInfo(Object hz){
        if(hz instanceof Drawable)
            ((Drawable) hz).draw();
        if(hz instanceof Movable)
            ((Movable) hz).move();
    }

     static class Hz implements Drawable,Movable{
        public void draw(){
            System.out.println("draw method");
        }
        public void move(){
            System.out.println("move method");
        }
    }
    interface Drawable{
        void draw();
    }
    interface Movable {
        void move();
    }

    static class WaterBridge implements Bridge {
        @Override
        public int getCarsCount() {
            return 12;
        }

    }
    static class SuspensionBridge implements Bridge {
        @Override
        public int getCarsCount() {
            return 70;
        }

    }

    public static void println(Bridge bridge){
        if(bridge instanceof WaterBridge){
            System.out.println("Water bridges " + bridge.getCarsCount());
        }

        if(bridge instanceof SuspensionBridge){
            System.out.println("Suspension bridges " + bridge.getCarsCount());
        }
    }
    static class HenFactory {
        static Hen getHen(String country){
            Hen hen = null;
            if(country.equals("UKRAINE")) {
                hen = new UkrainianHen();
            }
            if(country.equals("BELARUS")) {
                hen = new BelarusianHen();
            }
            if(country.equals("MOLDOVA"))
            {
                hen = new MoldovanHen();
            }
            if(country.equals("rasha"))
            {
                hen = new RussianHen();
            }
            return hen;
        }

    }
    public interface Country {
        String rasha = "rasha";
        String UKRAINE = "Ukraine";
        String MOLDOVA = "Moldova";
        String BELARUS = "Belarus";

    }
    abstract static class Hen  {
        abstract int getCountOfEggsPerMonth();
        String getDescription(){
            return  "I'm a hen";
        }

    }
    static class UkrainianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 9999;
        }
        @Override
        String getDescription() {
            return  String.format("[%s] ", Country.UKRAINE) + " Glory to Ukraine!";
        }

    }
    static class RussianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 1;
        }
        @Override
        String getDescription() {
            return String.format("[%s] ", Country.rasha) + "I'm a rashist. Ингрия будет свободна" + " кол-во яиц : " + getCountOfEggsPerMonth();
        }

    }
    static class MoldovanHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }
        @Override
        String getDescription() {

            return String.format("[%s] ", Country.MOLDOVA) + "I'm a moldovan hen" + " кол-во яиц : " + getCountOfEggsPerMonth();
        }

    }
    static class BelarusianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 123;
        }
        @Override
        String getDescription() {

            return String.format("[%s] ", Country.BELARUS) + "Жыве Беларусь" + " кол-во яиц : " + getCountOfEggsPerMonth();
        }

    }

    public static void haveRest(Person person){
        if(person instanceof Player){
            ((Player) person).play();
        }else if(person instanceof Dancer){
            ((Dancer) person).dance();
        }
    }
    static class Player implements Person {
        void play(){
            System.out.println("playing");
        }
    }
    static class Dancer implements Person {
        void dance(){
            System.out.println("dancing");
        }
    }

    public static void printClasses(Object obj,Mouse mouse,GreyMouse greyMouse,Jerry jerry){
        System.out.println(obj.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(jerry.getClass().getSimpleName());
    }

    static class Mouse2 {

    }

    static class GreyMouse extends Mouse {

    }
    static class Jerry extends GreyMouse {

    }

    public static void foodMethods(Food food){
        food.eat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable){
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {

        @Override
        public void onSelect() {
            System.out.println("food is selected");
        }
        public void eat(){
            System.out.println("food is eaten");
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key){
            Cat cat = null;

            if("fenix".equals(key)){
                cat = new MaleCat("Феникс");
            }else if("murka".equals(key))
            {
                cat = new FemaleCat("Мурочка");
            }else if("kiska".equals(key)){
                cat = new FemaleCat("Кисюлька");
            }else {
                cat = new Cat(key);
            }

            return cat;
        }
    }

    static void Lesson4_14() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String k = reader.readLine();
        switch (Integer.parseInt(k))
        {
            case 1:
            {
                Building school = getSchool();
                Building shop = getBuilding();

                System.out.println(school);
                System.out.println(shop);
                break;
            }
            case 2:
            {
                String catName;

                while (!(catName = reader.readLine()).equals(""))
                {
                    Cat cat = CatFactory.getCatByKey(catName);
                    System.out.println(cat.toString());
                }

                break;
            }
            case 3:
            {
                Food food = new Food();
                Selectable selectable = new Food();
                Food newFood = (Food) selectable;

                foodMethods(food);
                selectableMethods(selectable);
                break;
            }
            case 5:
            {
                Person person = null;
                String key;
                while (!(key = reader.readLine()).equals("exit")) {
                    if("player".equals(key)){
                        person = new Player();
                    }else if("dancer".equals(key)){
                        person = new Dancer();
                    }
                    haveRest(person);
                }
                break;
            }
        }
    }

    public static Building getSchool(){
        return new School();
    }

    public static Building getBuilding(){
        return new Building();
    }
    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }

    public static void doAllAction(Pet2 pet2){
        if(pet2 instanceof Tiger2){
            Tiger2 tiger2 = (Tiger2) pet2;
            tiger2.doTigerActions();
        }
        if(pet2 instanceof Cat3){
            Cat3 cat3 = (Cat3) pet2;
            ((Cat3) pet2).doCatActions();
        }

        pet2.doPetActions();
    }

    public class Dog extends Pet {
        @Override
        public void introduce() {
            System.out.println("I'm dog");
        }
    }

    public static class Coyote extends WildAnimal {
        @Override
        public void introduce() {
            System.out.println("I'm Coyote");
        }
    }

    public static class Animal {
        public void introduce(){
            System.out.println("I'm Animal");
        }
    }

    public static class WildAnimal extends Animal {
        public void introduce(){
            System.out.println("I'm WildAnimal");
        }
    }

    public static class Pet extends Animal {
        @Override
        public void introduce() {
            System.out.println("I'm Pet");
        }
    }

    static class Pet2 {
        public void doPetActions(){
            System.out.println("pet action");
        }
    }

     static class Cat3 extends Pet2 {
        public void doCatActions()
        {
            System.out.println("cat action");
        }
    }

    static class Tiger2 extends Cat3 {
        void doTigerActions(){
            System.out.println("Tiger action");
        }
    }

    static void lesson14_2() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String k = reader.readLine();
        switch (Integer.parseInt(k)){
            case 1:
            {
                Pet3 animal = new Tiger();
                boolean isCat = animal instanceof Cat;
                boolean isTiger = animal instanceof Tiger;
                boolean isPet = animal instanceof Pet3;
                printResults(isCat,isTiger,isPet);
                break;
            }
            case 2:
            {
                Object o2 = new TomCat();

                boolean isCat = o2 instanceof Cat;
                boolean isMoveable = o2 instanceof Moveable;
                boolean isTom = o2 instanceof TomCat;

                if (isCat && isMoveable && isTom) System.out.println("Bingo!");
                break;
            }
        }

    }

    private static void printResults(boolean cat,boolean tiger,boolean pet)
    {
        if(cat && tiger && pet) System.out.println("Bingo!");
    }


    interface Moveable {

    }
    static class Cat2 {

    }
    static class TomCat extends Cat implements Moveable {

    }

    static class Pet3 {

    }
    static class Cat extends Pet3 {
        private String name;

        Cat(){}

        protected Cat(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }
    static class Tiger extends Cat {

    }

    static class MaleCat extends Cat {
        MaleCat(String name){
            super(name);
        }

        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name){
            super(name);
        }

        @Override
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}