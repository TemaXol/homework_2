import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ChangePositionTest {

    @Test
    void changePosition() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(100, 200).release().perform();
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));


    }
}
