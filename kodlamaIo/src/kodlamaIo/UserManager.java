package kodlamaIo;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi :" + user.getName() + user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� silindi :" + user.getName() + user.getLastName());
	}
}
