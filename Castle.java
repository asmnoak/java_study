
public class Castle {
	String  name;          //���O
	String  location;        //���ݒn
	int  height;             //�����i�P�ʁ@m�j
	String	 master;      //���

	public Castle(String name, String location, int height, String master) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.master = master;
	}

	@Override
	public String toString() {
		final String CN="��";
		return CN+" [���O=" + name + ", ���ݒn=" + location + ", ����=" + height + ", ���=" + master + "]";
	}
	void show() {
		System.out.println(this);
	}
    public int compareCastle(Castle other) {
    	int k=0;
    	if (this.height==other.height) k=0;
    	else if (this.height<other.height) k=-1;
    	else k=1;

    	return k;
    }

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Castle c1=new Castle("�]�ˏ�", "�����s���c��",58,"����ƍN");
		Castle c2=new Castle("���c����", "�_�ސ쌧���c���s",39,"�k�����N");
		c1.show();
		c2.show();
		System.out.println(c1.name+"�̍�����"+c2.name+"�̍����Ɣ�ׁA"+c1.compareCastle(c2));

	}

}
