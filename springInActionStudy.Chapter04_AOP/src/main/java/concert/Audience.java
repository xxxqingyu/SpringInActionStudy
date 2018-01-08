package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

	@Before("execution(** concert.Performance.perform(..))")
	public void silenceCellPhone(){
		System.out.println("Silencing cell phones");
	}
	
	@AfterReturning("execution(** concert.Performance.perform(..))")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing(pointcut="execution(** concert.Performance.perform(..))",throwing="ex")
	public void demandRefund(Throwable ex){
		System.out.println("Demanding a refund");
	}
}
