package com.works.restapi.services;

import com.works.restapi.entities.Note;
import com.works.restapi.entities.dtos.NoteAddDto;
import com.works.restapi.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    final NoteRepository noteRepository;

    public Note addNote(NoteAddDto noteAddDto) {
        Note note = new Note();
        note.setTitle(noteAddDto.getTitle());
        note.setContent(noteAddDto.getContent());
        return noteRepository.save(note);
    }

    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

}
