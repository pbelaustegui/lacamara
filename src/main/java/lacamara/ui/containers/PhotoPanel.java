package lacamara.ui.containers;

import lacamara.model.Photo;
import lacamara.ui.components.ExternalImageUrl;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 25/03/12
 * Time: 9:19
 * To change this template use File | Settings | File Templates.
 */
public class PhotoPanel extends Panel{

    public PhotoPanel(String id, IModel model) {
        super(id, model);
        add(new ExternalImageUrl("image", model));
        add(new Label("title", new PropertyModel(this.getModel(), "title")));
    }
}
