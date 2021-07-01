package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertions {
    @Test

    void successSearchJUnit5(){
        open("https://github.com/selenide/selenide/");
        $(byText("Wiki")).click();
        $(".js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).shouldBe(Condition.visible);
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".gollum-markdown-content").shouldHave(text("JUnit5"));

    }
}
