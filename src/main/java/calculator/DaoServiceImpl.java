package calculator;

public class DaoServiceImpl {
    private UserDao userDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDao productDao;

    public DaoServiceImpl() {
    }

    public DaoServiceImpl(UserDao userDao, ProductDao productDao) {
        this.userDao = userDao;
        this.productDao = productDao;
    }

    @Override
    public String toString() {
        return "DaoServiceImpl{" +
                "userDao=" + userDao +
                ", productDao=" + productDao +
                '}';
    }
}
