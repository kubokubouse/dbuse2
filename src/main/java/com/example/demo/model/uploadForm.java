package com.example.demo.model;
	import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

	/**
	 * ファイルアップロードのフォームクラス
	 */
	@Data
	public class uploadForm {
	    private MultipartFile multipartFile;
	}