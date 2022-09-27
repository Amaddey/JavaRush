import java.io.*;
import java.sql.Array;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("Bender-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);

        doMove(enemy,amigo);
        doMove(amigo, enemy);
j
    }


    public static void doMove(AbstractRobot robotFirst,AbstractRobot robotScond){
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s attacked robot %s, attaked = %s, defensed = %s", robotFirst.getName(),robotScond.getName()
        ,attacked,defenced));
    }

    public class RepkaStory{
    //static
       void tell(List<Person2> items){
            Person2 fisrt,second;
           for (int i = items.size() - 1; i > 0; i--) {
            fisrt = items.get(i);
            second = items.get(i-1);
            fisrt.pull(second);
           }
        }
    }



    interface RepkaItem {
        public String getNamePadezh();
    }

    static class Person2 implements RepkaItem{
        private String name,namePanezh;
        Person2(String a1,String a2){
            this.name = a1;
            this.namePanezh = a2;
        }
        public String getNamePadezh(){
            return null;
        }
        public void pull(Person2 person2){
            System.out.println(name + " за  " + person2.namePanezh);
        }
    }

    static class Hobbie2 implements Desire,Dream {
        static int INDEX = 1;
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

    //1. Считать с консоли имя файла.
    //2. Вывести в консоль(на экран) содержимое файла.
    //3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

    static void readFile(String address) throws Exception {
        InputStream inputStream = new FileInputStream(address);
       // OutputStream outputStream = new FileOutputStream(address);
        while (inputStream.available() > 0){
            System.out.print((char)inputStream.read());
        }
        inputStream.close();

    }

    void DopTasks() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        switch (k){
            case 1:
            {
                System.out.println(SimpleObjectB.name);
            }
            break;
            case 2:
            {
                System.out.println(new Today(WeatherType.CLOUDLY));
                System.out.println(new Today(WeatherType.FOGGY));
                System.out.println(new Today(WeatherType.FROZEN));
            }
            break;
            case 3:
            {
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                //String address = reader.readLine();
                String hardAddress = "/home/amadey/file.txt";
                readFile(hardAddress);
                reader.close();
                break;
            }
            case 4:
            {
                BufferedReader reader11 = new BufferedReader(new InputStreamReader(System.in));
                while(true){
                    String address = reader11.readLine();
                    if(address.equals("exit")) break;
                    readFile(address);
                }
                reader.close();

                break;
            }
            case 5:
            {
                System.out.println(Matrix2.NEO);
                break;
            }
            case 6:
            {
                System.out.println(Dream.HOBBIE);

                System.out.println(new Hobbie().INDEX);
                System.out.println(Dream.HOBBIE);
                break;
            } //1-7 dop_dop
            case 7:
            {
                int[] mass = new int[6];
                ArrayList<Integer> nums = new ArrayList<>();
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                for (int i = 0; i < mass.length; i++) {
                    System.out.println(String.format("[%d] :",i));
                    int buf = Integer.parseInt(reader.readLine());
                    if(buf %2 == 0)
                    {
                        mass[i] = buf;
                        nums.add(mass[i]);
                    }
                }

                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        if(mass[i] < mass[j]){
                            int tmp = mass[i];
                            mass[i] = mass[j];
                            mass[j] = tmp;
                        }
                    }
                }

                for (int i = 0; i < mass.length; i++) {
                    System.out.println(mass[i]);
                }

                Collections.sort(nums);

                for (int i: nums
                ) {
                    System.out.println(i);
                }
                break;
            }
            case 8:
            {
                ArrayList<Person2> plot = new ArrayList<>();
                plot.add(new Person2("Репка","Репку"));
                plot.add(new Person2("Дедка","Дедку"));
                plot.add(new Person2("Бабка","Бабку"));
                plot.add(new Person2("Внучка","Внучку"));
                //RepkaStory.tell(plot);

                break;
            }
            case 9:
            {

                break;
            }
        }
    }

    static class Matrix2 {
        public static DBObject2 NEO = new User2().initializeIdAndName(1,"NEO");
    }

    interface DBObject2 {
        DBObject2 initializeIdAndName(long id,String name);
    }

    static class User2 implements DBObject2{
        private String name;
        private long id;

        public String toString(){
            return String.format("User has name %s,id = %d",name,id);
        }

        @Override
        public User2 initializeIdAndName(long id,String name)  {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Name :");
//            name = reader.readLine();
//            System.out.println("Id :");
//            id = Integer.parseInt(reader.readLine());
            this.id = id;
            this.name = name;
            return this;
        }
    }


    public interface WeatherType {
        public String CLOUDLY = "CLOUDLY";
        public String FOGGY = "FOGGY";
        public String FROZEN = "Frozen";
    }

    public interface Weather {
        String getWeatherType();
    }

    static class Today implements Weather {
        private String type;

        Today(String type){
            this.type = type;
        }
        public String toString(){
            return String.format("%s for today",this.getWeatherType());
        }

        public String getWeatherType(){
            return this.type;
        }
    }

    interface SimpleObjectB {
        String name = "SimpleObject";
        void onPress();
    }
    interface Button extends SimpleObjectB {
        final String name = "Submit";
        String onPress(Object o);
    }

    static class MyClass {
        private ArrayList<Integer> list;

        public void write(int data){
            list.add(data);
        }
        public int read(){
            int first = list.get(0);
            list.remove(0);
            return first;
        }
        public int available(){
            return list.size();
        }
    }

    interface Animal {
//        String getName();
        String getColor();
    }

    static abstract class Fox implements Animal {
        private String name;

        //public String getName(){return name;}
    }

    public static class BigFox extends Fox {
        public String getColor(){
            return null;
        }
    }

    public static abstract class Translator {
        public abstract String getLanguage();
        public String translate() {
            return "I'm a translator from " + getLanguage();
        }
    }

    static class EnglishTranslator extends Translator{
        public String getLanguage(){
            return "english";
        }
    }

    interface Person {
        void use(Person person);
        void startToWork();
    }
    interface Workable {
        boolean wantGetExtraWork();
    }

    interface Secretary extends Person{

    }

    interface Boss extends Workable,Person{

    }

    class CleverMan implements Boss {
        public void use(Person person){
            person.startToWork();
        }
        public void startToWork(){
        }
        public boolean wantGetExtraWork(){
            return true;
        }
    }

    class SmartGirl implements Secretary {
        public void use(Person person){

        }
        public void startToWork(){

        }
    }



    interface Person1 {
        boolean isAlive();
    }
    interface Presidentable extends Person1 {
        @Override
        boolean isAlive();
    }

    interface Movable {
        Double speed();
    }
    interface Runable extends Movable {
        //@Override
        Double speed(Runable a);
    }

    interface Eatable {
        abstract void Eatable();
    }

    interface Eat {
        abstract void eat();
    }

    abstract static class Animal2{
        void printt(){
            System.out.println("printttt");
        }
    }

     static class Cat extends Animal2 {
        Cat(){

        }
    }


    class Mouse {

    }
    class Dog{

    }

    abstract class Tom extends Cat implements Movable,Eatable,Eat {

    }

    abstract class Jerry extends Mouse implements Movable,Eatable {

    }

    abstract class Killer extends Dog implements Movable,Eat
    {

    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1,"Neo");
        public static DBObject TRIBITY = new User().initializeIdAndName(2,"Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id,String name);
    }

    static class User implements DBObject {
        long id;
        String name;
        public User initializeIdAndName(long id,String name){
            this.id = id;
            this.name = name;
            return this;
        }
        public String toString(){
            return String.format("User has name %s, id = %d",name,id);
        }
    }

    interface Desire {
    }

    interface Dream {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire,Dream {
        static int INDEX = 1;
        public String toString(){
            INDEX++;
            return "INDEX : " + INDEX;
        }
    }


    public interface Selectable {
        void onSelect();
    }

    public interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable,Updatable{
        public void onSelect(){

        }

        public void refresh(){

        }
    }


    public interface Drink2 {
        boolean isAlcoholic();
    }

    public static class Cola implements Drink2 {
        public boolean isAlcoholic() {
            return false;
        }
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }


    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }


    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        public void sleepOnTheFloor() {

        }

        public boolean isReadyToGoHome() {
            return false;
        }

        public void askMore(String message) {

        }

        public void sayThankYou() {

        }

        public boolean isAlcoholic() {
            return false;
        }
    }

    public static class AlcoholicBeer implements Drink2 {
        public String toString() {
            if (isAlcoholic()) {
                return "Alcoholic drink";
            } else {
                return "without alcohol";
            }
        }

        public boolean isAlcoholic() {
            return true;
        }
    }
}



