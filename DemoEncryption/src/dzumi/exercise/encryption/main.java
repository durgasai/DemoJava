package dzumi.exercise.encryption;

import java.io.File;

import dzumi.lib.io.IOUtils;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tao file even
		File fileEven = new File("./data/even");
//		String text = Encrypt.encryptByNumberRelated("Nếu bạn yêu thích từng chi tiết nhỏ nhất về performance của các ứng dụng Java thì đây là quyển sách dành cho bạn.", 3);
//		System.out.println(text);
//		String text = Encrypt.encryptByPrime("CV giống như một tấm ảnh để em gửi cho cô bạn gái em đang muốn làm quen. Vì vậy hãy làm nó thật nhất có thể, để tránh trường hợp khi gặp nhau thật ngoài đời đối phương thất vọng khi so sánh em và bức ảnh.");
		String text = Encrypt.encryptByEven("Mục đích của QA là tìm bug, nhưng vẫn hỗ trợ cho mục đích cuối cùng là làm sản phẩm tốt hơn, chứ không phải là chỉ trích, đánh giá developer.");
		IOUtils.writeTextFile(fileEven.getAbsolutePath(), text);
	}

}
