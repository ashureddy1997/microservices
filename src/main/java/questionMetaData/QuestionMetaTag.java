
package questionMetaData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuestionMetaTag {

    @SerializedName("bloom_level")
    @Expose
    private String bloomLevel;
    @SerializedName("chapter")
    @Expose
    private List<String> chapter = null;
    @SerializedName("difficulty_level")
    @Expose
    private Integer difficultyLevel;
    @SerializedName("exams")
    @Expose
    private List<String> exams = null;
    @SerializedName("goals")
    @Expose
    private List<String> goals = null;
    @SerializedName("ideal_time")
    @Expose
    private Integer idealTime;
    @SerializedName("learning_maps")
    @Expose
    private List<String> learningMaps = null;
    @SerializedName("primary_concept")
    @Expose
    private String primaryConcept;
    @SerializedName("secondary_concept")
    @Expose
    private List<String> secondaryConcept = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("subject")
    @Expose
    private List<String> subject = null;
    @SerializedName("topic")
    @Expose
    private List<String> topic = null;
    @SerializedName("topics_learn_path_code")
    @Expose
    private List<String> topicsLearnPathCode = null;
    @SerializedName("topics_learn_path_name")
    @Expose
    private List<String> topicsLearnPathName = null;
    @SerializedName("unit")
    @Expose
    private List<String> unit = null;
    @SerializedName("video_solution")
    @Expose
    private String videoSolution;

    public String getBloomLevel() {
        return bloomLevel;
    }

    public void setBloomLevel(String bloomLevel) {
        this.bloomLevel = bloomLevel;
    }

    public List<String> getChapter() {
        return chapter;
    }

    public void setChapter(List<String> chapter) {
        this.chapter = chapter;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public List<String> getExams() {
        return exams;
    }

    public void setExams(List<String> exams) {
        this.exams = exams;
    }

    public List<String> getGoals() {
        return goals;
    }

    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    public Integer getIdealTime() {
        return idealTime;
    }

    public void setIdealTime(Integer idealTime) {
        this.idealTime = idealTime;
    }

    public List<String> getLearningMaps() {
        return learningMaps;
    }

    public void setLearningMaps(List<String> learningMaps) {
        this.learningMaps = learningMaps;
    }

    public String getPrimaryConcept() {
        return primaryConcept;
    }

    public void setPrimaryConcept(String primaryConcept) {
        this.primaryConcept = primaryConcept;
    }

    public List<String> getSecondaryConcept() {
        return secondaryConcept;
    }

    public void setSecondaryConcept(List<String> secondaryConcept) {
        this.secondaryConcept = secondaryConcept;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    public List<String> getTopicsLearnPathCode() {
        return topicsLearnPathCode;
    }

    public void setTopicsLearnPathCode(List<String> topicsLearnPathCode) {
        this.topicsLearnPathCode = topicsLearnPathCode;
    }

    public List<String> getTopicsLearnPathName() {
        return topicsLearnPathName;
    }

    public void setTopicsLearnPathName(List<String> topicsLearnPathName) {
        this.topicsLearnPathName = topicsLearnPathName;
    }

    public List<String> getUnit() {
        return unit;
    }

    public void setUnit(List<String> unit) {
        this.unit = unit;
    }

    public String getVideoSolution() {
        return videoSolution;
    }

    public void setVideoSolution(String videoSolution) {
        this.videoSolution = videoSolution;
    }

}
