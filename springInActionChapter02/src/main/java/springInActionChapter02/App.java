package springInActionChapter02;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

		Class<Demo> c = Demo.class;
		// 获取需要处理的方法Method实例
		Method method = c.getMethod("print", new Class[] {});
		if (method.isAnnotationPresent(TestAnnotation.class)) {
			
		}
	}

	class Demo {
		@TestAnnotation("hhee")
		public void print() {

		}
	}

	@Retention(value = RetentionPolicy.RUNTIME)
	@interface TestAnnotation {

		String name() default "";

		String[] value() default {};
	}
}
