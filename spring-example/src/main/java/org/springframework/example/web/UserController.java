package org.springframework.example.web;

import org.springframework.example.aop.OperationLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rtt
 * @date 2023/9/24 00:02
 */
@RestController
@RequestMapping("user")
public class UserController {

	@OperationLog("ask")
	@RequestMapping("ask")
	public Map<String, Object> ask() {
		Map<String, Object> resp = new HashMap<>();

		return resp;
	}

}
