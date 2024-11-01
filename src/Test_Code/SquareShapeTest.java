package Test_Code;
import Source_Code.RectangleShape;
import Source_Code.SquareShape;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SquareShapeTest {

    @Test
    public void testSquareShape()
    {
        SquareShape ss = new SquareShape(5,6,7);
        ss.CalculateArea(5,6,7);
    }
}