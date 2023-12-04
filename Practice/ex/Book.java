package ex;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Object-oriented Design
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

// Inheritance and Polymorphism
class Library extends ArrayList<Book> {
    public void addBook(Book book) {
        this.add(book);
    }

    public void displayBooks() {
        for (Book book : this) {
            System.out.println(book);
        }
    }
}

// Exception
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

// Recursion
class RecursiveSearch {
    public static boolean searchBook(Library library, String keyword, int index) {
        if (index == library.size()) {
            return false;
        }
        if (library.get(index).getTitle().contains(keyword) || library.get(index).getAuthor().contains(keyword)) {
            return true;
        }
        return searchBook(library, keyword, index + 1);
    }
}

// GUI
class LibraryGUI extends JFrame {
    private Library library;

    public LibraryGUI() {
        library = new Library();

        JButton addButton = new JButton("Add Book");
        JButton displayButton = new JButton("Display Books");
        JButton searchButton = new JButton("Search Book");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog("Enter book title:");
                String author = JOptionPane.showInputDialog("Enter author:");
                library.addBook(new Book(title, author));
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                library.displayBooks();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = JOptionPane.showInputDialog("Enter search keyword:");
                try {
                    if (RecursiveSearch.searchBook(library, keyword, 0)) {
                        JOptionPane.showMessageDialog(null, "Book found!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not found.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(displayButton);
        panel.add(searchButton);

        this.add(panel);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

