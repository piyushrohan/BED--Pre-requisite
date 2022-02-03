/**
 * 
 */
package avitepa.corejava.ratings.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import avitepa.corejava.ratings.service.domain.Assignment;

/**
 * @author Piyush R
 *
 */
public class AssignmentService {

	private static final AssignmentService ASSIGNMENT_SERVICE = new AssignmentService();
	private Set<Assignment> assignments;

	private AssignmentService() {
		assignments = new HashSet<>();
		loadInitData();
	}

	/**
	 * This method returns the instance of this (AssignmentService) class
	 * 
	 * @return AssignmentService
	 */
	public static AssignmentService getInstance() {
		return ASSIGNMENT_SERVICE;
	}

	/**
	 * This method adds student category record if not available already otherwise updates
	 * 
	 * @param assignment
	 * @return String
	 */
	public String save(Assignment assignment) {
		boolean flag = assignments.add(assignment);
		String statusMsg;
		if (flag) {
			statusMsg = "Successfully enrolled student: " + assignment.getStudentName() + " with assignment category : "
					+ assignment.getAssignmentCategory();
		} else {
			statusMsg = "Successfully updated assignment category record for student: " + assignment.getStudentName()
					+ " with assignment category : " + assignment.getAssignmentCategory();
		}
		return statusMsg;
	}
	
	/**
	 * This method deletes the student assignment category records if available
	 * 
	 * @param assignment
	 * @return String
	 */
	public String delete(Assignment assignment) {
		boolean flag = assignments.remove(assignment);
		String statusMsg;
		if (flag) {
			statusMsg =  "Successfully deleted assignment category record for student: " + assignment.getStudentName()
			+ " with assignment category : " + assignment.getAssignmentCategory();
		} else {
			statusMsg = "Assignment record not found for student " + assignment.getStudentName() + " with assignment category : "
					+ assignment.getAssignmentCategory();
		}
		return statusMsg;
	}

	/**
	 * This method returns all assignment records
	 * @return Set<Assignment>
	 */
	public Set<Assignment> getAssignments() {
		return assignments;
	}

