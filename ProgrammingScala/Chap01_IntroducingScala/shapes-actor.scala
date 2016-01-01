
package shapes {
  import scala.actors._
  import scala.actors.Actor._

  object ShapeDrawingActor extends Actor {
    // act is an abstract method
    def act() {
      loop {
        receive { // This is a function literal
          // Pattern matching
          case s: Shape => s.draw()
          case "exit"   => println("exiting..."); exit
          case x: Any   => println("Error: Unknown Message! " + x)
        }
      }
    }
  }
}
