package com.shiva.sb.controller;

import com.shiva.sb.Service.ContentService;
import com.shiva.sb.model.Content;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Tag(name = "Digital Library")
public class ContentDirectory {

    @Autowired
    ContentService contentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings! Welcome to Digital Library";
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Optional<Content> getById(Long id) {
        return contentService.findById(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Content> getAll() {
        return contentService.getAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Content content) {
        contentService.add(content);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Long id) {
        contentService.delete(id);
    }

}
