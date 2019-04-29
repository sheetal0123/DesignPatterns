package velocitymanager.example2;

import java.util.HashMap;
import java.util.Map;

import velocitymanager.example2.pojos.FileHeader;

/**
 * This class will read data from Excel, CSV etc and return a Map
 * 
 * Currently we are doing hard coding
 */
public class ReadDataFromInputFile {

	//File Header/Footer
	public static Map<String,String> readFileHeader(){
		Map<String, String> fileHeaderMap = new HashMap<>();
		fileHeaderMap.put("TOTAL_DEPT_COUNT", "2");
		fileHeaderMap.put("CURRENT_DATE", "autogenerated");
		return fileHeaderMap;
	}
	
	
	public static Map<String, String> readFileFooter(){
		Map<String,String> fileFooterMap = new HashMap<>();
		fileFooterMap.put("TOTAL_STUDENT_COUNT", "4");
		fileFooterMap.put("JULIAN_DATE", "juliandate"); 
		return fileFooterMap;
	}

	
	//Dept Header/Footer
	public static Map<String, String> readMathsDeptHeader(){
		Map<String,String> mathsDeptHeader = new HashMap<>();
		mathsDeptHeader.put("DEPT_NAME","Dept Of Mathematics");
		mathsDeptHeader.put("DEPT_HOD","Mr Aryabhatta");
		mathsDeptHeader.put("DEPT_FACULTY_COUNT","10");
		mathsDeptHeader.put("DEPT_STARTED_YEAR","1950");
		return mathsDeptHeader;
	}


	public static Map<String, String> readMathsDeptFooter(){
		Map<String,String> mathsDeptFooter = new HashMap<>();
		mathsDeptFooter.put("DEPT_CURRENT_VACANCY","5");
		mathsDeptFooter.put("DEPT_YR_BUDGET","10000000");
		return mathsDeptFooter;
	}

	
	public static Map<String, String> readScienceDeptHeader(){
		Map<String,String> sciDeptHeader = new HashMap<>();
		sciDeptHeader.put("DEPT_NAME","Dept Of Science");
		sciDeptHeader.put("DEPT_HOD","Mrs Curie");
		sciDeptHeader.put("DEPT_FACULTY_COUNT","15");
		sciDeptHeader.put("DEPT_STARTED_YEAR","1970");
		return sciDeptHeader;
	}

	
	public static Map<String, String> readScienceDeptFooter(){
		Map<String,String> sciDeptFooter = new HashMap<>();
		sciDeptFooter.put("DEPT_CURRENT_VACANCY","6");
		sciDeptFooter.put("DEPT_YR_BUDGET","20000000");
		return sciDeptFooter;
	}

	
	public static Map<String,Map<String,String>> readStudentData(){
		Map<String,Map<String,String>> studentData = new HashMap<>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("STUD_ROLL_NO", "1");
		map1.put("STUD_FIRST_NAME", "Mr A");
		map1.put("STUD_LAST_NAME", "ALast");
		map1.put("STUD_DEPT", "Mathematics");
		map1.put("STUD_SCHOOL_NAME", "Orbis");
		map1.put("STUD_CLASS_TEACHER", "Oishe");
		map1.put("STUD_CITY", "Pune");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("STUD_ROLL_NO", "2");
		map2.put("STUD_FIRST_NAME", "Mr B");
		map2.put("STUD_LAST_NAME", "BLast");
		map2.put("STUD_DEPT", "Mathematics");
		map2.put("STUD_SCHOOL_NAME", "St Thomas");
		map2.put("STUD_CLASS_TEACHER", "Ms Deepa");
		map2.put("STUD_CITY", "Delhi");
		

		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("STUD_ROLL_NO", "3");
		map3.put("STUD_FIRST_NAME", "Mr C");
		map3.put("STUD_LAST_NAME", "CLast");
		map3.put("STUD_DEPT", "Science");
		map3.put("STUD_SCHOOL_NAME", "St Thomas");
		map3.put("STUD_CLASS_TEACHER", "Ms Deepa");
		map3.put("STUD_CITY", "Delhi");

		
		studentData.put("1", map1);
		studentData.put("2", map2);
		studentData.put("3", map3);
		
		return studentData;
	}
	
	
}
