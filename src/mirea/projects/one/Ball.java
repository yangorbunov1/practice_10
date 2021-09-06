package mirea.projects.one;

public class Ball
{
    private String color;
    private String size;

    public Ball(String c, String s)
    {
        color = c;
        size = s;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getColor()
    {
        return color;
    }

    public String getSize()
    {
        return size;
    }

    public String Sportstyle()
    {
        String sport;
        if ((color == "White") & (size == "Middle"))
        {
            return "Football";
        }
        if ((color == "Yellow") & (size == "Small"))
        {
            return "Tennis";
        }
        if ((color == "Orange") & (size == "Large"))
        {
            return "Basketball";
        }
        else
        {
            return "no sport";
        }
    }

}