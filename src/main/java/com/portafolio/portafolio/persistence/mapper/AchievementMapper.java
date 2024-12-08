package com.portafolio.portafolio.persistence.mapper;

import com.portafolio.portafolio.domain.Achievement;
import com.portafolio.portafolio.persistence.entity.Logro;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AchievementMapper {
    @Mappings({
            @Mapping(source = "idLogro", target = "achievementId"),
            @Mapping(source = "tituloLogro", target = "achievementTitle"),
            @Mapping(source = "descripcionLogro", target = "achievementDescription"),
            @Mapping(source = "imagenLogro", target = "achievementImage")
    })
    Achievement toAchievement(Logro logro);
    List<Achievement> toAchievements(List<Logro> logros);
    @InheritInverseConfiguration
    Logro toLogro(Achievement achievement);
}
