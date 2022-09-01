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
        MultiplexPage.PopUpClick();
        MultiplexPage.MenuBtnClick();
    }

    @Test
    public void CheckCinemaListText() {
         MultiplexPage.CheckCinemaList("Кінотеатри");
    }

    @Test
    public void CheckFacebookUrl() {
        MultiplexPage.FacebookUrl("https://www.facebook.com/uamultiplex");
        }

    @Test
    public void CheckPosters() {
                MultiplexPage.FivePostersVisible();

    }
    @Test
    public void CityNotMykolaiv() {
        MultiplexPage.CityCheck();
    }

    @Test
    public void YellowIsForPopcorn() {
        MultiplexPage.PopcornCheck();
    }
}
