package tech.ada.marcel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.marcel.model.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
