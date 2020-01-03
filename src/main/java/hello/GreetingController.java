package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	/*
	 * @RequestMapping("/greeting") public Greeting
	 * greeting(@RequestParam(value="name", defaultValue="World") String name) {
	 * return new Greeting(counter.incrementAndGet(), String.format(template,
	 * name)); }
	 */
	
	@GetMapping("/greeting")
	public Greeting greeting1(@RequestParam(value="name", defaultValue="World How are you?") String name) {
		return new Greeting(counter.incrementAndGet(),
							String.format(template, name));
	}
	@PutMapping("/greetings")
	public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),
							String.format(template, name));
	}
}
