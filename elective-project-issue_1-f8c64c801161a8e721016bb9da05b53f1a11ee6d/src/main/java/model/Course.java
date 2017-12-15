package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Course {
	private String name;
	private User teacher;
	private Map<User, Integer> mark;
	private Map<User, String> review;
}
