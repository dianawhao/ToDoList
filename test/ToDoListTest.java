import org.junit.*;
import java.util.Date;

import static org.junit.Assert.*;


import java.util.Collection;

public class ToDoListTest {
	private Task task1;
	private Task task2;
	private Task task3;
	private Task task4;
	private ToDoList todoList;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		task1 = new Task ("desc 1");
		task2 = new Task ("desc 2");
		task3 = new Task ("desc 3");
		Date date4 = new Date();
		task4 = new Task ("desc 4", false, date4);

		
		todoList = new ToDoList();
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/dianawhao/ToDoList

	}
	@After
	 public void tearDown() throws Exception{
		task1 = null;
		task2 = null;
		task3 = null;
		task4 = null;
		todoList = null;
	}

	@Test
	public void testAddTask() {
		assertNotNull("Check if there is valid list to add to", todoList);
		todoList.addTask(task1);
		assertEquals("Check that list size is 1", 1, todoList.getAllTasks().size());
		assertEquals("Check that task is added", task1, todoList.getTask(task1.getDescription()));
	}
	@Test
	public void testAddTaskwithDueDate() {
		
		assertNotNull("Check if there is valid list to add to", todoList);
		todoList.addTask(task4);
		assertEquals("Check that list size is 1", 1, todoList.getAllTasks().size());
		assertEquals("Check that task is added", task4, todoList.getTask(task4.getDescription()));
	}
	@Test
	public void testgetStatus() {
		assertNotNull(todoList);
		todoList.addTask(task1);
		assertEquals(false, todoList.getStatus(task1.getDescription()));
		todoList.completeTask(task1.getDescription());
		assertEquals(true, todoList.getStatus(task1.getDescription()));
	}
	@Test
	public void testRemoveTask() {
		assertNotNull(todoList);
		todoList.addTask(task1);
		todoList.addTask(task2);;
		
		todoList.removeTask(task1.getDescription());
		assertNull(todoList.getTask(task1.getDescription()));	
	}
	@Test
	public void testGetCompletedTasks() {
		task1.setComplete(true);
		task3.setComplete(true);
		todoList.addTask(task1);
		todoList.addTask(task2);
		todoList.addTask(task3);
		
		Collection<Task> tasks = todoList.getCompletedTasks();
		assertEquals(2, tasks.size());
	}

}
