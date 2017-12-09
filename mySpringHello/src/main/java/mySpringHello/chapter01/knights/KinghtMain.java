package mySpringHello.chapter01.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KinghtMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("kinghts.xml");
		IKnight knight= context.getBean(IKnight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
