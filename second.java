
public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;		
		double costOfMilk = 2.59;
		double moneyInWallet = 20.00;
		int thirstLevel = 8;
		
		boolean shouldByIcecream = isHotOutside && moneyInWallet > 0;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && moneyInWallet > 0 && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2);
		
		System.out.println("I will buy ice cream if it is hot out and I have money in my pocket." +shouldByIcecream);
		System.out.println("I will go swimming if it is hot out and not a weekday." +willGoSwimming);
		System.out.println("It is a good day if it is hot out, I have money in my pocket and it is not a weekend." +isAGoodDay);
		System.out.println("I will buy milk if it is hot out and my thirst is greater than 3 and I have enough money in my pocket to buy at least 2 milks if I wanted to." +willBuyMilk);
}

}