package junit_basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class LearnAnnotations {

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

}
