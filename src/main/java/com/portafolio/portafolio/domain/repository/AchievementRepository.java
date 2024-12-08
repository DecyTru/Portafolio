package com.portafolio.portafolio.domain.repository;

import com.portafolio.portafolio.domain.Achievement;

import java.util.List;
import java.util.Optional;

public interface AchievementRepository {

    List<Achievement> getAll();
    Optional<Achievement> getAchievement(int achievementId);
    Achievement save(Achievement achievement);
    void delete(int achievementId);
}
