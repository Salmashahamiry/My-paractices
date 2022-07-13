package practice_file_11;

import java.util.Random;

public class Person {

	// properties

	private String name;
	private int id;
	//private int ID;
	private int age;
	private float height;
	private float weight;
	private  char gender;// M OR F

	// parametrize constructor1
	Person() {
		super();
		this.name ="";
		this.id=GeneratesID();
		this.age = 0;
		this.height = 0;
		this.weight = 0;
		this.gender = 'M';
		
	}
	
	
	
	//constructor
	Person(String name, int age,float weight,float height, char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
		this.id=GeneratesID();
	}
	// methods

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public float getWeight() {
		return weight;
	}



	public void setWeight(float weight) {
		this.weight = weight;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}

//methods
//Calculate method
	public int Calculate() {

		float idealWeight = weight / (height * height);
		if (idealWeight > weight)
			return 1;
		else if (idealWeight == weight)
			return 0;
		else
			return -1;
	}

	private boolean isOver18() {
		if (age >= 18)
			return true;
		else
			return false;

	}

	private boolean CheckGender(char gen) {
		if (gen == 'F' || gen == 'M')
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		
		return "name:"+this.name+",age:"+this.age+"'height:"+this.height+",weight:"+this.weight+",gender:"+this.gender+",:ID"+this.id;
	}
	//@Override
	private int GeneratesID() {
		Random id=new Random();
		return id.nextInt(99999999);
	}
	
}
