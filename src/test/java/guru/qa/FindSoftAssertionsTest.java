package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FindSoftAssertionsTest {

    @Test
    void shouldFindSelenideRepository() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").$(byText("Soft assertions")).click();
        $$(".markdown-body li").shouldHave(itemWithText("Using JUnit5 extend test class:"));
        $("[start=\"3\"]").sibling(0).shouldHave(text("@ExtendWith"));

    }
}

