class VendingMachine{

	private int inputamount; //�������z
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
		System.out.println("�����𓊓����Ă�������");
		this.inputamount = KeyBoard.readInt();	
	}

	public void buy(){
		System.out.println("1:���� 2:�X�|�[�c�h�����N 3:�R�[�q�[");
		button = KeyBoard.readInt();
		switch(button){
			case 1:
				if(tea>=1 && this.inputamount>=110){
					tea = tea - 1;
					this.inputamount = this.inputamount - 110;
					System.out.println("�R�[�q�[��1�{�w�����܂���");
				}else if(this.inputamount<110){
					System.out.println("����������܂���");
				}else{
					System.out.println("�݌ɐ؂�ł�");
				}
				break;
			case 2:
				if(sportsdrink>=1 && this.inputamount>=130){
					sportsdrink = sportsdrink -1;
					this.inputamount = this.inputamount - 130;
					System.out.println("�X�|�[�c�h�����N��1�{�w�����܂���");
				}else if(this.inputamount<130){
					System.out.println("����������܂���");
				}else{
					System.out.println("�݌ɐ؂�ł�");
				}
				break;
			case 3:
				if(coffee>=1 && this.inputamount>=120){
					coffee = coffee - 1;
					this.inputamount = this.inputamount - 120;
					System.out.println("�������グ���肪�Ƃ��������܂�");
				}else if(inputamount<120){
					System.out.println("����������܂���");
				}else{
					System.out.println("�݌ɐ؂�ł�");
				}
				break;
			default:
				System.out.println("1����3��I��ł�������");
				break;
		}
	}

	public void refund(){
		System.out.println("�����"+this.inputamount+"�~�ł�");
		System.out.println("�����p���肪�Ƃ��������܂���");
	}

}