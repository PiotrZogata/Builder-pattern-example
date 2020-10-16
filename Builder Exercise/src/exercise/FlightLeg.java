package exercise;

public class FlightLeg {

	private final String from;
	private final String  to;
	private boolean delayed;
	private double price;
	
	private FlightLeg(FlightLegBuilder flightLegBuilder) {
		this.from = flightLegBuilder.from;
		this.to = flightLegBuilder.to;
		this.delayed = flightLegBuilder.delayed;
		this.price = flightLegBuilder.price;
	}
	
	@Override
	public String toString() {
		return "FlightLeg [from=" + from + ", to=" + to + ", delayed=" + delayed + ", price=" + price + "]";
	}

	public static class FlightLegBuilder{
	    
		private final String from;
        private final String to;
        private final boolean delayed;
        private double price;
		
		public FlightLegBuilder (String from, String to, boolean delayed) {
			this.from = from;
			this.to = to;
			this.delayed = delayed;
			}
		
	      public FlightLegBuilder price(double price) {
	            this.price = price;
	            return this;
	        }
		
		public FlightLeg build() {
			   if(this.price==0) {
	                throw new IllegalStateException("Brak wymaganego pola - cena");
	            }
			return new FlightLeg(this);
		}
	}
	
	
}























