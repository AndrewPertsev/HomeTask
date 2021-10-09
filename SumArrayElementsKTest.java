package by.epam.jwd36.andrewpertsev.hometask2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumArrayElementsKTest {
    private static SumArrayElementsK obj;

    @BeforeClass
    public static void createNewTestClassObject() {
        obj = new SumArrayElementsK();
    }

    @Test
    public void calculateSumArrayElementsKTest() {
        int massive[] = {2, 6, 9, 5, 3};
        int divisor = 3;
        int expectedSum = 18;
        int realSum;

        realSum = obj.calculateSumArrayElementsK(massive, divisor);

        Assert.assertEquals(expectedSum, realSum);
    }

    @Test
    public void generateRandomMassiveTest() {

        int expectedSize = 8;
        int realSize;

        realSize =obj.generateRandomMassive(expectedSize).length;

        Assert.assertEquals(expectedSize, realSize);
    }

}