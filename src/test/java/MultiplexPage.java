import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class MultiplexPage {

    SelenideElement PopUpBtn =    $(".yes");
    SelenideElement MenuButton =    $(".menu-btn");
    SelenideElement cinemaList = $("div.mob_container > div.menu_list > a:nth-child(5)")   ;
    SelenideElement facebookUrl = $("div.left_menu.js-left-menu.on > div > div.menu-block > div.menu_soc > a:nth-child(1)")   ;
    SelenideElement Poster1 = $("#mp_postersList > div:nth-child(2)");
    SelenideElement Poster2 = $("#mp_postersList > div:nth-child(3)");
    SelenideElement Poster3 = $("#mp_postersList > div:nth-child(4)");
    SelenideElement Poster4 = $("#mp_postersList > div:nth-child(5)");
    SelenideElement Poster5 = $("#mp_postersList > div:nth-child(6)");
    SelenideElement ActiveCity = $("#tocinemas");
    SelenideElement Popcorn = $(".left_menu .menu_list a.yellow");
    public void openPage() {
    open(baseUrl);
}

    public void PopUpClick() {
        PopUpBtn.shouldBe(visible).click();
    }

    public void MenuBtnClick() {
        MenuButton.shouldBe(visible).click();
    }

    public void CheckCinemaList(String textcinema) {
        cinemaList.shouldHave(exactText(textcinema));

    }

    public void FacebookUrl(String facebooklink) {
        facebookUrl.shouldHave(href(facebooklink));
    }

    public void FivePostersVisible() {
        Poster1.shouldBe(visible);
        Poster2.shouldBe(visible);
        Poster3.shouldBe(visible);
        Poster4.shouldBe(visible);
        Poster5.shouldBe(visible);
    }
    public void CityCheck() {
        ActiveCity.shouldNotHave(text("Миколаїв"));
    }
    public void PopcornCheck(){
        Popcorn.shouldHave(cssValue("color", "rgba(254, 238, 39, 1)"));
        Popcorn.shouldHave(text("Попкорн"));
        }
    }
