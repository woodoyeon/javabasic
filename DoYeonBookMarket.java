package NoOOp;

import java.util.ArrayList;
import java.util.Scanner;

public class DoYeonBookMarket {

    static final int Num_MENU = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Book> cart = new ArrayList<>();
        boolean isRunning = true;

        // 초기 책 목록
        bookList.add(new Book("ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", 20000));
        bookList.add(new Book("ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", 30000));
        bookList.add(new Book("ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", 25000));

        System.out.println("*****************************************");
        System.out.println("* Welcome to DoYeon Book Market *");
        System.out.println("*****************************************");

        while (isRunning) {
            // 메뉴 출력
            System.out.println("\n메인 메뉴");
            System.out.println("=========================================");
            System.out.println("1. 도서 목록 보기");
            System.out.println("2. 장바구니 보기");
            System.out.println("3. 장바구니에 도서 추가");
            System.out.println("4. 장바구니 비우기");
            System.out.println("0. 종료");
            System.out.println("=========================================");
            System.out.print(">> 메뉴 선택 : ");

            // 사용자 입력 받기
            int choice = scanner.nextInt();

            // 선택에 따른 동작 수행
            switch (choice) {
                case 1:
                    printBookList(bookList);
                    break;
                case 2:
                    printCart(cart);
                    break;
                case 3:
                    addToCart(bookList, cart, scanner);
                    break;
                case 4:
                    clearCart(cart);
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 0번부터 4번까지의 메뉴 중에서 선택하세요.");
            }
        }

        System.out.println("\n프로젝트 : 온라인 서점 (No OOP, Console) 4");
        System.out.println(">> DoYeon Book Market을 종료합니다.");
        scanner.close();
    }

    // 도서 목록 출력
    static void printBookList(ArrayList<Book> bookList) {
        System.out.println("\n>> 도서 목록");
        System.out.println("------------------------------------------------------------------------");
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("------------------------------------------------------------------------");
    }

    // 장바구니 목록 출력
    static void printCart(ArrayList<Book> cart) {
        System.out.println("\n>> 장바구니 보기");
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            System.out.println("------------------------------------------------------------------------");
            for (Book book : cart) {
                System.out.println(book);
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }

    // 장바구니에 도서 추가
    static void addToCart(ArrayList<Book> bookList, ArrayList<Book> cart, Scanner scanner) {
        System.out.println("\n>> 도서 목록");
        printBookList(bookList);
        System.out.print(">> 추가할 도서 ID 입력 : ");
        String bookId = scanner.next();
        boolean found = false;
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                cart.add(book);
                System.out.println(">> 장바구니 추가 : " + book.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(">> 없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
        }
    }

    // 장바구니 비우기
    static void clearCart(ArrayList<Book> cart) {
        cart.clear();
        System.out.println("\n>> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
    }
}

class Book {
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book(String id, String title, String author, String publisher, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ", " + title + ", " + author + ", " + publisher + ", " + price + "원";
    }
}


