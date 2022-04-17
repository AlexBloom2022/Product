package ProductRepository;

<<<<<<< HEAD
import exeptions.NotFoundException;
=======
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1
import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] items = new Product[0];


    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
<<<<<<< HEAD

=======
//        Product[] tmp = new Product[items.length];
//        for (int i = 0; i < items.length; i++) {
//            System.arraycopy(items,0,tmp,0,items.length);
//        }
//        return tmp;
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

<<<<<<< HEAD
//    public void removeById(int id) {
//        int length = items.length - 1;
//        Product[] tmp = new Product[length];
//        int index = 0;
//        for (Product item : items) {
//            if (item.getId() != id) {
//                tmp[index] = item;
//                index++;
//            }
//        }
//        items = tmp;
//    }
public void removeById(int id) throws NotFoundException {

    if (findById(id) == null) {
        throw new NotFoundException("ID " + id + " does not exist");
    }
    int length = items.length - 1;
    Product[] tmp = new Product[length];
    int index = 0;
    for (Product item : items) {
        if (item.getId() != id) {
            tmp[index] = item;
            index++;
        }
    }
    items = tmp;

}
}
=======
    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
>>>>>>> 878b2c0997f7ab9c7e0496fd239580053d33fba1
