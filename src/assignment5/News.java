package assignment5;

public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    int[] RateList = new int[3];

    public News(String title, String publishDate, String author, String content, int[] rateList) {
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        RateList = rateList;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public float Calaculate(){
        int tong = 0;
        for(int i = 0; i < RateList.length; i++){
            tong += RateList[i];
        }
        AverageRate = tong / RateList.length;
        return AverageRate;
    }
    @Override
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("PublishDate: " + getPublishDate());
        System.out.println("Content: " + getContent());
        System.out.println("AverageRate: " + getAverageRate());
    }
}
