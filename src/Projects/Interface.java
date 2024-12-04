package Projects;

	
	interface Flyable {
	    void fly();
	}

	interface Swimmable {
	    void swim();
	}

	class Duck implements Flyable, Swimmable {
		private String S;
	    public void fly() {
	        System.out.println("Duck is flying");
	    }
	    

	    public String getS() {
			return S;
		}


		public void setS( String S) {
			this.S = S;
		}


		public void swim() {
	        System.out.println("Duck is swimming");
	    }
		public void me() {
	        System.out.println(" is meowing.");
	
	}
	}

	



