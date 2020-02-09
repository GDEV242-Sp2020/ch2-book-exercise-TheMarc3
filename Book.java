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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
    
    // Add the methods here ...
}
