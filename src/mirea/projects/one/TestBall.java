package mirea.projects.one;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball d1 = new Ball("White", "Middle");
        Ball d2 = new Ball("Yellow", "Small");
        Ball d3 = new Ball("Orange", "Large");
        Ball d4 = new Ball("Black", "Small");
        System.out.println(d1.Sportstyle());
        System.out.println(d2.Sportstyle());
        System.out.println(d3.Sportstyle());
        System.out.println(d4.Sportstyle());
    }
}
