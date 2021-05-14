package com.cg.lab2.ui;

import java.util.Scanner;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.lab2.entity.Author;
import com.cg.lab2.entity.Book;
import com.cg.lab2.util.JPAUtil;

public class FunctionExecutor {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
			App[] menus = App.values();
			App selectedMenu = null;

			while (selectedMenu != App.Quit) {
				System.out.println("University Staff Member Operation");
				for (App menu : menus) {
					System.out.println(menu.ordinal() + "\t" + menu);
				}
				System.out.print("Enter choice : ");
				int ch = scan.nextInt();

				if (ch >= 0 && ch <= menus.length) {
					selectedMenu = menus[ch];

					switch (selectedMenu) {
					case FindAll:
						doFindAllBooks();
						break;
					case FindAll_By_AuthorId:
						doFindByAuthorId();
						break;
					case FindAll_In_Range:
						doFindInRange();
						break;
					case Show_Author_By_BookId:
						doShowById();
						break;
					default:
						break;
					}
				} else {
					selectedMenu = null;
				}

			}
			scan.close();
			System.out.println("Application Terminated");

		}

		/**
		 * fetching author details for given course Id
		 */
		private static void doShowById() {
			EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
			EntityManager em = factory.createEntityManager();

			System.out.println("Enter Book Id");
			Long bookId = scan.nextLong();
			Book book = em.find(Book.class, bookId);
			if (book == null) {
				System.out.println("No book present with this id");
			} else {
				Author author = book.getAuthor();
				System.out.println(author);
			}
		}

		/**
		 * listing all books in an inclusive price range
		 */
		private static void doFindInRange() {
			EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
			EntityManager em = factory.createEntityManager();

			System.out.println("Enter Min Price");
			Long minPrice = scan.nextLong();
			System.out.println("Enter Max Price");
			Long maxPrice = scan.nextLong();

			Query q = em.createQuery("select e from Book e where price between :a and :b");
			q.setParameter("a", minPrice);
			q.setParameter("b", maxPrice);

			List<Book> id = q.getResultList();
			if (id != null)
				id.forEach(System.out::println);
			else
				System.out.print("No books in this range");
		}

		/**
		 * all books written by a given author name
		 */
		private static void doFindByAuthorId() {
			EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
			EntityManager em = factory.createEntityManager();

			System.out.println("Enter Author Id");
			Long authorId = scan.nextLong();
			Author author = em.find(Author.class, authorId);
			if (author == null) {
				System.out.println("No books written by the author");
			} else {
				List<Book> books = author.getBook();
				if (books.isEmpty()) {
					System.out.println("No books written by the author");
				} else {
					for (Book book : books) {
						System.out.println(book);
					}

				}
			}
		}

		/**
		 * listing all the books in database
		 */
		private static void doFindAllBooks() {
			EntityManagerFactory factory = JPAUtil.getEntityManagerFactory();
			EntityManager em = factory.createEntityManager();

			String jpql = "SELECT e FROM Book e";
			TypedQuery<Book> tqry = em.createQuery(jpql, Book.class);
			List<Book> ls = tqry.getResultList();
			ls.forEach(System.out::println);

		}

}