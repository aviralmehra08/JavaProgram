public class Point
{
    int x;
    int y;
    public Point()
    {

    }   
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x=x;
    } 
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance()
    {
        return distance(0,0);
    }
    public double distance(int x, int y)
    {
        double distance=Math.pow(x-this.x,2)+Math.pow(y-this.y,2);
        return Math.sqrt(distance);
    }
    public double distance(Point another)
    {
        return distance(another.getX(),another.getY());
    }
    public static void main(String args[])
    {
        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println("distance(0,0)= "+first.distance());
        System.out.println("distance(second)= "+first.distance(second));
        System.out.println("distance(2,2)= "+first.distance(2,2));
        Point point=new Point();
        System.out.println("distance()= "+point.distance());
    }
}
