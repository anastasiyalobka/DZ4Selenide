package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ActionsForRectangle {
    @Test

    void SuccessMoveRectangle(){
        // Configuration.headless=true;
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold()
                .moveByOffset(180,0).release().perform();

        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));

    }
}
