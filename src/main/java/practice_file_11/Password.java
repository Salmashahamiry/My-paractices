package practice_file_11;

import java.util.Random;

public class Password {

	int lenght;
	int password;

//constructors	
	Password() {

		lenght = 8;

	}

	Password(int lenght) {

		Random pass = new Random(lenght);
		this.password=pass.nextInt();
	}

	// methods
	
	public boolean isString(int password) {
		if(checkString(password))
		return true;
		else
			return false;
	}
	
	public boolean checkString(int password)
	{//??????
		
		return true;
	}
	
}
