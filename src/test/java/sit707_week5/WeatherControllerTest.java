package sit707_week5;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class WeatherControllerTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "S223676061";
        Assert.assertNotNull("Student ID is ", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "DHRUV";
        Assert.assertNotNull("Student name is ", studentName);
    }

//    @Test
//    public void testTemperatureMin() {
//        System.out.println("+++ testTemperatureMin +++");
//
//        // Initialise controller
//        WeatherController wController = WeatherController.getInstance();
//
//        // Retrieve all the hours temperatures recorded as for today
//        int nHours = wController.getTotalHours();
//        double minTemperature = 1000;
//        for (int i=0; i<nHours; i++) {
//            // Hour range: 1 to nHours
//            double temperatureVal = wController.getTemperatureForHour(i+1);
//            if (minTemperature > temperatureVal) {
//                minTemperature = temperatureVal;
//            }
//        }
//
//        // Should be equal to the min value that is cached in the controller.
//        Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);
//
//        // Shutdown controller
//        wController.close();
//    }
//
//    @Test
//    public void testTemperatureMax() {
//        System.out.println("+++ testTemperatureMax +++");
//
//        // Initialise controller
//        WeatherController wController = WeatherController.getInstance();
//
//        // Retrieve all the hours temperatures recorded as for today
//        int nHours = wController.getTotalHours();
//        double maxTemperature = -1;
//        for (int i=0; i<nHours; i++) {
//            // Hour range: 1 to nHours
//            double temperatureVal = wController.getTemperatureForHour(i+1);
//            if (maxTemperature < temperatureVal) {
//                maxTemperature = temperatureVal;
//            }
//        }
//
//        // Should be equal to the min value that is cached in the controller.
//        Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);
//
//        // Shutdown controller
//        wController.close();
//    }
//
//    @Test
//    public void testTemperatureAverage() {
//        System.out.println("+++ testTemperatureAverage +++");
//
//        // Initialise controller
//        WeatherController wController = WeatherController.getInstance();
//
//        // Retrieve all the hours temperatures recorded as for today
//        int nHours = wController.getTotalHours();
//        double sumTemp = 0;
//        for (int i=0; i<nHours; i++) {
//            // Hour range: 1 to nHours
//            double temperatureVal = wController.getTemperatureForHour(i+1);
//            sumTemp += temperatureVal;
//        }
//        double averageTemp = sumTemp / nHours;
//
//        // Should be equal to the min value that is cached in the controller.
//        Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);
//
//        // Shutdown controller
//        wController.close();
//    }

    @Test
    public void testTemperaturePersist() {
        System.out.println("+++ testTemperaturePersist +++");

        // Initialise controller
        WeatherController wController = WeatherController.getInstance();

        // Generate a timestamp for the current time
        String currentTime = new SimpleDateFormat("H:m:s").format(new Date());

        // Uncomment the code below ONLY for 5.3C task.
        String persistTime = wController.persistTemperature(10, 19.5, currentTime);

        System.out.println("Persist time: " + persistTime + ", now: " + currentTime);

        // Assert that the persisted timestamp matches the provided timestamp
        Assert.assertEquals(currentTime, persistTime);

        wController.close();
    }
}
