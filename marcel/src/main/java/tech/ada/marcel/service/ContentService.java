package tech.ada.marcel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ada.marcel.dto.ContentDTO;
import tech.ada.marcel.model.Content;
import tech.ada.marcel.model.User;
import tech.ada.marcel.repository.ContentRepository;
import tech.ada.marcel.repository.UserRepository;

import java.time.LocalDateTime;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;
    @Autowired
    private UserRepository userRepository;

    public Content save(Content content) {
        return contentRepository.save(content);
    }

}
