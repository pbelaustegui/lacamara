package lacamara;

import com.google.gdata.client.photos.PicasawebService;
import com.google.gdata.data.photos.AlbumEntry;
import com.google.gdata.data.photos.UserFeed;
import junit.framework.TestCase;

import javax.xml.parsers.ParserConfigurationException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: pablo
 * Date: 4/20/12
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class picasaTest extends TestCase{


    public void testPicasa() throws Exception{
        PicasawebService service = new PicasawebService("lacamarademonica");

        URL feedUrl = new URL("https://picasaweb.google.com/data/feed/api/user/pbelaustegui?kind=album");

        UserFeed myUserFeed = service.getFeed(feedUrl, UserFeed.class);

        for (AlbumEntry myAlbum : myUserFeed.getAlbumEntries()) {
            System.out.println(myAlbum.getTitle().getPlainText());
        }
    }
}
