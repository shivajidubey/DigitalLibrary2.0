package com.shiva.sb.service;

import com.shiva.sb.model.Content;
import com.shiva.sb.model.Movie;
import com.shiva.sb.model.TVSeries;
import com.shiva.sb.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    @Autowired
    private ContentRepository repository;

    public void addMovie(Movie content) {
        repository.save(content);
    }

    public void addTV(TVSeries content) {
        repository.save(content);
    }

    public Optional<Content> findById(Long id) {
        return repository.findById(id);
    }

    public List<Content> getAll() {
        List<Content> contents = new ArrayList<>();
        repository.findAll().forEach(contents::add);
        return contents;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
