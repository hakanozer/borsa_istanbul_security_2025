package com.works.restapi.repositories;

import com.works.restapi.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}