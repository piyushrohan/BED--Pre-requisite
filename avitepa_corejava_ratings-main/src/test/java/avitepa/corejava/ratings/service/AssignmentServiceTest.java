/**
 * 
 */
package avitepa.corejava.ratings.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import avitepa.corejava.ratings.service.domain.Assignment;

/**
 * @author Piyush R
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class AssignmentServiceTest {

	@Test
	public void testGetAssignments() {
		assertNotNull(AssignmentService.getInstance().getAssignments());
	}

	@Test
	public void testSaveAssignments() {
		Assignment ananthElectroTest1Category = new Assignment();
		ananthElectroTest1Category.setAssignmentCategory("test_3");
		ananthElectroTest1Category.setStudentName("Ananth");
		ananthElectroTest1Category.setSubject("Electro Fields");
		ananthElectroTest1Category.setSerialNumber(1);
		ananthElectroTest1Category.setDataOfSubmission(new Date());
		ananthElectroTest1Category.setPoints(100);

		AssignmentService instance = AssignmentService.getInstance();
		String response = instance.save(ananthElectroTest1Category);

		assertTrue(response.contains("Successfully enrolled student"));

	}
	
	@Test
	public void testSaveAssignments_Update() {
		Assignment ananthElectroTest1Category = new Assignment();
		ananthElectroTest1Category.setAssignmentCategory("test_1");
		ananthElectroTest1Category.setStudentName("Ananth");
		ananthElectroTest1Category.setSubject("Electro Fields");
		ananthElectroTest1Category.setSerialNumber(1);
		ananthElectroTest1Category.setDataOfSubmission(new Date());
		ananthElectroTest1Category.setPoints(100);

		AssignmentService instance = AssignmentService.getInstance();
		String response = instance.save(ananthElectroTest1Category);

		assertTrue(response.contains("Successfully updated assignment category record for student"));

	}

}
