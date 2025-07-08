package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 20:26
 *
 * @Author: 憨八嘎
 */
public class BookManager {
    // final修饰表示引用不能修改，但是可以修改内容
    private final ArrayList bookList;

    public BookManager() {
        bookList = new ArrayList();
    }

    public boolean addBook(Book book) {
        if(book == null)
            return false;

        return bookList.add(book);
    }

    // 显示所有书籍
    public void showBooks() {
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println((Book) bookList.getElement(i));
        }
    }

    // 删除书籍
    public boolean deleteBookByName(String name) {
        if(name == null)
            return false;

        Book book = this.queryBookByName(name);
        if(book == null)
            return false;

        return bookList.remove(book);
    }

    // 修改书籍
    public boolean updateBookByName(String name, Book newBook) {
        if(name == null)
            return false;

        Book book = this.queryBookByName(name);
        if(book == null)
            return false;

        return bookList.update(book, newBook);
    }

    // 查询书籍
    // 通过名称查询书籍
    public Book queryBookByName(String name) {
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = (Book) bookList.getElement(i);
            if(book.getName().equals(name))
                return book;
        }

        return null;
    }
}
