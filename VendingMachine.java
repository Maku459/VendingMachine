class VendingMachine{

	private int inputamount; //投入金額
	private int tea;
	private int sportsdrink;
	private int coffee;
	private int button;

	public VendingMachine(){
		tea = 3;
		sportsdrink = 3;
		coffee = 3;
	}

	public int getInputamount(){
		return this.inputamount;
	}

	public void input(){
		System.out.println("お金を投入してください");
		this.inputamount = KeyBoard.readInt();	
	}

	public void buy(){
		System.out.println("1:お茶 2:スポーツドリンク 3:コーヒー");
		button = KeyBoard.readInt();
		switch(button){
			case 1:
				if(tea>=1 && this.inputamount>=110){
					tea = tea - 1;
					this.inputamount = this.inputamount - 110;
					System.out.println("コーヒーを1本購入しました");
				}else if(this.inputamount<110){
					System.out.println("お金が足りません");
				}else{
					System.out.println("在庫切れです");
				}
				break;
			case 2:
				if(sportsdrink>=1 && this.inputamount>=130){
					sportsdrink = sportsdrink -1;
					this.inputamount = this.inputamount - 130;
					System.out.println("スポーツドリンクを1本購入しました");
				}else if(this.inputamount<130){
					System.out.println("お金が足りません");
				}else{
					System.out.println("在庫切れです");
				}
				break;
			case 3:
				if(coffee>=1 && this.inputamount>=120){
					coffee = coffee - 1;
					this.inputamount = this.inputamount - 120;
					System.out.println("お買い上げありがとうございます");
				}else if(inputamount<120){
					System.out.println("お金が足りません");
				}else{
					System.out.println("在庫切れです");
				}
				break;
			default:
				System.out.println("1から3を選んでください");
				break;
		}
	}

	public void refund(){
		System.out.println("おつりは"+this.inputamount+"円です");
		System.out.println("ご利用ありがとうございました");
	}

}