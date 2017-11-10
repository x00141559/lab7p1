
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body> <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
              <a class="navbar-brand" href="/">Lab 2</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
              <li """),_display_(/*24.20*/if(title =="Home")/*24.38*/{_display_(Seq[Any](format.raw/*24.39*/("""class="active"""")))}),format.raw/*24.54*/("""><a href=""""),_display_(/*24.65*/routes/*24.71*/.HomeController.index()),format.raw/*24.94*/("""">Home</a></li>
              <li """),_display_(/*25.20*/if(title =="About")/*25.39*/{_display_(Seq[Any](format.raw/*25.40*/("""class="active"""")))}),format.raw/*25.55*/("""><a href="/About">About Us</a></li>
              <li """),_display_(/*26.20*/if(title =="Product")/*26.41*/{_display_(Seq[Any](format.raw/*26.42*/("""class="active"""")))}),format.raw/*26.57*/("""><a href="/Product">Product</a></li>
            </ul>
          </nav>
                <hr>
        """),format.raw/*31.32*/("""
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""
        """),format.raw/*33.9*/("""<footer class="container-fluid text-center">
                <p>Copyright 2017</p>
              </footer>
              
        <hr>
</body>
        <script src=""""),_display_(/*39.23*/routes/*39.29*/.Assets.versioned("javascripts/main.js")),format.raw/*39.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 10 16:02:18 GMT 2017
                  SOURCE: /media/sf_student/lab7part1/app/views/main.scala.html
                  HASH: 0014b947242ce53df2302e2086f8984e2a78a704
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|1791->589|1806->595|1867->634|2220->960|2247->978|2286->979|2332->994|2370->1005|2385->1011|2429->1034|2491->1069|2519->1088|2558->1089|2604->1104|2686->1159|2716->1180|2755->1181|2801->1196|2930->1387|2967->1397|2995->1404|3031->1413|3223->1578|3238->1584|3299->1624
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|61->31|62->32|62->32|63->33|69->39|69->39|69->39
                  -- GENERATED --
              */
          