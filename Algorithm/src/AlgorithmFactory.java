
public class AlgorithmFactory {

	public static IAlgorithm getAlgorithmInstance(){
		IAlgorithm algorithm = null;
		
		if(AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase("shortestPath")){
			algorithm = new ShortestPathAlgorithm();
		}else if(AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase("leastTasks")){
			algorithm = new LeastTasksAlgorithm();
		}else if(AlgorithmConfiguration.getAlgorithm().equalsIgnoreCase("fifo")){
			algorithm = new FirstInFirstOutAlgorithm();
		}
		
		return algorithm;
	}
	
}
