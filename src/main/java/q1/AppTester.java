package q1;

import test.TestHelper;

public class AppTester
{
    public static void main(String[] args) {
        test_App_typicalUsageWorks();
        test_App_repromptsOnInvalidFirstInt();
        test_App_repromptsOnInvalidSecondInt();
    }

    private static void test_App_typicalUsageWorks() {
        App App1 = new App();
        TestHelper.setSystemIn("2%n3%n".formatted());// Calling formatted() here converts %n to the system's line separator
        // Simulate the user pressing '2' then 'enter' then '3' then 'enter'
        App1.returnAllValues();


        TestHelper.redirectSystemOut();  // So that the program output can be captured below...
        String actual = TestHelper.getOutput();  // Get the program output
        // Run the program by calling the main method

        String expected = """
                Enter an integer: 2
                Enter another integer: 3
                Sum =          5
                Difference =  -1
                Product =      6
                Average =      2.50
                Distance =     1
                Min =          2
                Max =          3
                """;

        if ( expected.equals(actual) ) {
            TestHelper.passMessage("The app works on a typical set of inputs");
        } else {
            TestHelper.failMessage("The app fails on a typical set of inputs.%n%nExpected%n%n%s%nbut got%n%n%s".formatted(expected, actual));
        }
    }
    private static void test_App_repromptsOnInvalidFirstInt() {
        // TODO: complete this test
        TestHelper.setSystemIn("2.28%Rick%n".formatted());
        String actual = TestHelper.getOutput();
    }

    private static void test_App_repromptsOnInvalidSecondInt() {
        // TODO: complete this test
        TestHelper.setSystemIn("-7.9%Bob%n".formatted());
        String actual = TestHelper.getOutput();
    }
}