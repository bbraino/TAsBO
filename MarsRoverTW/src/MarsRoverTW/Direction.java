package MarsRoverTW;

public enum Direction{
	//the enum values have been overridden so that the values could be returned as strings
	N
	{
		@Override
		public String toString(){
			return "N";
		}

	},
	S
	{
		@Override
		public String toString(){
			return "S";
		}   		
	},
	E
	{
		@Override
		public String toString(){
			return "E";
		}
	},
	W
	{
		@Override
		public String toString(){
			return "W";
		}
	}
}
