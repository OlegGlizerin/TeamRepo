package model.BuilderPattern;

import model.eNums.ePowerType;

public class Engine {
	private int milege;
	private ePowerType powerType;
	private int numberOfPistons;
	private float efficiancy;
	//will implement an engine builder design pattern
	//this will make extending the engine in the future easier and more maintainable because of only one way to
	public static class EngineBuilder {
		private int milage = 0;
		private final ePowerType powerType;
		private int numberOfPistons = 0;
		private float efficiancy = 0;
		public EngineBuilder(ePowerType powerType){
			this.powerType = powerType;
		}

		public EngineBuilder milage(int milage){
			this.milage = milage;
			return this;
		}
		public EngineBuilder numberOfPistons(int numberOfPistons){
			this.numberOfPistons = numberOfPistons;
			return this;
		}
		public EngineBuilder efficiancy(float efficiancy){
			this.efficiancy = efficiancy;
			return this;
		}

		public Engine build(){
			return new Engine(this);
		}
	}

	private Engine(EngineBuilder engineBuilder) {
		this.milege = engineBuilder.milage;
		this.numberOfPistons = engineBuilder.numberOfPistons;
		this.efficiancy = engineBuilder.efficiancy;
	}
	
}
