package search;

public class Search{
    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private String authors;

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setsubject(String subject){
        this.subject=subject;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    public void setAuthors(String authors){
        this.authors=authors;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public String getSubject(){
        return this.subject;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public String getLanguage(){
        return this.language;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    public String getAuthors(){
        return this.authors;
    }
}