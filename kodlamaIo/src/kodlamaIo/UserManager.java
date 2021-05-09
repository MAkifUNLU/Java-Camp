package kodlamaIo;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi :" + user.getName() + user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi :" + user.getName() + user.getLastName());
	}
}
