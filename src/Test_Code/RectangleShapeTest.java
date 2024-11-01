package Test_Code;

import Source_Code.RectangleShape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleShapeTest {
    @Test
    public void testSquareShape()
    {
        RectangleShape rs = new RectangleShape(7,5,4,6);
        rs.CalculateArea(7,5,5,6);
    }

}