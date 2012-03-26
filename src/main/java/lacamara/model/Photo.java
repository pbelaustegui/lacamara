package lacamara.model;

import java.io.Serializable;

/**         ;
 * User: pablo
 * Date: 25/03/12
 * Time: 8:35
 * Una foto a ser mostrada
 */
public class Photo implements Serializable{

    public Photo(String url, String title, String alternativeText) {
        this.url = url;
        this.title = title;
        this.alternativeText = alternativeText;
    }

    private String url;
    private String title;
    private String alternativeText;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlternativeText() {
        return alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    public String getUrl() {
        return url;

    }

    public void setUrl(String url) {
        this.url = url;
    }
}
