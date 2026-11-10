package Jobsheet10.Interface;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override 
    public String getPrintableContent() {
        String temp = "URL: " + url;
        temp += "\nTitle: " + title;

        temp = content.replaceAll("<[^>]*>", ""); // Remove HTML tags
        return temp;
    }
}
