package com.example.SpringAIOllama.controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

	ChatModel chatModel;
	public AIController(ChatModel chatModel) {
		this.chatModel=chatModel;
	}
	
	@GetMapping("/ask-ai")
	public String askAI(@RequestParam String prompt) {
		ChatResponse response = chatModel.call(
				new Prompt(
					prompt,
					OllamaChatOptions.builder()
					.temperature(0.4)
					.build()
						));
		return response.getResult().getOutput().getText();
	}
	
}
