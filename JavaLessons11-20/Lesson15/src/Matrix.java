public class Matrix {
    public static void printMatrix(int m,int n, String value){
        System.out.println("Inserting strs");
        printMatrix(m,n,(Object) value);
    }
    public static void printMatrix(int m,int n, Object value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(short m,int n, Object value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m,int n, Integer value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(byte m,int n, Object value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(double m,int n, Object value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m,long n, Object value){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(value);
            }
            System.out.println();
        }
    }


}
