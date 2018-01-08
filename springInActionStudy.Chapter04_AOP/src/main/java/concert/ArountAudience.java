package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ArountAudience {

	@Pointcut("execution(** concert.Performance.perform(..))")
	public void perfoemance(){}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("Silencing cell phones");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		}catch(Throwable e){
			System.out.println("Demanding a refund");
		}
	}
}
