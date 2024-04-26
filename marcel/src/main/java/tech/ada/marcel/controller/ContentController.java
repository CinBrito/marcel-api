package tech.ada.marcel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.marcel.dto.ContentDTO;
import tech.ada.marcel.model.Content;
import tech.ada.marcel.model.User;
import tech.ada.marcel.service.ContentService;
import tech.ada.marcel.service.UserService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @Autowired
    private UserService userService;

    @PostMapping
    public Content save(@RequestBody ContentDTO contentDTO) {
        User user = userService.findById(contentDTO.userId());
        Content content = new Content(contentDTO.description(), contentDTO.url(), user);
        return contentService.save(content);
    }

}
