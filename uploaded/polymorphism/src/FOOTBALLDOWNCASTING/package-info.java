package FOOTBALLDOWNCASTING;
class Coach {
	   public void train() {
	        System.out.println("General training session starts");
	    }
	    public void giveAdvice() {
	        System.out.println("General sports advice given");
	    }
	}

	class FootballCoach extends Coach {
	   public void train() {
	        System.out.println("Football training session starts");
	    }
	    public void setFormation() {
	        System.out.println("Setting up the football team formation");
	    }
	}

	class TennisCoach extends Coach {
	   public void train() {
	        System.out.println("Tennis training session starts");
	    }
	    public void coachServeTechnique() {
	        System.out.println("Coaching tennis serve technique");
	    }
	
	    public static void main(String[] args) {
	       
	        Coach coachFootball = new FootballCoach();
	        Coach coachTennis = new TennisCoach();

	        coachFootball.train();
	        coachTennis.train();
	        
	        // inctance of is use when we know that if the input is from specific class 
//	        than only this operation will perform
	        if (coachFootball instanceof FootballCoach) {
	            ((FootballCoach) coachFootball).setFormation();   // it is an down casting
	        }   //((class name )  (object made in line 30).mathod name     
	        if (coachTennis instanceof TennisCoach) {
	            ((TennisCoach) coachTennis).coachServeTechnique();
	        }
	    }
	}