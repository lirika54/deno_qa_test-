import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.nio.channels.FileChannel.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }


    @Test
    void fillFromTest() {
        
        open("/text-box");

        $("#userName").setValue("Fox");
        $("#userEmail").setValue("Fox@mak.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Other address 2");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);
    }


}
