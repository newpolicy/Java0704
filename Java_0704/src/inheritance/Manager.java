package inheritance;

public class Manager extends Employee { //Employee 클래스를 상속받은 Manager 클래스
	public Manager(int n) {//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는 안드로이드에서 많이 발생합니다.
		super(n);
		// TODO Auto-generated constructor stub
	}

		//상속받은 클래스 안에는 코드가 숨겨져 있다.
	/*public class manager(){
	  Employee super = new Employee();
	  } */
		private String task;

		public String getTask() {
			return task;
		}

		//메소드 원형: setTask(String)  메소드 이름: setTask, 매개변수의 자료형: String, 개수: 1개
		public void setTask(String task) {
			this.task = task;
		}

		@Override
		public String toString() {
			return super.toString() + "Manager [task=" + task + "]";
		      // super.toString은 상위 클래스인 Employee의 toSring을 호출.
		}
	
		
}
