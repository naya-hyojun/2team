package co.soft.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class CommentBean {

	
	private int t_com_no;  // 아무거나
	
	private String t_user_id;
	
	private int t_no;
	
	@NotBlank
	private int t_com_score;
	
	@NotBlank
	@Size(min=2,max=100,message = "코멘트는  2~100글자 이내로 작성해주세요.")
	private String t_com_com;
	
	private MultipartFile t_com_photo;
	
	private String t_com_date;
	
	
	
}
