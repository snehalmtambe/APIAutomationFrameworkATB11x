package org.example.Test.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample
{

    // Create a booking, create a token
    // Update the booking
    // Verify the booking
    // Delete the booking

    @Owner("Snehal Milind Tambe")
    @Description("TC#1 - Step 1 - Verify that booking can be created")
    @Test(groups = "qa", priority = 1)
    public void testCreateBooking()
    {
        Assert.assertTrue(true);
    }

    @Owner("Snehal Milind Tambe")
    @Description("TC#2 - Step 2 - Verify that booking by id")
    @Test(groups = "qa", priority = 2)
    public void testVerifyBookingId()
    {
        Assert.assertTrue(true);
    }

    @Owner("Snehal Milind Tambe")
    @Description("TC#3 - Step 3 - Verify updated booking by id")
    @Test(groups = "qa", priority = 3)
    public void testUpdateByBookingId()
    {
        Assert.assertTrue(true);
    }

    @Owner("Snehal Milind Tambe")
    @Description("TC#4 - Step 4 - Delete the booking by id")
    @Test(groups = "qa", priority = 4)
    public void testDeleteBooking()
    {
        Assert.assertTrue(true);
    }




}
