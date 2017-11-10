
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab7part1/conf/routes
// @DATE:Fri Nov 10 15:48:49 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
