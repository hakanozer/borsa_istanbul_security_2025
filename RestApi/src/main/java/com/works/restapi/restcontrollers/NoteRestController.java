package com.works.restapi.restcontrollers;

import com.works.restapi.entities.Note;
import com.works.restapi.entities.dtos.NoteAddDto;
import com.works.restapi.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("note")
public class NoteRestController {

    private final NoteService noteService;

    @PostMapping("add")
    public Note addNote(@RequestBody NoteAddDto noteAddDto) {
        return noteService.addNote(noteAddDto);
    }

    @GetMapping("list")
    public List<Note> getAllNote() {
        return noteService.getAllNote();
    }

}
