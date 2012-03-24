package lacamara.ui.containers;

import org.apache.wicket.markup.html.basic.Label;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 3/23/12
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage extends BasePage{

    public HomePage(){
        add(new Label("bodyMessage", "."));
    }
}
