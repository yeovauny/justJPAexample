package com.tyr.service.ls.onetomany.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class BookModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name ="NAME")
    private String bookName;

    @Column(name ="ISBN")
    private String bookISBN;

    @Column(name ="AUTOR")
    private String autor;

    @Column(name ="GENRE")
    private String genero;

    @OneToMany(cascade = {CascadeType.ALL} , orphanRemoval = true)
    @JoinColumn(name="fk_bookid", referencedColumnName = "ID" ,nullable = false)
    private List<CommentsModel> comentarios;

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

    public List<CommentsModel> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<CommentsModel> comentarios) {
        this.comentarios = comentarios;
    }

    public BookModel.BookModelRequestBuilder builder(){
        return new BookModel.BookModelRequestBuilder();
    }


    public static class BookModelRequestBuilder{

        private String bookName;

        private String bookISBN;

        private String autor;

        private String genero;

        private List<CommentsModel> comentarios;

        public BookModelRequestBuilder withName(String bookName){
            this.bookName =bookName;
            return this;
        }

        public BookModelRequestBuilder withISBN(String bookISBN){
            this.bookISBN =bookISBN;
            return this;
        }

        public BookModelRequestBuilder withAuthor(String author){
            this.autor =author;
            return this;
        }

        public BookModelRequestBuilder withgenre(String genero){
            this.genero =genero;
            return this;
        }

        public BookModelRequestBuilder andComents(List<CommentsModel> comentarios){
            this.comentarios=comentarios;
            return this;
        }

        public BookModel build(){
            BookModel bookModel = new BookModel();
            bookModel.setBookName(bookName);
            bookModel.setBookISBN(bookISBN);
            bookModel.setAutor(autor);
            bookModel.setComentarios(comentarios);
            return bookModel;
        }


    }

}
