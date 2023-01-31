package ch21;

public class BooTest {

	public static void main(String[] args) {
		
			Book[] library = new Book[5];
			Book[] copyLibrary = new Book[5]; 
			/*
			for(int i = 0; i<library.length; i++) {
				System.out.println(library[i]); 
			}  
			 */
			
			library[0] = new Book("태백산맥1", "조정래");
			library[1] = new Book("태백산맥2", "조정래");
			library[2] = new Book("태백산맥3", "조정래");
			library[3] = new Book("태백산맥4", "조정래");
			library[4] = new Book("태백산맥5", "조정래");
			
			System.arraycopy(library, 0, copyLibrary, 0, 5);
				
			// 배열 얕은복사  카피 
			
			for(Book book : library) {
				System.out.println(book);
				book.showInfo();
			}
			
			for(Book book : copyLibrary) {
				System.out.println(book);
				book.showInfo();
			}
			
			library[0].setAuthor("박완서");
			library[0].setTitle("나목");
			System.out.println("얕은복사");
			System.out.println("==============================================");
			System.out.println("library");
			for(Book book : library) {
				System.out.println(book);
				book.showInfo();
			}
			System.out.println("==============================================");
			System.out.println("copyLibrary");
			for(Book book : copyLibrary) {
				System.out.println(book);
				book.showInfo();
			}
			
			
			// 깊은 복사
			
			Book[] copyLibrary1 = new Book[5];
			copyLibrary1[0] = new Book();
			copyLibrary1[1] = new Book();
			copyLibrary1[2] = new Book();
			copyLibrary1[3] = new Book();
			copyLibrary1[4] = new Book();
			
			for(int i = 0; i < library.length; i++ ) {
				copyLibrary1[i].setAuthor(library[i].getAuthor());
				copyLibrary1[i].setTitle(library[i].getTitle());
			}
			
			System.out.println("깊은복사");
			System.out.println("==============================================");
			System.out.println("library");
			for(Book book : library) {
				System.out.println(book);
				book.showInfo();
			}
			System.out.println("==============================================");
			System.out.println("copyLibrary");
			for(Book book : copyLibrary1) {
				System.out.println(book);
				book.showInfo();
			}
			
			
			
		
		
		}

}
