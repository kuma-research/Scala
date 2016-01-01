
import shapes._

ShapeDrawingActor.start() // Actor method

ShapeDrawingActor ! new Circle(new Point(0.0, 0.0), 1.0)
ShapeDrawingActor ! new Rectangle(new Point(0.0, 0.0), 2, 5)
ShapeDrawingActor ! new Triangle(new Point(0.0, 0.0),
                                 new Point(0.0, 1.0),
                                 new Point(1.0, 0.0))

ShapeDrawingActor ! 3.141592
ShapeDrawingActor ! "exit"
