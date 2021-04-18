
package com.ignite.bookfinder.domain.oreilly;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.annotation.Generated;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "content_type",
    "archive_id",
    "ourn",
    "title",
    "timestamp",
    "last_modified_time",
    "date_added",
    "issued",
    "isbn",
    "format",
    "content_format",
    "virtual_pages",
    "duration_seconds",
    "language",
    "natural_key",
    "source",
    "video_classification",
    "has_assessment",
    "academic_excluded",
    "url",
    "web_url",
    "cover_url",
    "description",
    "popularity",
    "average_rating",
    "report_score",
    "number_of_reviews",
    "number_of_followers",
    "number_of_items",
    "authors",
    "publishers",
    "topics",
    "topics_payload"
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash
@Generated("jsonschema2pojo")
public class Result {

    @Id
    @JsonProperty("id")
    private String id;
    @JsonProperty("content_type")
    private String contentType;
    @JsonProperty("archive_id")
    private String archiveId;
    @JsonProperty("ourn")
    private String ourn;
    @JsonProperty("title")
    private String title;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("last_modified_time")
    private String lastModifiedTime;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("issued")
    private String issued;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("format")
    private String format;
    @JsonProperty("content_format")
    private String contentFormat;
    @JsonProperty("virtual_pages")
    private Integer virtualPages;
    @JsonProperty("duration_seconds")
    private Integer durationSeconds;
    @JsonProperty("language")
    private String language;
    @JsonProperty("natural_key")
    private List<String> naturalKey = null;
    @JsonProperty("source")
    private String source;
    @JsonProperty("video_classification")
    private String videoClassification;
    @JsonProperty("has_assessment")
    private Boolean hasAssessment;
    @JsonProperty("academic_excluded")
    private Boolean academicExcluded;
    @JsonProperty("url")
    private String url;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("cover_url")
    private String coverUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("average_rating")
    private Integer averageRating;
    @JsonProperty("report_score")
    private Integer reportScore;
    @JsonProperty("number_of_reviews")
    private Integer numberOfReviews;
    @JsonProperty("number_of_followers")
    private Integer numberOfFollowers;
    @JsonProperty("number_of_items")
    private Integer numberOfItems;
    @JsonProperty("authors")
    private List<String> authors = null;
    @JsonProperty("publishers")
    private List<String> publishers = null;
    @JsonProperty("topics")
    private List<String> topics = null;
    @JsonProperty("topics_payload")
    private List<TopicsPayload> topicsPayload = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", format='" + format + '\'' +
                ", authors=" + authors +
                '}';
    }
}
