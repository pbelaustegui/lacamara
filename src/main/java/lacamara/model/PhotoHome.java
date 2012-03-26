package lacamara.model;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: pablo
 * Date: 25/03/12
 * Time: 8:39
 * To change this template use File | Settings | File Templates.
 */
public class PhotoHome {

    private static PhotoHome instance;
    private CircularList<Photo> photos;

    private PhotoHome(){
        photos = new CircularList<Photo>(Arrays.asList(
                new Photo("http://farm7.staticflickr.com/6048/7012422397_75e79c6965.jpg",
                        "Ana en el jardín",
                        "Ana en el jardín"),
                new Photo("http://farm8.staticflickr.com/7251/6866318370_646091e526.jpg",
                        "Moni al sol",
                        "Moni al sol"),
                new Photo("http://farm7.staticflickr.com/6104/7012448247_536a3b3308.jpg",
                        "Alejo en la terraza",
                        "Alejo en la terraza"),
                new Photo("http://farm8.staticflickr.com/7066/6866327614_d966a8f45c.jpg",
                        "Fer en el pasillo",
                        "Fer en el pasillo")));
    }

    public synchronized static PhotoHome getInstance (){
        if(instance == null){
            instance = new PhotoHome();
        }
        return instance;
    }

    public CircularList<Photo> getPhotos(){
        return this.photos;
    }
}
