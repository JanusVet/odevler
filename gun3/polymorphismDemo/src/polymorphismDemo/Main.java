package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
//		System.out.println(loggers);
//		
//		for(BaseLogger logger : loggers) {
//			logger.Log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();
	}
}
