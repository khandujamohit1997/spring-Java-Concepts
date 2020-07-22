package com.unthinkable.enumeration.repository;

import com.unthinkable.enumeration.model.ItemEntity;
import com.unthinkable.enumeration.resources.EnItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {

    public List<ItemEntity> findByType(EnItemType type);
}
