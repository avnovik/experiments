package tests.simple;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenMainPage {
    @Test
    public void openPage(){
        open("https://github.com/");
        $("body").shouldHave(Condition.text("Where the world builds software"));
    }
}
