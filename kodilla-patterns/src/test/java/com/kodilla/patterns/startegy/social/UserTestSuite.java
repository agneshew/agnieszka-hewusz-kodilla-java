package com.kodilla.patterns.startegy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShare);
        String johnShare = john.sharePost();
        System.out.println("John should: " + johnShare);
        String kodillaShare = kodilla.sharePost();
        System.out.println("Kodilla should: " + kodillaShare);

        //Then
        Assert.assertEquals("Snapchat", stevenShare);
        Assert.assertEquals("Twitter", johnShare);
        Assert.assertEquals("Facebook", kodillaShare);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShare);
        steven.setPublishingStrategy(new FacebookPublisher());
        stevenShare = steven.sharePost();
        System.out.println("Steven now should: " + stevenShare);

        //Then
        Assert.assertEquals("Facebook", stevenShare);
    }
}

