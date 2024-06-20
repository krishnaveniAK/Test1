package main;

public class PhoneBookImpl {
	
	public  void editUserByName() {
        //TODO : In case of multiple matches user should be shown the results and asked to choose which to edit
        User user = new User(null, null, null);
    }

	public void deleteUserByName() {
        //TODO : In case of multiple matches user should be shown the results and asked to choose which to delete
    }

	public void searchUserByName() {
        //TODO : It should be a Starts with check i.e. ["Ayush","Sachin","Keshav"] , search text ="Ay" output="Ayush"
    }

	public void searchUserByPhoneNumber() {
        //TODO
    }

	public void searchUserByEmail() {
        //TODO
    }

	public void addNewUser() {
        //TODO : Validate that at least 2 fields are filled out of 3 for the User otherwise new use should not be added).
        //TODO : Also there should not be duplicate Email or Phone number.

    }

}
