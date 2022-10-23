// Name: Unzila Ishtiaq
//Roll No : 20
class modify
{
    int x;
    modify (int i) {x=i;}
    modify () {x=0;}
}
class noname
{
    public static void main(String[]args)
    {
        modify m = new modify(14);
        change (m);
        System.out.println(m.x);
    }
    public static void change (modify m)
    {
        m.x=6;
    }
}