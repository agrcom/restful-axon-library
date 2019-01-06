package com.daniel.dabrowski.restfulaxonlibrary;

import com.daniel.dabrowski.restfulaxonlibrary.model.Book;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookDTO;
import com.daniel.dabrowski.restfulaxonlibrary.model.BookMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

/*
    https://www.baeldung.com/spring-boot-embedded-mongodb
    https://www.baeldung.com/spring-data-mongodb-reactive
*/

//@DataMongoTest
//@ExtendWith(SpringExtension.class)
//@RunWith(SpringRunner.class)
public class MongoDBSpringIntegrationTest {
   /* @Autowired
    private MongoTemplate mongoTemplate;
*/
//    @DisplayName("given object to save"
//            + " when save object using MongoDB template"
//            + " then object is saved")
/*    @Test
    public void dbModelShouldNotBeCreatedDueToErrors(){

        BookDTO dto = new BookDTO("1", "E", "E", "1234-5678-9012");

        Book dbModel = BookMapper.INSTANCE.dtoToDbModel(dto);
        assert dbModel != null;

        mongoTemplate.save(dbModel);

        Assert.assertNotNull(mongoTemplate.findAll(Book.class));
    }*/

    /*@Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
    OR

  @Test
  public void doStuffThrowsIndexOutOfBoundsException() {
    Foo foo = new Foo();

    exception.expect(IndexOutOfBoundsException.class);
    foo.doStuff();
  }
  */

}
