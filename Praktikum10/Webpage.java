package Praktikum10;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;
    
    @Override
    public String getPrintableContect() {
        String temp = "URL: "+url;
        temp += "Title: "+title;

        temp = content.replaceAll("<[^>]*>", "");
        return temp;
    }    
}
