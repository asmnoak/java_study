
public class Tower {
	String  name;          //���O
	String  location;      //���ݒn
	int  height;           //�����i�P�ʁ@m�j
	int  completion;       //�v�H�N�i���������N[����N]�j

	public Tower(String name, String location, int height, int completion) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.completion = completion;
	}

	@Override
	public String toString() {
		final String TW="�^���[";
		return TW+" [���O=" + name + ", ���ݒn=" + location + ", ����=" + height + ", �v�H�N=" + completion
				+ "]";
	}
	public void show() {
		System.out.println(this);
	}
    public int compareTower(Tower other) {
    	int k=0;
    	if (this.height==other.height) k=0;
    	else if (this.height<other.height) k=-1;
    	else k=1;

    	return k;
    }
    public int compareCompletion(Tower other) {
    	int k=0;
    	if (this.completion==other.completion) k=0;
    	else if (this.completion<other.completion) k=-1;
    	else k=1;

    	return k;
    }
	public static void main(String[] args) {
		Tower t1,t2;
		t1=new Tower("�����^���[", "�����s�`��",333,1958);
		t2=new Tower("�����X�J�C�c���[", "�����s�n�c��",634,2012);
		//System.out.println(t1);
		t1.show();
		t2.show();
		System.out.println(t1.name+"�̍�����"+t2.name+"�̍����Ɣ�ׁA"+t1.compareTower(t2));
		System.out.println(t1.name+"�̏v�H�N��"+t2.name+"�̏v�H�N�Ɣ�ׁA"+t1.compareCompletion(t2));
		System.out.println("------");
		Tower[ ] towers1 = new Tower[2];
		towers1[0]=new Tower("�����^���[", "�����s�`��",333,1958);
		towers1[1]=new Tower("�����X�J�C�c���[", "�����s�n�c��",634,2012);
		String  name  =  "�֓�";
		BlockArea b1 = new BlockArea(name, towers1);
		System.out.println(b1);
		//System.out.println(b1.getAverageHeight());
		Tower[ ] towers2 = new Tower[3];
		towers2[0]=new Tower("�ʓV�t", "���s�Q����",103,1956);
		towers2[1]=new Tower("���s�^���[","���s�s������",131,1964);
		towers2[2]=new Tower("�_�˃|�[�g�^���[","�_�ˎs������",108,1963 );
		BlockArea b2 = new BlockArea("�֐�", towers2);
		System.out.println(b2);
		System.out.println(b1.towers[0].name+"�̍�����"+b2.towers[1].name+"�̍����Ɣ�ׁA"+b1.towers[0].compareTower(b2.towers[1]));
		System.out.println(b1.towers[1].name+"�̍�����"+b2.towers[2].name+"�̍����Ɣ�ׁA"+b1.towers[1].compareTower(b2.towers[2]));
		//System.out.println(b2.getAverageHeight());
	}

}
