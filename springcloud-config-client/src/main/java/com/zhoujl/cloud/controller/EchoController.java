package com.zhoujl.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Date: 2019年06月27日 下午 16:02
 * @author: zhoujl
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class EchoController {

	@Value ("${my.name}")
	private String myName;

	@GetMapping("/my-name")
	public String getMyName() {
		return myName;
	}
}
