package javaprogram;

/*Write a class with the name Wall. The class needs two fields(instance variables) with name width
and height of type double.*/
public class Wall {
    double width;
    double height;

    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    public Wall(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall Wall = new Wall(5, 4);
        System.out.println("area = " + Wall.getArea());
        Wall.setHeight(-1.5);
        System.out.println("width= " + Wall.getWidth());
        System.out.println("height= " + Wall.getHeight());
        System.out.println("area= " + Wall.getArea());
    }


}
