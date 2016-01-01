
package shapes {
  class Point(val x: Double, val y: Double) {
    // toString is a concrete method, needs to be overrided
    override def toString() = "Point(" + x + "," + y + ")"
  }

  // Only the abstract class has "abstract" keyword.
  abstract class Shape() {
    // draw will return "nothing"
    def draw(): Unit
  }

  class Circle(val center: Point, val radius: Double) extends Shape {
    def draw() = println("Circle.draw: " + this)
    override def toString() = "Circle(" + center + "," + radius + ")"
  }

  class Rectangle(val lowerleft: Point, val height: Double, val width: Double)
        extends Shape {
    def draw() = println("Rectangle.draw: " + this);
    override def toString() =
      "Rectangle(" + lowerleft + "," + height + "," + width + ")"
  }

  class Triangle(val point1: Point, val point2: Point, val point3: Point)
        extends Shape {
    def draw() = println("Triangle.draw: " + this)
    override def toString() =
      "Triangle(" + point1 + "," + point2 + "," + point3 + ")"
  }
}
