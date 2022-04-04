package ArticleProblem;

public class Article {

    private String title;
    private  String content;
    private String author;

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        String result = String.format("%s - %s: %s", this.title, this.content, this.author);
        return result;
    }
}