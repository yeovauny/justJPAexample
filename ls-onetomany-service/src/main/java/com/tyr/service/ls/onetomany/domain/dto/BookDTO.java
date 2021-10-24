package com.tyr.service.ls.onetomany.domain.dto;

import java.util.List;

public class BookDTO {

    private String bookName;

    private String bookISBN;

    private String autor;

    private String genero;

    private List<CommentsDTO> comentarios;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<CommentsDTO> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<CommentsDTO> comentarios) {
        this.comentarios = comentarios;
    }

    public BookDTO.BookDTORequestBuilder builder(){
        return new BookDTO.BookDTORequestBuilder();
    }

    public  static class BookDTORequestBuilder{
        private String bookName;

        private String bookISBN;

        private String autor;

        private String genero;

        private List<CommentsDTO> comentarios;

        public BookDTORequestBuilder withBookName(String bookName){
            this.bookName = bookName;
            return this;
        }

        public BookDTORequestBuilder withBookISBN(String bookISBN){
            this.bookISBN = bookISBN;
            return this;
        }

        public BookDTORequestBuilder withAutor(String autor){
            this.autor = autor;
            return this;
        }

        public BookDTORequestBuilder withGenero(String genero){
            this.genero =genero;
            return this;
        }

        public BookDTORequestBuilder andComments(List<CommentsDTO> comentarios){
            this.comentarios =comentarios;
            return this;
        }

        public BookDTO build(){
            BookDTO bookDTO = new BookDTO();
            bookDTO.setBookISBN(bookISBN);
            bookDTO.setBookName(bookName);
            bookDTO.setAutor(autor);
            bookDTO.setGenero(genero);
            bookDTO.setComentarios(comentarios);
            return bookDTO;
        }



    }



}
