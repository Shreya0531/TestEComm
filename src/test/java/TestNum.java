import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNum {
    @Test
    public void addTwoPositiveNumbers() {
        //Arrange
        int firstNumber = 1;
        int secondNumber = 2;

        //Act
        int result = firstNumber + secondNumber;

        //Assert
        Assert.assertEquals(result,3);
    }

}
