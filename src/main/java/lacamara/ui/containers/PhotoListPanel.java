package lacamara.ui.containers;

import lacamara.model.CircularList;
import lacamara.model.Photo;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 25/03/12
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */
public class PhotoListPanel extends Panel{

    private CircularList<Photo> photos;
    private PhotoPanel photoPanel;

    public PhotoListPanel(String id, final CircularList<Photo> photos) {
        super(id);
        this.photos = photos;
        add(new AjaxFallbackLink("previous") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                photos.previous();
                if (target != null) {
                    target.addComponent(photoPanel);
                }
            }
        });
        add(new AjaxFallbackLink("next") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                photos.next();
                if(target != null){
                    target.addComponent(photoPanel);
                }
            }
        });
        photoPanel = new PhotoPanel("photoPanel", new PropertyModel(this.photos, "actual"));
        photoPanel.setOutputMarkupId(true);
        add(photoPanel);
    }
}
