package lacamara.ui.components;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 25/03/12
 * Time: 7:07
 * To change this template use File | Settings | File Templates.
 */
public class ExternalImageUrl extends WebComponent{
    
    public ExternalImageUrl(String id, IModel model) {
        super(id, model);
        add(new AttributeModifier("src", true, new PropertyModel(this.getModel(), "url")));
        add(new AttributeModifier("alt", true, new PropertyModel(this.getModel(), "url")));
    }

    protected void onComponentTag(ComponentTag tag) {
        super.onComponentTag(tag);
        checkComponentTag(tag, "img");
    }
}
