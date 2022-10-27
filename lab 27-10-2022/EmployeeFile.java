package lab_27_10_2022;

import java.io.FileOutputStream;
import java.io.IOException;

 class EmployeeFile 
 {
   
	void setFile() throws IOException {
		try {
			FileOutputStream file = new FileOutputStream("D://EmployeeDetails.txt");
			String empId = "Employee ID:12 " + "\n" + "Employee Name: Akshay"  + "\n" + "Employee Salary: 10000 ";
			byte[] byteArrEmp = empId.getBytes();
			file.write(byteArrEmp);
			System.out.println("File written successfully...");
			file.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	public static void main(String[] args) throws IOException {
		EmployeeFile e1 = new EmployeeFile();
		e1.setFile();
	}
}