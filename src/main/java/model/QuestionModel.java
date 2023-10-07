package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "question")
public class QuestionModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @Column(name = "id_quiz")
    private Long quizId;

    private String content;
    private String topic;

    @OneToMany
    @JoinColumn(name="id_question", insertable=false, updatable=false)
    private List<ResponseModel> responses;
}
