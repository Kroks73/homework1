package lesson1;

public class MainClassForLessonOne {

    public static void main(String[] args) {
//        System.out.println("Hello, GeekBrains!");
        /*printHello();*/

//        testVars();
        checkAppraisal ();
    }

    static void printHello() {
       System.out.println("Hello, world");
       System.out.println(123);
       System.out.println(123.345);
       System.out.println(123.345f);
       System.out.println(12345L);
    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        double result = 1.0 * varA / varB;
        System.out.println(result);

        double doubleVarA = 9.0;
        float floutVarsB = (float)  doubleVarA - 4;
        System.out.println(doubleVarA / floutVarsB);

        varA = varA + 3;
        varA += 3;
        varA++;
        ++varA;
        boolean isREd = true;
        isREd = false;


        char chr1 = '@';
        char chr2 = 1234;
        System.out.println((char)(chr1 + chr2));
        System.out.println(chr2);

    }

    private static void checkAppraisal() {
        int appraisal = 5;
        System.out.println("Школьник принес оценку: " + appraisal);

        if (true) {
            System.out.println("Молодец!Так держать");
        }
        System.out.println("проверка дневника окончена");
    }
}
