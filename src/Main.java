public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");

        String mySqtring = "Life";
        mySqtring = "It's my life";
        System.out.println(mySqtring);

        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        // nesesito espesificar el valor del double
        Double myDouble = 6.2;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);

        Main myMain = new Main();
        myMain.plus(myInt, 2);

    }

    public void plus (int numerOne, int numerTwo) {
        System.out.println(numerOne + numerTwo);
    }
}