// Name : Unzila Ishtiaq
// Roll No : 20


class Triangle
{
    int height;
    int base;
    int side_1;
    int side_3;

    Triangle(int h, int b,int a,int c)
    {
        this.height = h;
        this.base = b;
        this.side_1 = a;
        this.side_3 = c;
    }

    int getArea()
    {
        return (height * base)/2;
    }

    int getPerimeter()
    {
        return side_1 + base + side_3;
    }
}
class calculateTriangle
{
    public static void main(String arg[])
    {
        Triangle t = new Triangle(25, 12, 7, 14);

        System.out.println("Area = " + t.getArea());
        System.out.println("Perimeter = " + t.getPerimeter());

    }
}