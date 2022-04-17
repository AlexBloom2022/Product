package Manager;

import ProductRepository.ProductRepository;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
<<<<<<< HEAD
    ProductManager productManager = new ProductManager(repository);
=======
    ProductManager manager = new ProductManager(repository);
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1
    Product book1 = new Book(3, "The fate of man", 300, "Sholohov");
    Product book2 = new Book(1, "Anna Karenina", 110, "Tolstoy");
    Product book3 = new Book(5, "Karamazovs", 220, "Dostoevsky");
    Product book4 = new Book(3, "The fate of man", 300, "Sholohov");
    Product phone1 = new Smartphone(9, "Galaxy", 60000, "Samsung");
    Product phone2 = new Smartphone(42, "Iphone", 10000, "Apple");


    @Test
    void searchByEmptyTitle() {

        Product[] expected = {};
<<<<<<< HEAD
        Product[] actual = productManager.searchBy(null);
=======
        Product[] actual = manager.searchBy(null);
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByNonExistingProduct() {
<<<<<<< HEAD
        productManager.addItem(book4);
        productManager.addItem(book2);

        Product[] expected = {};
        Product[] actual = productManager.searchBy("Yasna");
=======
        manager.addItem(book4);
        manager.addItem(book2);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Yasna");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByTwinProduct() {
<<<<<<< HEAD
        productManager.addItem(phone1);
        productManager.addItem(book1);
        productManager.addItem(book4);


        Product[] expected = {book1, book4};
        Product[] actual = productManager.searchBy("The fate of man");
=======
        manager.addItem(phone1);
        manager.addItem(book1);
        manager.addItem(book4);


        Product[] expected = {book1, book4};
        Product[] actual = manager.searchBy("The fate of man");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }


    @Test
    void searchByTitle() {
<<<<<<< HEAD
        productManager.addItem(phone2);
        productManager.addItem(book3);


        Product[] expected = {book3};
        Product[] actual = productManager.searchBy("Karamazovs");
=======
        manager.addItem(phone2);
        manager.addItem(book3);


        Product[] expected = {book3};
        Product[] actual = manager.searchBy("Karamazovs");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByEmpty() {

        Product[] expected = {};
<<<<<<< HEAD
        Product[] actual = productManager.getAll();
=======
        Product[] actual = manager.getAll();
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByDoubleAddedItem() {
<<<<<<< HEAD
        productManager.addItem(book1);
        productManager.addItem(book1);
        Product[] expected = {book1, book1};
        Product[] actual = productManager.getAll();
=======
        manager.addItem(book1);
        manager.addItem(book1);
        Product[] expected = {book1, book1};
        Product[] actual = manager.getAll();
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByModel() {
<<<<<<< HEAD
        productManager.addItem(phone1);
        productManager.addItem(book2);


        Product[] expected = {phone1};
        Product[] actual = productManager.searchBy("Samsung");
=======
        manager.addItem(phone1);
        manager.addItem(book2);


        Product[] expected = {phone1};
        Product[] actual = manager.searchBy("Samsung");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByName() {
<<<<<<< HEAD
        productManager.addItem(phone2);
        productManager.addItem(phone1);


        Product[] expected = {phone2};
        Product[] actual = productManager.searchBy("Iphone");
=======
        manager.addItem(phone2);
        manager.addItem(phone1);


        Product[] expected = {phone2};
        Product[] actual = manager.searchBy("Iphone");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void searchByAuthor() {
<<<<<<< HEAD
        productManager.addItem(book2);
        productManager.addItem(book3);
        productManager.addItem(phone1);
        Product[] expected = {book3};
        Product[] actual = productManager.searchBy("Dostoevsky");
=======
        manager.addItem(book2);
        manager.addItem(book3);
        manager.addItem(phone1);
        Product[] expected = {book3};
        Product[] actual = manager.searchBy("Dostoevsky");
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAllTest() {
        repository.save(book1);

        Product[] expected = {book1};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    void removeByIdTest() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);
        repository.save(book4);
        repository.removeById(5);

        Product[] expected = {book1, book2, book4};
        Product[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findByIdTest() {
        repository.save(book1);
        repository.save(book2);
        repository.save(phone1);
        repository.save(phone2);

        Product[] expected = {phone1};
        Product[] actual = {repository.findById(9)};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findByIdNullTest() {
        repository.save(book1);
        repository.save(book2);
        repository.save(phone1);
        repository.save(phone2);

        Product[] expected = {null};
        Product[] actual = {repository.findById(54)};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdManagerTest() {
<<<<<<< HEAD
        productManager.addItem(book2);
        productManager.removeById(1);

        Product[] expected = {};
        Product[] actual = productManager.getAll();

        assertArrayEquals(expected, actual);
    }

=======
        manager.addItem(book2);
        manager.removeById(1);

        Product[] expected = {};
        Product[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1
}