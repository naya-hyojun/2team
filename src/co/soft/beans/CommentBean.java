package co.soft.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class CommentBean {

	
	private int t_com_no;  // �ƹ��ų�
	
	private String t_user_id;
	
	private int t_no;
	
	@NotBlank
	private int t_com_score;
	
	@NotBlank
	@Size(min=2,max=100,message = "�ڸ�Ʈ��  2~100���� �̳��� �ۼ����ּ���.")
	private String t_com_com;
	
	private MultipartFile t_com_photo;
	
	private String t_com_date;
	
	
	
}
