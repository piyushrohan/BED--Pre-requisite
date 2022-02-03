/**
 * 
 */
package avitepa.corejava.ratings.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import avitepa.corejava.ratings.exception.AssignmentCategoryException;

/**
 * @author Piyush R
 *
 */
public class DistributionService {

	private static final DistributionService DISTRIBUTION_SERVICE=new DistributionService();
	
	private Map<String, Integer> distributions;
	private int capacity;

	private DistributionService() {
		distributions = new HashMap<>();
		// load distribution data
		distributions.put("test", 40);
		distributions.put("quiz", 20);
		distributions.put("lab work", 10);
		distributions.put("project", 30);
		capacity=100;
	}
	
	public static DistributionService getInstance() {
		return DISTRIBUTION_SERVICE;
	}
	
	public Map<String, Integer> getAssignmentCategories(){
		return distributions;
	}
	
	public int getCapacity() {
		return capacity;
	}

	/**
	 * This method adds the category if not already available
	 * 
	 * @param category
	 * @param weight
	 * @return String
	 * @throws AssignmentCategoryException
	 */
	public String addAssignmentCategory(String category, int weight){
		if(capacity == 100) {
			throw new AssignmentCategoryException("Assignment Category list is full, Please remove before adding aditional capacity");
		}
		if(distributions.containsKey(category)) {
			throw new AssignmentCategoryException("Assignment Category already available, category: "+category);
		}
		
		int availableCapacity = 100 - capacity;
		if(weight > availableCapacity ) {
			throw new AssignmentCategoryException("Not enought weight capacity, available capacity : "+ availableCapacity);
		}
		
		distributions.put(category, weight);
		capacity+=weight;
		return "Successfully added category: "+category;
	}
	
	/**
	 * This method removes the category if available
	 * 
	 * @param category
	 * @return boolean
	 */
	public boolean removeAssignmentCategory(String category) {
		Integer oldValue = distributions.remove(category);
		if(Objects.nonNull(oldValue)){
			capacity-=oldValue;
			return true;
		}
		return false;
	}
	


	/**
	 * 
	 * @param category
	 * @param weight
	 * @return
	 */
	public boolean modifyAssignmentCategory(String category, int weight) {
		Integer existingValue = distributions.get(category);
		if(Objects.isNull(existingValue)) {
			throw new AssignmentCategoryException("Assignment Category not available, category: "+category);
		}
		
		int availableCapacity = 100 - capacity;
		if(weight > (availableCapacity + existingValue)) {
			throw new AssignmentCategoryException("Not enought capacity, available capacity : "+ availableCapacity);
		}
		
		Integer oldValue=distributions.put(category, weight);
		capacity-=oldValue;
		capacity+=weight;
		return true;
	}
}
