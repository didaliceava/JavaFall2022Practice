package junit_basics;

import org.junit.*;

public class LearnTest {

    int doAddition(int num1, int num2) {
        return num1 + num2;
    }

    int doMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    @BeforeClass
    public static void doSomethingBeforeClass() {
        System.out.println("BEFORE CLASS\n");
    }

    @AfterClass
    public static void doSomethingAfterClass() {
        System.out.println("AFTER CLASS\n");
    }

    @Before
    public void doSomethingBefore() {
        System.out.println("BEFORE TEST\n");
    }

    @After
    public void doSomethingAfter() {
        System.out.println("AFTER TEST\n");
    }

    @Test
    public void testMultiplication() {
        int num1 = 5;
        int num2 = 5;
        int expected = 25;

        System.out.println("Executing Test 1\n");

        LearnTest obj = new LearnTest();
        Assert.assertEquals(expected, obj.doMultiplication(num1, num2));
    }

    @Test
    public void testAddition() {
        int num1 = 10;
        int num2 = -10;

        System.out.println("Executing Test 2\n");

        LearnTest obj = new LearnTest();
        int expected = 0;

        Assert.assertTrue(obj.doAddition(num1, num2) == expected);
    }

}
