package com.basant.spring.micrometer.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController
public class MetricController {

	@GetMapping("/test1")
	@Timed(value = "Endpoint-1", histogram = true, extraTags = { "version", "1.0" }, percentiles = { 0.95, 0.99 })
	public String test1() {
		return "test-1";
	}

	@GetMapping("/test2")
	@Timed(value = "Endpoint-2", histogram = true, extraTags = { "version", "1.0" }, percentiles = { 0.95, 0.99 })
	public String test2() {
		return "test-1";
	}

}
