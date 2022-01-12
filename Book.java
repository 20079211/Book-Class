public class Book
  
{
  //Fields/instance data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
  
  //Constructor
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
  }
  public Book() {
    this("unknown", "unknown", 2022, 100, false);
  }
  // accessor methods
  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public int getYear() {
    return year;
  }
  public int getNumPages() {
    return numPages;
  }
  public boolean getHardCover() {
    return hardCover;
  }
  // mutator methods - setter methods
  public void setTitle(String s) {
    title=s;
  }
  public void setAuthor(String a) {
    author=a;
  }
  public void setYear(int y) {
    year=y;
  }
  public void setNumPages(int p) {
    numPages=p;
  }
  public void setHardCover(boolean h) {
    hardCover=h;
  }
  //equals method
  public boolean equals(Book otherBook) {
    if(this.getTitle().equals(otherBook.getTitle())) {
      return true;
    }
    else {
      return false;
    }
  }
  //tostring method
  public String toString() {
    String str = "";
    str+="Title: " + title + "\nAuthor: " + author + "\nYear Published: " + year;
    str=str+"\nNumber of Pages: " + numPages + "\nHardcover? " + hardCover;
    return str;
  }
}