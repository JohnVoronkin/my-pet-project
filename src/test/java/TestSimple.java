import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSimple {

  @Test
  void initTest() {
    Configuration.browser = WebDriverRunner.CHROME;
    Configuration.holdBrowserOpen = true;
    open("https://www.google.com/");
  }

}
