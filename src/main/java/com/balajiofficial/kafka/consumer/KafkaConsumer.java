package com.balajiofficial.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.balajiofficial.kafka.model.Book;

@Component
public class KafkaConsumer {


	
	@KafkaListener(groupId = "group_id_",topics = "test",containerFactory = "concurrentKafkaListenerContainerFactory")
	public void consume(String message) {
		System.out.println("Messages are here "+message);
	}
	
	@KafkaListener(groupId = "group_id",topics = "test",containerFactory = "concurrentKafkaListenerContainerFactory2")
	public void consumeBook(Book book) {
		System.out.println("Book Messages are here "+book);
	}
	
	
}
