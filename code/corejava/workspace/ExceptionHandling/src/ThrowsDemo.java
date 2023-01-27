
public class ThrowsDemo {
	public static void main(String[] args) {
		FileDataReader dataReader = new FileDataReader();
		try {
			dataReader.printFileData("note.pdf");
		} catch(ValidationException ex) {
			ex.printErrorMessage();
		}
	}
}


class FileDataReader {
	
	public void printFileData(String file) throws ValidationException {
		if(file.endsWith(".txt") || file.endsWith(".java")) {
			System.out.println("File Can be read");
		} else {
			throw new ValidationException("File Format not Supported..");
		}
	}
	
}
