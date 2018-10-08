package com.ps.new_java.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalOneSample {

	public static void main(String[] args) {
		List<Integer> atendees = Arrays.asList();
		Optional<Integer> noAttendees = atendees.stream().reduce(Integer::sum);
		if(noAttendees.isPresent()) {
			System.out.println(noAttendees.get());
		}
		atendees = Arrays.asList(1,11,55,88,98,90);
		Optional<Integer> attendeesOptional = atendees.stream().reduce(Integer::sum);
		if(attendeesOptional.isPresent()) {
			System.out.println(attendeesOptional.get());
		}
	}

}
