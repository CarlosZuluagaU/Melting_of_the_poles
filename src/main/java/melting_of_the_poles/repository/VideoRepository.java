package melting_of_the_poles.repository;

import melting_of_the_poles.model.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VideoRepository {
    private final List<Video> videos;

    public VideoRepository() {
        this.videos = new ArrayList<>();
    }

    public List<Video> findAll() {
        return new ArrayList<>(videos);
    }

    public List<Video> find(Double fromDuration, Double toDuration) {
        if (fromDuration == null || toDuration == null) {
            return new ArrayList<>();
        }

        if (fromDuration > toDuration) {
            throw new IllegalArgumentException("fromDuration debe ser menor o igual que toDuration");
        }

        return videos.stream()
                .filter(video -> video.getDuration() >= fromDuration && video.getDuration() <= toDuration)
                .collect(Collectors.toList());
    }

    public void addVideo(Video video) {
        videos.add(video);
    }
}
