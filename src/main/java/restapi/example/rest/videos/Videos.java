package restapi.example.rest.videos;

import java.util.Date;

public class Videos {
    private int id;
    private String videoName;
    private int views;
    private Date releaseDate;

    public Videos() {
        super();
    }

    public Videos(int id, String videoName, int views, Date releaseDate) {
        this.id = id;
        this.videoName = videoName;
        this.views = views;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", views=" + views +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
