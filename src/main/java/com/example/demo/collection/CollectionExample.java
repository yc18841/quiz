package com.example.demo.collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(0);
		list.remove(Integer.valueOf(3));
		
		list.clear();
		
		// queue - first in, first out
		list.offer(1);
		list.offer(2);
		list.offer(3);
		
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		
		// stack
		list.push(1);
		list.push(2);
		list.push(3);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(4);
		queue.offer(5);
		queue.offer(1);
		
		// 1, 4
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		PriorityQueue<UserProfile> usersQueue = new PriorityQueue<>(
				Comparator.comparing((UserProfile u) -> u.age)
			);
		
		usersQueue.offer(new UserProfile(20));
		usersQueue.offer(new UserProfile(30));
		usersQueue.offer(new UserProfile(40));
		
		System.out.println(usersQueue.poll().age);
		
		
	}
	
	static class UserProfile {
		private final Integer age;

		public UserProfile(Integer age) {
			super();
			this.age = age;
		}

		public Integer getAge() {
			return age;
		}
		
	}

}
