
object StringUtil {
  def joiner(strings: List[String], seperator: String = " "): String =
    strings.mkString(seperator)
}

import StringUtil._

println(joiner(List("Programming", "Scala")))
