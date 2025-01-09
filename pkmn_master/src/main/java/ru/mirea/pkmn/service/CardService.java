package ru.mirea.pkmn.service;

import org.springframework.stereotype.Service;
import ru.mirea.pkmn.entity.CardEntity;
import ru.mirea.pkmn.entity.StudentEntity;

import java.util.List;
import java.util.UUID;

@Service
public interface CardService {

    CardEntity getCardById(UUID id);

    CardEntity getCardByFIO(StudentEntity student);

    CardEntity getCardByName(String name);

    CardEntity saveCard(CardEntity card);

    List<CardEntity> findAllard();
}
