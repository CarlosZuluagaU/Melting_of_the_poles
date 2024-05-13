package melting_of_the_poles.repository;

import melting_of_the_poles.model.PlaybackRecord;

import java.time.LocalDateTime;
import java.util.List;

public interface ViewsRepository {


    void savePlaybackRecord(PlaybackRecord playbackRecord);


    List<PlaybackRecord> getAllPlaybackRecords();


    List<PlaybackRecord> getPlaybackRecordsByVideoCode(String videoCode);


    List<PlaybackRecord> getPlaybackRecordsByUserEmail(String userEmail);


    List<PlaybackRecord> getPlaybackRecordsByDateRange(LocalDateTime startDate, LocalDateTime endDate);


    int getViewCountByVideoCode(String videoCode);


    int getViewCountByUserEmail(String userEmail);


    int getTotalViewCount();


    int getViewCountByDateRange(LocalDateTime startDate, LocalDateTime endDate);
}