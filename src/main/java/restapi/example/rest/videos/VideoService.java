package restapi.example.rest.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

//    Get all videos
    public List<Videos> getVideos() {
        return videoRepository.findAll();
    }

//    Get a video
    public Optional<Videos> getVideo(int id){
        return videoRepository.findById(id);
    }
}
