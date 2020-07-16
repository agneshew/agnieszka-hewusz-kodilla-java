package com.kodilla.testing.library;

import jdk.nashorn.api.tree.LoopTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    private List<Book> generateListNBooksInHands(int handbooksQuantity) {
        List<Book> resultHandList = new ArrayList<Book>();
        for (int n = 1; n <= handbooksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultHandList.add(theBook);
        }
        return resultHandList;
    }
    @Test
    public void testListBooksInHandsOfCondition() {
        //Given
        BookLibrary bookLibraryMock = mock(BookLibrary.class);
        LibraryUser libraryUser0 = new LibraryUser("John", "Smith", "2345");
        LibraryUser libraryUser1 = new LibraryUser("John", "Smith", "2345");
        LibraryUser libraryUser5 = new LibraryUser("John", "Smith", "2345");
        bookLibraryMock.listBooksInHandsOf(libraryUser0);
        bookLibraryMock.listBooksInHandsOf(libraryUser1);
        bookLibraryMock.listBooksInHandsOf(libraryUser5);

        List<Book> bookInHands0List = new ArrayList<Book>();
        List<Book> bookInHands1List = generateListNBooksInHands(1);
        List<Book> bookInHands5List = generateListNBooksInHands(5);

        when(bookLibraryMock.listBooksInHandsOf(libraryUser0)).thenReturn(bookInHands0List);
        when(bookLibraryMock.listBooksInHandsOf(libraryUser1)).thenReturn(bookInHands1List);
        when(bookLibraryMock.listBooksInHandsOf(libraryUser5)).thenReturn(bookInHands5List);
        //When
        List<Book> theListOfBookInHands0 = bookLibraryMock.listBooksInHandsOf(libraryUser0);
        List<Book> theListOfBookInHands1 = bookLibraryMock.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfBookInHands5 = bookLibraryMock.listBooksInHandsOf(libraryUser5);
        //Then
        assertEquals(0, theListOfBookInHands0.size());
        assertEquals(1, theListOfBookInHands1.size());
        assertEquals(5, theListOfBookInHands5.size());
    }
}