# SpringAIOllama
SpringAIOllama

#We used Mistral version
server.port=8081

#ollama Confriguration
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.options.model=mistral:latest

We put Get prompt in Postman
http://localhost:8081/ask-ai?prompt=What are the features of Java 8
in param: key: prompt
          value: What are the features of Java 8
