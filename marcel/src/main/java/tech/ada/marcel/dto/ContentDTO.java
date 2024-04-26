package tech.ada.marcel.dto;

import tech.ada.marcel.model.Content;
import tech.ada.marcel.model.User;

import java.time.LocalDateTime;

public record ContentDTO (String description, String url, Long userId) {

}
