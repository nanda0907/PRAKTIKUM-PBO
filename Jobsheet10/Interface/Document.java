package Jobsheet10.Interface;

public class Document implements Printable {
    public String content;
    public String fileName;

    @Override
    public String getPrintableContent() {
        return content;
    }
    
}
