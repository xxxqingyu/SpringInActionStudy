package springInActionStudy.Chapter04_AOP;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concert.ConcertConfig;
import concert.Performance;
import soundsystem.ICompactDisc;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConcertConfig.class)
public class AppTest 
{
	@Autowired
	private Performance performance;
	
	@Autowired
	private ICompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
	}
   
	@Test
    public void testApp()
    {
    	performance.perform();
        assertTrue( true );
    }
}
