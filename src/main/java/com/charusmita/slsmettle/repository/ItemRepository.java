package com.charusmita.slsmettle.repository;

import com.charusmita.slsmettle.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {


}
