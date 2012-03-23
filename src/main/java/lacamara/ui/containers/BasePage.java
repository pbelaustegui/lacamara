package lacamara.ui.containers;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.resources.StyleSheetReference;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 3/22/12
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasePage extends WebPage{

    public BasePage(){
        add(new Label("title", "La cámara de Mónica"));
        add(new Label("headerMessage", "La cámara de Mónica (En construcción)"));
        add(new Label("footer", "............."));
    }
}
