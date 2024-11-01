package Source_Code;

public class RectangleShape extends SquareShape{

    //public int height;
    public double width;

    public RectangleShape(double height,double width, double x_pos, double y_pos)
    {
        super(height,x_pos,y_pos);
        //this.height = height;
        this.width = width;
    }



    public double CalculateArea(double height, double width, double x_pos, double y_pos) {
        return height*width;
    }
}