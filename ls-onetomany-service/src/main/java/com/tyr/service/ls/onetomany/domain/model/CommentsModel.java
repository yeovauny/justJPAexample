package com.tyr.service.ls.onetomany.domain.model;


import javax.persistence.*;

@Entity
@Table(name = "COMMENTS")
public class CommentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="author")
    private String autor;

    @Column(name ="description")
    private String descripcion;

    @Column(name ="coments")
    private String comentario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public CommentsModel.CommentsModelRequestBuilder builder(){
        return new CommentsModel.CommentsModelRequestBuilder();
    }

    public static class CommentsModelRequestBuilder{


        private String autor;

        private String descripcion;

        private String comentario;

        public CommentsModelRequestBuilder withAuthor(String autor){
            this.autor = autor;
            return this;
        }

        public CommentsModelRequestBuilder withDescripcion(String descripcion){
            this.descripcion = descripcion;
            return this;
        }
        public CommentsModelRequestBuilder withComentario(String comentario){
            this.comentario = comentario;
            return this;
        }

        public CommentsModel build(){
            CommentsModel commentsModel = new CommentsModel();
            commentsModel.setAutor(autor);
            commentsModel.setComentario(comentario);
            commentsModel.setDescripcion(descripcion);
            return commentsModel;
        }

    }

}
