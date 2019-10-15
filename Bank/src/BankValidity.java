
public class BankValidity {
void invalid(String n, double sal, int age)throws InvalidUser
{
	if(sal> 500000 && age>25)
	{
		System.out.println("Succesful registration");
	}
	else
		throw new InvalidUser("invalid registration");
}
}
