package Application.Domain;

public class AstroDate {
    private String date;
    private String sourceTimeScale;
    private String targetTimeScale;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSourceTimeScale() {
        return sourceTimeScale;
    }

    public void setSourceTimeScale(String sourceTimeScale) {
        this.sourceTimeScale = sourceTimeScale;
    }

    public String getTargetTimeScale() {
        return targetTimeScale;
    }

    public void setTargetTimeScale(String targetTimeScale) {
        this.targetTimeScale = targetTimeScale;
    }
}
