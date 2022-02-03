/**
 * 
 */
package avitepa.corejava.ratings.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import avitepa.corejava.ratings.exception.AssignmentCategoryException;

/**
 * @author Piyush R
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class DistributionServiceTest {

	@Test
	public void testGetAssignmentCategories() {
		assertNotNull(DistributionService.getInstance().getAssignmentCategories());
	}

	@Test(expected = AssignmentCategoryException.class)
	public void testAddAssignmentCategory() {
		DistributionService instance = DistributionService.getInstance();
		instance.addAssignmentCategory("quiz", 10);
	}

	@Test
	public void testRemoveAssignmentCategory() {
		DistributionService instance = DistributionService.getInstance();
		instance.removeAssignmentCategory("test");
	}

	@Test
	public void testModifyAssignmentCategory() {
		DistributionService instance = DistributionService.getInstance();
		instance.modifyAssignmentCategory("quiz", 1);
	}

}
