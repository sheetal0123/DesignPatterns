package velocitymanager.example2;

import java.util.List;

import velocitymanager.example2.pojos.FileFooter;
import velocitymanager.example2.pojos.FileHeader;
import velocitymanager.example2.pojos.MathsDepartmentFooter;
import velocitymanager.example2.pojos.MathsDepartmentHeader;
import velocitymanager.example2.pojos.ScienceDepartmentFooter;
import velocitymanager.example2.pojos.ScienceDepartmentHeader;
import velocitymanager.example2.pojos.StudentsDetails;

/**
 * This class object should have all the data which need to be passed to Velocity Manager
 * 
 * This is Top most base file place holder
 * 
 * This class should represent generated file structure , refer readme.txt
 *
 */
public class BasePlaceHolderClass {

	FileHeader fileHeader;
	 
	MathsDepartmentHeader mathsDepartmentHeader;
	List<StudentsDetails> lsOfMathsStudent;
	MathsDepartmentFooter mathsDepartmentFooter;
		
	ScienceDepartmentHeader scienceDepartmentHeader;
	List<StudentsDetails> lsOfScienceStudent;
	ScienceDepartmentFooter scienceDepartmentFooter;
	
	FileFooter fileFooter;
	
	
	
	

	public FileHeader getFileHeader() {
		return fileHeader;
	}

	public void setFileHeader(FileHeader fileHeader) {
		this.fileHeader = fileHeader;
	}

	public MathsDepartmentHeader getMathsDepartmentHeader() {
		return mathsDepartmentHeader;
	}

	public void setMathsDepartmentHeader(MathsDepartmentHeader mathsDepartmentHeader) {
		this.mathsDepartmentHeader = mathsDepartmentHeader;
	}

	public List<StudentsDetails> getLsOfMathsStudent() {
		return lsOfMathsStudent;
	}

	public void setLsOfMathsStudent(List<StudentsDetails> lsOfMathsStudent) {
		this.lsOfMathsStudent = lsOfMathsStudent;
	}

	public MathsDepartmentFooter getMathsDepartmentFooter() {
		return mathsDepartmentFooter;
	}

	public void setMathsDepartmentFooter(MathsDepartmentFooter mathsDepartmentFooter) {
		this.mathsDepartmentFooter = mathsDepartmentFooter;
	}

	public ScienceDepartmentHeader getScienceDepartmentHeader() {
		return scienceDepartmentHeader;
	}

	public void setScienceDepartmentHeader(ScienceDepartmentHeader scienceDepartmentHeader) {
		this.scienceDepartmentHeader = scienceDepartmentHeader;
	}

	public List<StudentsDetails> getLsOfScienceStudent() {
		return lsOfScienceStudent;
	}

	public void setLsOfScienceStudent(List<StudentsDetails> lsOfScienceStudent) {
		this.lsOfScienceStudent = lsOfScienceStudent;
	}

	public ScienceDepartmentFooter getScienceDepartmentFooter() {
		return scienceDepartmentFooter;
	}

	public void setScienceDepartmentFooter(ScienceDepartmentFooter scienceDepartmentFooter) {
		this.scienceDepartmentFooter = scienceDepartmentFooter;
	}

	public FileFooter getFileFooter() {
		return fileFooter;
	}

	public void setFileFooter(FileFooter fileFooter) {
		this.fileFooter = fileFooter;
	}
	

	
	
	
	
	
}
