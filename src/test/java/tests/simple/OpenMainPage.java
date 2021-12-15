package tests.simple;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenMainPage extends TestBase {
    @Test
    public void openPage() {
        open("https://github.com/");
        $("body").shouldHave(Condition.text("Where the world builds software"));
    }
}
