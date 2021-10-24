package com.tyr.service.ls.onetomany.domain.dto;

public class CommentsDTO {

    private String autor;

    private String descripcion;

    private String comentario;

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
    public  CommentsDTO.CommentsDTORequestBuilder builder(){
        return new CommentsDTO.CommentsDTORequestBuilder();
    }

    public static class CommentsDTORequestBuilder{

        private String autor;

        private String descripcion;

        private String comentario;

        public CommentsDTORequestBuilder withAutor(String autor){
            this.autor = autor;
            return this;
        }

        public CommentsDTORequestBuilder withDescription(String descripcion){
            this.descripcion = descripcion;
            return this;
        }

        public CommentsDTORequestBuilder andComentario(String comentario){
            this.comentario = comentario;
            return this;
        }

        public CommentsDTO build(){
            CommentsDTO commentsDTO = new CommentsDTO();
            commentsDTO.setAutor(autor);
            commentsDTO.setComentario(comentario);
            commentsDTO.setDescripcion(descripcion);
            return commentsDTO;
        }

    }


}