	private void loadInitData() {
		Assignment ananthElectroTest1Category = new Assignment();
		ananthElectroTest1Category.setAssignmentCategory("test_1");
		ananthElectroTest1Category.setStudentName("Ananth");
		ananthElectroTest1Category.setSubject("Electro Fields");
		ananthElectroTest1Category.setSerialNumber(1);
		ananthElectroTest1Category.setDataOfSubmission(new Date());
		ananthElectroTest1Category.setPoints(100);
		assignments.add(ananthElectroTest1Category);

		Assignment bhagathElectroTest1Category = new Assignment();
		bhagathElectroTest1Category.setAssignmentCategory("test_1");
		bhagathElectroTest1Category.setStudentName("Bhagath");
		bhagathElectroTest1Category.setSubject("Electro Fields");
		bhagathElectroTest1Category.setSerialNumber(1);
		bhagathElectroTest1Category.setDataOfSubmission(new Date());
		bhagathElectroTest1Category.setPoints(78);
		assignments.add(bhagathElectroTest1Category);

		Assignment chayaElectroTest1Category = new Assignment();
		chayaElectroTest1Category.setAssignmentCategory("test_1");
		chayaElectroTest1Category.setStudentName("Chaya");
		chayaElectroTest1Category.setSubject("Electro Fields");
		chayaElectroTest1Category.setSerialNumber(1);
		chayaElectroTest1Category.setDataOfSubmission(new Date());
		chayaElectroTest1Category.setPoints(68);
		assignments.add(chayaElectroTest1Category);

		Assignment eshrathElectroTest1Category = new Assignment();
		eshrathElectroTest1Category.setAssignmentCategory("test_1");
		eshrathElectroTest1Category.setStudentName("Eshrath");
		eshrathElectroTest1Category.setSubject("Electro Fields");
		eshrathElectroTest1Category.setSerialNumber(1);
		eshrathElectroTest1Category.setDataOfSubmission(new Date());
		eshrathElectroTest1Category.setPoints(87);
		assignments.add(eshrathElectroTest1Category);

		Assignment bhagathElectroQuiz1Category = new Assignment();
		bhagathElectroQuiz1Category.setAssignmentCategory("quiz_1");
		bhagathElectroQuiz1Category.setStudentName("Bhagath");
		bhagathElectroQuiz1Category.setSubject("Electro Fields");
		bhagathElectroQuiz1Category.setSerialNumber(1);
		bhagathElectroQuiz1Category.setDataOfSubmission(new Date());
		bhagathElectroQuiz1Category.setPoints(20);
		assignments.add(bhagathElectroQuiz1Category);

		Assignment chayaElectroLab1Category = new Assignment();
		chayaElectroLab1Category.setAssignmentCategory("lab work_1");
		chayaElectroLab1Category.setStudentName("Chaya");
		chayaElectroLab1Category.setSubject("Electro Fields");
		chayaElectroLab1Category.setSerialNumber(1);
		chayaElectroLab1Category.setDataOfSubmission(new Date());
		chayaElectroLab1Category.setPoints(10);
		assignments.add(chayaElectroLab1Category);

		Assignment ananthElectroProject1Category = new Assignment();
		ananthElectroProject1Category.setAssignmentCategory("project_1");
		ananthElectroProject1Category.setStudentName("Ananth");
		ananthElectroProject1Category.setSubject("Electro Fields");
		ananthElectroProject1Category.setSerialNumber(1);
		ananthElectroProject1Category.setDataOfSubmission(new Date());
		ananthElectroProject1Category.setPoints(100);
		assignments.add(ananthElectroProject1Category);

		Assignment devanathElectroProject1Category = new Assignment();
		devanathElectroProject1Category.setAssignmentCategory("project_1");
		devanathElectroProject1Category.setStudentName("Devanath");
		devanathElectroProject1Category.setSubject("Electro Fields");
		devanathElectroProject1Category.setSerialNumber(1);
		devanathElectroProject1Category.setDataOfSubmission(new Date());
		devanathElectroProject1Category.setPoints(100);
		assignments.add(devanathElectroProject1Category);

		Assignment bhagathElectroQuiz2Category = new Assignment();
		bhagathElectroQuiz2Category.setAssignmentCategory("quiz_2");
		bhagathElectroQuiz2Category.setStudentName("Bhagath");
		bhagathElectroQuiz2Category.setSubject("Electro Fields");
		bhagathElectroQuiz2Category.setSerialNumber(1);
		bhagathElectroQuiz2Category.setDataOfSubmission(new Date());
		bhagathElectroQuiz2Category.setPoints(50);
		assignments.add(bhagathElectroQuiz2Category);

		Assignment ananthElectroQuiz1Category = new Assignment();
		ananthElectroQuiz1Category.setAssignmentCategory("quiz_1");
		ananthElectroQuiz1Category.setStudentName("Ananth");
		ananthElectroQuiz1Category.setSubject("Electro Fields");
		ananthElectroQuiz1Category.setSerialNumber(1);
		ananthElectroQuiz1Category.setDataOfSubmission(new Date());
		ananthElectroQuiz1Category.setPoints(100);
		assignments.add(ananthElectroQuiz1Category);

		Assignment bhagathElectroLab1Category = new Assignment();
		bhagathElectroLab1Category.setAssignmentCategory("lab work_1");
		bhagathElectroLab1Category.setStudentName("Bhagath");
		bhagathElectroLab1Category.setSubject("Electro Fields");
		bhagathElectroLab1Category.setSerialNumber(1);
		bhagathElectroLab1Category.setDataOfSubmission(new Date());
		bhagathElectroLab1Category.setPoints(10);
		assignments.add(bhagathElectroLab1Category);

		Assignment chayaElectroProject1Category = new Assignment();
		chayaElectroProject1Category.setAssignmentCategory("project_1");
		chayaElectroProject1Category.setStudentName("Chaya");
		chayaElectroProject1Category.setSubject("Electro Fields");
		chayaElectroProject1Category.setSerialNumber(1);
		chayaElectroProject1Category.setDataOfSubmission(new Date());
		chayaElectroProject1Category.setPoints(100);
		assignments.add(chayaElectroProject1Category);

		Assignment bhagathElectroProject1Category = new Assignment();
		bhagathElectroProject1Category.setAssignmentCategory("project_1");
		bhagathElectroProject1Category.setStudentName("Bhagath");
		bhagathElectroProject1Category.setSubject("Electro Fields");
		bhagathElectroProject1Category.setSerialNumber(1);
		bhagathElectroProject1Category.setDataOfSubmission(new Date());
		bhagathElectroProject1Category.setPoints(50);
		assignments.add(bhagathElectroProject1Category);

		Assignment ananthComputingTechniqueTest1Category = new Assignment();
		ananthComputingTechniqueTest1Category.setAssignmentCategory("test_1");
		ananthComputingTechniqueTest1Category.setStudentName("Ananth");
		ananthComputingTechniqueTest1Category.setSubject("Computing Techniques");
		ananthComputingTechniqueTest1Category.setSerialNumber(1);
		ananthComputingTechniqueTest1Category.setDataOfSubmission(new Date());
		ananthComputingTechniqueTest1Category.setPoints(86);
		assignments.add(ananthComputingTechniqueTest1Category);

		Assignment ananthComputingTechniqueProject1Category = new Assignment();
		ananthComputingTechniqueProject1Category.setAssignmentCategory("quiz_2");
		ananthComputingTechniqueProject1Category.setStudentName("Ananth");
		ananthComputingTechniqueProject1Category.setSubject("Electro Fields");
		ananthComputingTechniqueProject1Category.setSerialNumber(1);
		ananthComputingTechniqueProject1Category.setDataOfSubmission(new Date());
		ananthComputingTechniqueProject1Category.setPoints(100);
		assignments.add(ananthComputingTechniqueProject1Category);

		Assignment bhagathComputingTechniqueProject1Category = new Assignment();
		bhagathComputingTechniqueProject1Category.setAssignmentCategory("project_1");
		bhagathComputingTechniqueProject1Category.setStudentName("Bhagath");
		bhagathComputingTechniqueProject1Category.setSubject("Computing Technique");
		bhagathComputingTechniqueProject1Category.setSerialNumber(1);
		bhagathComputingTechniqueProject1Category.setDataOfSubmission(new Date());
		bhagathComputingTechniqueProject1Category.setPoints(50);
		assignments.add(bhagathComputingTechniqueProject1Category);

		Assignment ananthElectroLab1Category = new Assignment();
		ananthElectroLab1Category.setAssignmentCategory("lab work_1");
		ananthElectroLab1Category.setStudentName("Ananth");
		ananthElectroLab1Category.setSubject("Electro Fields");
		ananthElectroLab1Category.setSerialNumber(1);
		ananthElectroLab1Category.setDataOfSubmission(new Date());
		ananthElectroLab1Category.setPoints(100);
		assignments.add(ananthElectroLab1Category);

		Assignment chayaComputingTechniqueQuiz1Category = new Assignment();
		chayaComputingTechniqueQuiz1Category.setAssignmentCategory("quiz_1");
		chayaComputingTechniqueQuiz1Category.setStudentName("Chaya");
		chayaComputingTechniqueQuiz1Category.setSubject("Computing Technique");
		chayaComputingTechniqueQuiz1Category.setSerialNumber(1);
		chayaComputingTechniqueQuiz1Category.setDataOfSubmission(new Date());
		chayaComputingTechniqueQuiz1Category.setPoints(20);
		assignments.add(chayaComputingTechniqueQuiz1Category);

		Assignment ananthElectroTest2Category = new Assignment();
		ananthElectroTest2Category.setAssignmentCategory("test_2");
		ananthElectroTest2Category.setStudentName("Ananth");
		ananthElectroTest2Category.setSubject("Electro Fields");
		ananthElectroTest2Category.setSerialNumber(1);
		ananthElectroTest2Category.setDataOfSubmission(new Date());
		ananthElectroTest2Category.setPoints(100);
		assignments.add(ananthElectroTest2Category);

		Assignment chayaElectroTest2Category = new Assignment();
		chayaElectroTest2Category.setAssignmentCategory("test_2");
		chayaElectroTest2Category.setStudentName("Chaya");
		chayaElectroTest2Category.setSubject("Electro Fields");
		chayaElectroTest2Category.setSerialNumber(1);
		chayaElectroTest2Category.setDataOfSubmission(new Date());
		chayaElectroTest2Category.setPoints(92);
		assignments.add(chayaElectroTest2Category);

	}

}
