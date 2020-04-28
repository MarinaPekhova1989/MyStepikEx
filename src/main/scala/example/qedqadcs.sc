import scala.xml

val str =
  """
    |<Str Domain="XmlParsing" Id="1">
    |   <ListData>
    |       <Data TestResult="Test 1 successful! :)"></Data>
    |       <Data TestResult="Test 2 successful! :)"></Data>
    |       <Data TestResult="Test 3 successful! :)"></Data>
    |   </ListData>
    |</Str>
    |""".stripMargin

// распарсить список TestResult
val testResults = XML.loadFile(str).toString()

print("\n"+ testResults)