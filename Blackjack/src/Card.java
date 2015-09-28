
public class Card
	{
		private String cardName;
		private String Suit;
		private int Value;
		public Card(String cN, String s, int v)
		{
			cardName = cN;
			Suit = s;
			Value = v;
		}
		public String getCardName()
			{
				return cardName;
			}
		public void setCardName(String cardName)
			{
				this.cardName = cardName;
			}
		public String getSuit()
			{
				return Suit;
			}
		public void setSuit(String suit)
			{
				Suit = suit;
			}
		public int getValue()
			{
				return Value;
			}
		public void setValue(int value)
			{
				Value = value;
			}
	}
		
