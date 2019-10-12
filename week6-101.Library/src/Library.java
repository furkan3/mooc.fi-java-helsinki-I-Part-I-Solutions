/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Furkan
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksList;
    public Library(){
        this.booksList=new ArrayList<Book>();
    }
    public  void addBook(Book newBook){
        this.booksList.add(newBook);
    }
    public void printBooks(){
        for(int i=0;i<this.booksList.size();i++){
            System.out.println(this.booksList.get(i));
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found=new ArrayList<Book>();
            for(Book book: booksList){
                if(book.title().contains(title))
                    found.add(book);
                else if(StringUtils.included(book.title(), title)) {
                    found.add(book);    }
            }
            return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found=new ArrayList<Book>();
        for(Book book: booksList){
            if(book.publisher().contains(publisher))
                found.add(book);
            else if(StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
    }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found=new ArrayList<Book>();
        for(Book book: booksList){
            if(book.year()==year)
                found.add(book);
        }   
        return found;
    }

    
}
