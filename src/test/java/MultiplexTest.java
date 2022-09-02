import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultiplexTest {

    MultiplexPage MultiplexPage = new MultiplexPage();

    @BeforeClass
    public void config() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 1111;
        Configuration.baseUrl = "https://multiplex.ua";
        MultiplexPage.openPage();
        MultiplexPage.popUpClick();
        MultiplexPage.menuBtnClick();
    }

    @Test
    public void checkCinemaListText() {
        MultiplexPage.checkCinemaList("Кінотеатри");
    }

    @Test
    public void checkFacebookUrl() {
        MultiplexPage.facebookUrl("https://www.facebook.com/uamultiplex");
    }

    @Test
    public void checkPosters() {
        MultiplexPage.fivePostersVisible();
    }

    @Test
    public void cityNotMykolaiv() {
        MultiplexPage.cityCheck();
    }

    @Test
    public void yellowIsForPopcorn() {
        MultiplexPage.popcornCheck();
    }
}
