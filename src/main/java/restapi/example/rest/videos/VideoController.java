package restapi.example.rest.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    //Get All videos
    @GetMapping("/videos")
    public List<Videos> getVideos(){
        return videoService.getVideos();
    }

    //Get a video
    @GetMapping("/video/{id}")
    public Optional<Videos> getVideo(@PathVariable int id){
        return videoService.getVideo(id);
    }
}
