import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HelloSpec extends AnyWordSpec with Matchers {
  "The Hello object" when {
    "greetings" should {
      "say hello" in {
        Hello.greeting shouldEqual "hello"
      }
    }
  }
}
