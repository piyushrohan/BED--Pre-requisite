package avitepa.corejava.ratings;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import avitepa.corejava.ratings.service.AssignmentService;
import avitepa.corejava.ratings.service.DistributionService;
import avitepa.corejava.ratings.service.RatingsService;
import avitepa.corejava.ratings.service.domain.Assignment;

/**
 * 
 * @author Piyush R
 *
 */
public class App {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {

		RatingsService ratingsService = RatingsService.getIntance();

		LOGGER.info("***********************Rating by Student******************************");
		ratingsService.computeRatingByStudent("Ananth");
//		LOGGER.info("***********************Rating by Student******************************");
//		ratingsService.computeRatingBySubject("Computing Techniques");

		LOGGER.info("***********************Rating by Subject******************************");
		ratingsService.computeRatingBySubject("Electro Fields");
		
		AssignmentService assignmentService=AssignmentService.getInstance();
		
		
		Assignment ananthElectroTest1Category = new Assignment();
		ananthElectroTest1Category.setAssignmentCategory("test_3");
		ananthElectroTest1Category.setStudentName("Ananth");
		ananthElectroTest1Category.setSubject("Electro Fields");
		ananthElectroTest1Category.setSerialNumber(1);
		ananthElectroTest1Category.setDataOfSubmission(new Date());
		ananthElectroTest1Category.setPoints(100);
		
		assignmentService.save(ananthElectroTest1Category);
		
		LOGGER.info("***********************Rating by Student******************************");
		ratingsService.computeRatingByStudent("Ananth");
		
		DistributionService distributionService=DistributionService.getInstance();
		distributionService.removeAssignmentCategory("test");
		distributionService.addAssignmentCategory("test", 10);

	}
}
