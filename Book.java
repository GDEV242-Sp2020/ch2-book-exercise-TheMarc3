/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Marc Weizte)
 * @version (February 3, 2020)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    /**
     * returns the book's author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * returns the book's title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * returns the book's page count
     */
    public int getPages()
    {
        return pages;
    }
    
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * prints the book's author
     */
    public void printAuthor()
    {
        System.out.println(getAuthor());
    }
    
    /**
     * prints the book's title
     */
    public void printTitle()
    {
        System.out.println(getTitle());
    }
    
    /**
     * prints the book's page count
     */
    public void printPages()
    {
        System.out.println(getPages());
    }
    
    
    public void printDetails()
    {
        System.out.println("The book " + getTitle() +
        " written by " + getAuthor() + " has " + getPages()
        + " pages.");
    }
    
    // Add the methods here ...
}
