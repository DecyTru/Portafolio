package com.portafolio.portafolio.domain;

public class Achievement {

    private int achievementId;
    private String achievementTitle;
    private String achievementDescription;
    private String achievementImage;

    public int getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(int achievementId) {
        this.achievementId = achievementId;
    }

    public String getAchievementTitle() {
        return achievementTitle;
    }

    public void setAchievementTitle(String achievementTitle) {
        this.achievementTitle = achievementTitle;
    }

    public String getAchievementDescription() {
        return achievementDescription;
    }

    public void setAchievementDescription(String achievementDescription) {
        this.achievementDescription = achievementDescription;
    }

    public String getAchievementImage() {
        return achievementImage;
    }

    public void setAchievementImage(String achievementImage) {
        this.achievementImage = achievementImage;
    }
}
