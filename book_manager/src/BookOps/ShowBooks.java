package BookOps;

import Book.Book;
import Book.BookManager;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 18483
 * Date: 2025/07/08
 * Time: 21:40
 *
 * @Author: 憨八嘎
 */
public class ShowBooks implements BookOperation{
    @Override
    public void operation(BookManager bookManager) {
        bookManager.showBooks();
    }
}
