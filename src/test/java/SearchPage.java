import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {

    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * Возвращает href из первой статьи
     */
    public String getHrefFromFirstActicle(){
        return  articleTitles.first().getAttribute("href");
    }
}
