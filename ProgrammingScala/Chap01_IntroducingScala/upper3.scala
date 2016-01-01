
object Upper {
  def main(args: Array[String]) = {
    // Intensively use annonymous parameters.
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
