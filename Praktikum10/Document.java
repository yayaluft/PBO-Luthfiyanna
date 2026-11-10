package Praktikum10;

public class Document implements Printable {
    public String fileName;
    public String content;

    @Override
    public String getPrintableContect() {
        return content;
    }
}
