package library;

import java.util.ArrayList;

import org.junit.Test;

public class libraryTest {
	Member member1 = new Member();
	Member member2 = new Member();
	Member member3 = new Member();
	Book book1 = new Book();
	Book book2 = new Book();
	Book book3 = new Book();
	Book book4 = new Book();
	Book book5 =new Book();
	Book book6 = new Book();
	Member loanmember = member1;
	Book loanbook = book1;
	ArrayList<Loan> Loans = new ArrayList<Loan>();

	public libraryTest() {
		
		member1.setId("01");
		member1.setName("张三");
		member2.setId("02");
		member2.setName("李四");
		member3.setId("03");
		member3.setName("老王");		
		
		book1.setId("0001");
		book1.setISBN("iSBN-0001-1");
		book2.setId("0001");
		book2.setISBN("iSBN-0001-2");
		book3.setId("0002");
		book3.setISBN("iSBN-0002-1");
		book4.setId("0002");
		book4.setISBN("iSBN-0002-2");
		book5.setId("0003");
		book5.setISBN("iSBN-0003-1");
		book6.setId("0003");
		book6.setISBN("iSBN-0003-2");
		
		Loan loan1 = new Loan();
		loan1.setMember(loanmember);
		loan1.setBook(book3);
		Loans.add(loan1);				
		loanmember.setLoans(Loans);
	}

	@Test
	
	public void Loan() {
		 Loan loan=loanmember.Loan(loanbook);
		 if(!(loan==null)){
		 System.out.println("借书记录：--------------"+'\r'+"借书时间: " +
		 loan.getLoanDate()+
		 " 到期时间: " + loan.getDateForReuturn()+
		 " 借书人: " + loan.getMember().getName()+
		 " 书籍ID: " + loan.getBook().getId()+'\r'
		 +'\n'+"--------------------");
		 }
		 else{
		 System.out.println("借书不成功！");
		 }
		 //loanmember.Return(loanbook); 
	}
}
