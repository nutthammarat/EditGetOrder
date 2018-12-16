import java.util.*;
import javax.swing.ImageIcon;

public abstract class ProductService {

    public static ArrayList<Product> showAllProduct() {
        return ProductDao.getAllProducts();
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }
    
    public static boolean addProduct(Product product){
        return ProductDao.addProduct(product);
    }
    public static void getInfo(){
         ArrayList<Product> product = ProductService.showAllProduct();
        int i = 0;
        for (Product e : product) {
            Product product1 = ProductService.getProduct(e.getId());
            if (i == 0) {
                MainPage.lbl_Name1.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S01);
                MainPage.lbl_Pic1.setIcon(icon);
            } else if (i == 1) {
                MainPage.lbl_Name2.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S02);
                MainPage.lbl_Pic2.setIcon(icon);
            } else if (i == 2) {
                MainPage.lbl_Name3.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S03);
                MainPage.lbl_Pic3.setIcon(icon);
            } else if (i == 3) {
                MainPage.lbl_Name4.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S04);
                MainPage.lbl_Pic4.setIcon(icon);
            } else if (i == 4) {
                MainPage.lbl_Name5.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S05);
                MainPage.lbl_Pic5.setIcon(icon);
            } else if (i == 5) {
                MainPage.lbl_Name6.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S06);
                MainPage.lbl_Pic6.setIcon(icon);
                break;
            }
            //MainPage.x1.setText(""+product1.getImage());
            i++;
        }
    }
}