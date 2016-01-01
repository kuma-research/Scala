
// Singleton, to do what "static" do
object Upper {
  // Return type of upper could be inferred.
  // _ indicates a parameter. Just a syntax sugar.
  def upper(strings: String*) = strings.map(_.toUpperCase())
}

println(Upper.upper("A", "Second", "Scala", "Program"))
