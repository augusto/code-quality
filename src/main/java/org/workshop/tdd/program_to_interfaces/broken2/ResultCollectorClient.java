package org.workshop.tdd.program_to_interfaces.broken2;

public class ResultCollectorClient {
	
	public Boolean hasInterest() {
		ResultCollector<Boolean> resultCollector = new ResultCollector<Boolean>() {

			private boolean result;
			
			@Override
			public void setResult(String interest) {
				result = true;
				
			}

			@Override
			public Boolean getResult() {
				return result;
			}
			
		};
		
		calculateInterest(resultCollector);
		return resultCollector.getResult();
	}
	
	public String getInterest() {
		ResultCollector<String> resultCollector = new ResultCollector<String>() {

			private String result;
			
			@Override
			public void setResult(String interest) {
				result = interest;
				
			}

			@Override
			public String getResult() {
				return result;
			}
			
		};
		
		calculateInterest(resultCollector);
		return resultCollector.getResult();
	}
	

	public void calculateInterest(ResultCollector<?> resultCollector) {
		//calculate interest

		if( /*condition*/ true) {
			resultCollector.setResult("40%");
		}
	}

}
