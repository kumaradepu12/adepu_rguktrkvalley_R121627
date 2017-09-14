import java.util.Iterator;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		// System.out.println(length);
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(this.students.length==0)
			return null;
		else {
			return this.students;
		}
		
	}

	@Override
	public void setStudents(Student[] students) {
		
		for(int i=0;i<students.length;i++)
			this.students[i]=students[i];
		if(students==null)
			throw new IllegalArgumentException();
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index>=this.students.length || index<0)
			throw new IllegalArgumentException();
		else
			return students[index] ;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
		this.students[index]=student;
		}
	}
		
	

	@Override
	public void addFirst(Student student) {
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
			Student[] students2=new Student[this.students.length];
		for(int i=0;i<this.students.length;i++){
			students2[i]=this.students[i];
		}
		this.students=new Student[this.students.length+1];
		this.students[0]=student;
		for(int i=0;i<this.students.length;i++)
			this.students[i+1]=students2[i];
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
			Student[] students2=new Student[this.students.length];
		for(int i=0;i<this.students.length;i++){
			students2[i]=this.students[i];
		}
		this.students=new Student[this.students.length+1];
		for(int i=0;i<this.students.length;i++)
			this.students[i]=students2[i];
		this.students[i]=student;
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
		Student[] students2=new Student[this.students.length];
		for(int i=0;i<this.students.length;i++){
			students2[i]=this.students[i];
		}
		this.students=new Student[this.students.length+1];
		for(int i=0;i<index;i++)
			this.students[i]=students2[i];
		this.students[index]=student;
		for(int i=index+1;i<this.students.length;i++){
			this.students[i]=students2[i-1];
		}
	}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
		Student[] students2=new Student[this.students.length];
		for(int i=0;i<this.students.length;i++){
			students2[i]=this.students[i];
		}
		this.students=new Student[this.students.length-1];
		for(int i=0;i<index;i++)
			this.students[i]=students2[i];
		//this.students[index]=student;
		for(int i=index+1;i<this.students.length;i++){
			this.students[i-1]=students2[i];
		}
	}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i;
		if(student==null)
			throw new IllegalArgumentException();
		else{
		Student[] students2=new Student[this.students.length];
		for(int i=0;i<this.students.length;i++){
			students2[i]=this.students[i];
		}
		for( i=0;i<this.students.length;i++)
		{
			if(this.students[i]==student)
				break;
		}
		}
		if(i==this.students.length)
			throw new IllegalArgumentException("Student not exist"); 
		else {
			this.students=new Student[this.students.length-1];
			for(int k=0;k<i;k++)
				this.students[k]=students2[k];
		//this.students[index]=student;
		for(int k=i+1;i<this.students.length;k++){
			this.students[k-1]=students2[k];
		}
		
	}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
