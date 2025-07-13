package lecture1;

public class Main {
    

     public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PrintName printedUser = new PrintName();
        printedUser.setName("Shoji");
        printedUser.setAge(19);
        printedUser.printName();

    }
}
