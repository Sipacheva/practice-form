package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void successfulRegistration() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").val("Elizaveta");
        $("#lastName").val("Ivanova");
        $("#userEmail").val("Ivanova@mail.ru");
        $("[name=gender][value=Female]").parent().click();
        $("#userNumber").val("9997775522");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("2005");
        $(".react-datepicker__day--028:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").val("History").pressEnter();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("./img/1.jpg");
        $("#currentAddress").val("Москва, Южнопортовый проезд, д. 5, к. 2А");
        $("#state").scrollIntoView(true).click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();
        $("#submit").click();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Elizaveta Ivanova"), text("Ivanova@mail.ru"), text("Female"),
                text("9997775522"), text("28 July,2005"), text("History"), text("Reading"), text("1.jpg"),
                text("Москва, Южнопортовый проезд, д. 5, к. 2А"), text("Haryana Panipat"));

    }
}
