package com.zhoujl.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 *
 * @Date: 2019年07月02日 下午 17:42
 * @author: zhoujl
 * @Version: 1.0
 */
@RestController
public class DiscoveryServiceController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/service")
	public List<String> getService() {
		return discoveryClient.getServices ();
	}

}
