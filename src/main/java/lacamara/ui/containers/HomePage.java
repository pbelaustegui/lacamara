package lacamara.ui.containers;

import lacamara.model.Photo;
import lacamara.model.PhotoHome;
import lacamara.ui.components.ExternalImageUrl;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 3/23/12
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage extends BasePage{

    public HomePage(){
        add(new PhotoListPanel("content", PhotoHome.getInstance().getPhotos()));
    }                                
}
