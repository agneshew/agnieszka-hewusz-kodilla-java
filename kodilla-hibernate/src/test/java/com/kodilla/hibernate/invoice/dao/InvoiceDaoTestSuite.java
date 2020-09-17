package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "testInvoiceNumber";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Apple");
        Product product1 = new Product("Pear");
        Item item = new Item(product, new BigDecimal("6.80"), 2, new BigDecimal (13.60));
        Item item1 = new Item(product1, new BigDecimal("12"), 3, new BigDecimal (36));
        item.setProduct(product);
        item1.setProduct(product1);
        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        item.setProduct(product);
        item1.setProduct(product1);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }


}
