package encrypt;

import com.tvx.Encryptor;

public class EncryptTest {

	public static void main(String[] args) {
		String data = "";
		data = Encryptor.readFile("plainfile");
		System.out.println(data);

		String enData = Encryptor.encrypt(data);
		Encryptor.writeFile("plainfile", enData);

		data = Encryptor.readFile("plainfile");
		String deData = Encryptor.decrypt(data);

		Object obj = Encryptor.convertStringToJsonObject(deData);
		String username = Encryptor.getValueFromJsonNode(obj, "username");
		System.out.println(username);
	}

}
