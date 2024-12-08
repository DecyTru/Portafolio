package com.portafolio.portafolio.persistence;

import com.portafolio.portafolio.domain.Achievement;
import com.portafolio.portafolio.domain.repository.AchievementRepository;
import com.portafolio.portafolio.persistence.crud.LogroCrudRepository;
import com.portafolio.portafolio.persistence.entity.Logro;
import com.portafolio.portafolio.persistence.mapper.AchievementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LogroRepository implements AchievementRepository {

    @Autowired
    private LogroCrudRepository logroCrudRepository;

    @Autowired
    private AchievementMapper mapper;

    @Override
    public List<Achievement> getAll() {
        List<Logro> logros = (List<Logro>) logroCrudRepository.findAll();
        return mapper.toAchievements(logros);
    }
    @Override
    public Optional<Achievement> getAchievement(int achievementId) {
        return  logroCrudRepository.findById(achievementId).map(logro -> mapper.toAchievement(logro));
    }

    @Override
    public Achievement save(Achievement achievement) {
        Logro logro = mapper.toLogro(achievement);
        return mapper.toAchievement(logroCrudRepository.save(logro));
    }
    @Override
    public void delete(int achievementId){
        logroCrudRepository.deleteById(achievementId);
    }
}
