package com.mysite.sbb.question;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findBySubject(String subject);

    List<Question> findBySubjectAndContent(String subject, String content);
}
