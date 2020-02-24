package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Julia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со сторонами " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(2, 5, 1, 10);
    System.out.println("Расстояние между точками с координатами (" + p.x1 + ", " + p.y1 +
            ") и (" + p.x2 + ", " + p.y2 + ")" + " равно " + p.distance());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}