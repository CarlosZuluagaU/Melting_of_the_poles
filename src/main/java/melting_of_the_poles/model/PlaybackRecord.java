
    package melting_of_the_poles.model;

import java.time.LocalDateTime;

    public class PlaybackRecord {
        private Video video;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String userEmail;

        public PlaybackRecord(Video video, LocalDateTime startTime, String userEmail) {
            this.video = video;
            this.startTime = startTime;
            this.userEmail = userEmail;
        }

        public Video getVideo() {
            return video;
        }

        public void setVideo(Video video) {
            this.video = video;
        }

        public LocalDateTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
        }

        public LocalDateTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }
    }

