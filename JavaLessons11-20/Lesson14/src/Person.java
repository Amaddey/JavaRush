public interface Person {
    public static class User implements Person
    {
        void live(){
            System.out.println("Usually i just live");
        }
    }

    public static class Looser implements Person {
        void doNothing(){
            System.out.println("Usually i just do nothing");
        }
    }

    public static class Coder implements Person {
        void coding(){
            System.out.println("Usually i just coding");
        }
    }
    public static class Proger implements Person {
        void enjoy(){
            System.out.println("Wonderful life!");
        }
    }
}
