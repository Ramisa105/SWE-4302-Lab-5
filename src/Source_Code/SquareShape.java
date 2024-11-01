package Source_Code;

public class SquareShape implements Shape{
    public double height;
    public double x_pos;
    public double y_pos;

    public SquareShape(double height, double x_pos, double y_pos)
    {
        this.height = height;

    }


    @Override
    public double CalculateArea(double height, double x_pos, double y_pos) {
        return height*height;
    }

}