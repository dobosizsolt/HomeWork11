import java.util.ArrayList;
import java.util.HashMap;

public class Items {

    private String id;
    private String uploaded;
    private String updated;
    private String uploader;
    private String category;
    private String title;
    private String description;
    private ArrayList<String> tags;
    private HashMap<String, String> thumbnail;
    private HashMap<String, String> player;
    private HashMap<Integer, String> content;
    private Integer duration;
    private String aspectRatio;
    private Float rating;
    private Integer ratingCount;
    private Integer viewCount;
    private Integer favoriteCount;
    private Integer commentCount;
    private Status status;
    private AccessControl accessControl;

    public Items() {
    }

    public Items(String id, String uploaded, String updated, String uploader, String category, String title, String description, ArrayList<String> tags, HashMap<String, String> thumbnail, HashMap<String, String> player, HashMap<Integer, String> content, Integer duration, String aspectRatio, Float rating, Integer ratingCount, Integer viewCount, Integer favoriteCount, Integer commentCount, Status status, AccessControl accessControl) {
        this.id = id;
        this.uploaded = uploaded;
        this.updated = updated;
        this.uploader = uploader;
        this.category = category;
        this.title = title;
        this.description = description;
        this.tags = tags;
        this.thumbnail = thumbnail;
        this.player = player;
        this.content = content;
        this.duration = duration;
        this.aspectRatio = aspectRatio;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.viewCount = viewCount;
        this.favoriteCount = favoriteCount;
        this.commentCount = commentCount;
        this.status = status;
        this.accessControl = accessControl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public HashMap<String, String> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(HashMap<String, String> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public HashMap<String, String> getPlayer() {
        return player;
    }

    public void setPlayer(HashMap<String, String> player) {
        this.player = player;
    }

    public HashMap<Integer, String> getContent() {
        return content;
    }

    public void setContent(HashMap<Integer, String> content) {
        this.content = content;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id='" + id + '\'' +
                ", uploaded='" + uploaded + '\'' +
                ", updated='" + updated + '\'' +
                ", uploader='" + uploader + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", thumbnail=" + thumbnail +
                ", player=" + player +
                ", content=" + content +
                ", duration=" + duration +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", viewCount=" + viewCount +
                ", favoriteCount=" + favoriteCount +
                ", commentCount=" + commentCount +
                ", status=" + status +
                ", accessControl=" + accessControl +
                '}';
    }
}
