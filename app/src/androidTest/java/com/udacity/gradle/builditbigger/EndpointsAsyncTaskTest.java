package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Srinu Mallidi.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    private final String LOG_TAG = EndpointsAsyncTaskTest.class.getSimpleName();
 String joke;
private CountDownLatch latch;
    @Before
    public void setUpTest(){
        latch = new CountDownLatch(1);
        EndPointAsyncTask endpointsAsyncTask = new EndPointAsyncTask(){

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                latch.countDown();
            }
        };

        endpointsAsyncTask.execute();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        joke = endpointsAsyncTask.getJoke();
    }


    @Test
    public void testShouldPassTheseAsserts(){
        setUpTest();
        assert(joke != null);

        assertNotNull(joke);
    }

/*
    Uncomment the following code in order to purposely fail the tests to ensure that code is working
// */
//    @Test
//    public void testShouldFailTheseAsserts(){
//        setUpTest();
//        assert(joke == null);
//
//        assertEquals(joke, "This test failing is not funny!");
//    }


    @Test
    public void testTest(){
        assertEquals("Test Passed", "Test Passed");
    }

}