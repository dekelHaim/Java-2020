
public class Bird extends Animal{
			//---------------properties-----------------
			private double weight;
			private boolean isFlying;
			

			//---------------getters + setters----------
			public boolean getIsFlying() {
				return isFlying;
			}

			public void setIsFlying(boolean isFlying) {
				this.isFlying = isFlying;
			}
			
			
			//---------------constructor----------------
			public Bird(){
				System.out.println("Bird constructor");
			}	
				
				
			//---------------functions------------------
			@Override
			public String toString(){
				return  super.toString()+" ,isFlying: "+getIsFlying();
			}

			@Override
			public double getWeight() {
				return weight;
			}

			@Override
			public void setWeight(double weight) {
				this.weight=(weight>0.2 && weight<10)?weight:0.2;
				
			}	
			
			@Override
			public String makeSound() {
				return "Ziffff Ziffff";
			}
			
			
}
