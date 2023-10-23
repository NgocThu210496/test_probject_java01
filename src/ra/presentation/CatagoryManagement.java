package ra.presentation;

import ra.bussiness.config.Color;
import ra.bussiness.config.UserChoice;
import ra.bussiness.entity.Book;
import ra.bussiness.entity.Category;
import ra.bussiness.impl.CatalogImp;

import java.util.List;
import java.util.Scanner;

public class CatagoryManagement {
    public static void showCategoriesMenu(List<Category> categoryList, List<Book> bookList) {
        Scanner scanner = new Scanner(System.in);
        boolean exitMenuCatagory = true;
        do {
//            for (Category ct : categoryList) {
//                ct.output();
//            }
            CatalogImp.displayCatalog(categoryList);
            System.out.println(".=============================================================.");
            System.out.println(Color.TEXT_BLUE +"|                       QUẢN LÝ THỂ LOẠI                       |"+Color.TEXT_RESET);
            System.out.println("|==============================================================|");
            System.out.println("|        1. Thêm mới thể loại                                  |");
            System.out.println("|        2. Hiển thị danh sách theo tên A–Z                    |");
            System.out.println("|        3. Thống kê thể loại và số sách có trong mỗi thể loại |");
            System.out.println("|        4. Cập nhật thể loại                                  |");
            System.out.println("|        5. Xóa thể loại                                       |");
            System.out.println("|        6. Quay lại                                           |");
            System.out.println("|==============================================================|");

            int choice;
                choice = UserChoice.getUserChoice(scanner);

                switch (choice) {
                    case 1:
                        System.out.println("1. Thêm mới thể loại");
                        CatalogImp.createCatalog(scanner, categoryList, bookList);
                        break;
                    case 2:
                        System.out.println("2. Hiển thị danh sách theo tên A–Z");
                        CatalogImp.sortCatalogName(categoryList);
                        break;
                    case 3:
                        System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
                        CatalogImp.statsCatalog(categoryList, bookList);
                        break;
                    case 4:
                        System.out.println("4. Cập nhật thể loại");
                        CatalogImp.updateCatalog(scanner, categoryList, bookList);
                        break;
                    case 5:
                        System.out.println("5. Xóa thể loại");
                        CatalogImp.deleteCatalog(scanner, categoryList, bookList);
                        break;
                    case 6:
                        exitMenuCatagory = false;
                        break;
                    default:
                        break;
                }

        } while (exitMenuCatagory);
    }
}
