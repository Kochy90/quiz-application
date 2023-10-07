package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "response")
public class ResponseModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @Column(name = "id_question")
    private Long quizId;

    private String content;
    private boolean isCorrect;

}
