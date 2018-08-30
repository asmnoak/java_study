
public class Tower {
	String  name;          //名前
	String  location;      //所在地
	int  height;           //高さ（単位　m）
	int  completion;       //竣工年（完成した年[西暦年]）

	public Tower(String name, String location, int height, int completion) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.completion = completion;
	}

	@Override
	public String toString() {
		final String TW="タワー";
		return TW+" [名前=" + name + ", 所在地=" + location + ", 高さ=" + height + ", 竣工年=" + completion
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
		t1=new Tower("東京タワー", "東京都港区",333,1958);
		t2=new Tower("東京スカイツリー", "東京都墨田区",634,2012);
		//System.out.println(t1);
		t1.show();
		t2.show();
		System.out.println(t1.name+"の高さは"+t2.name+"の高さと比べ、"+t1.compareTower(t2));
		System.out.println(t1.name+"の竣工年は"+t2.name+"の竣工年と比べ、"+t1.compareCompletion(t2));
		System.out.println("------");
		Tower[ ] towers1 = new Tower[2];
		towers1[0]=new Tower("東京タワー", "東京都港区",333,1958);
		towers1[1]=new Tower("東京スカイツリー", "東京都墨田区",634,2012);
		String  name  =  "関東";
		BlockArea b1 = new BlockArea(name, towers1);
		System.out.println(b1);
		//System.out.println(b1.getAverageHeight());
		Tower[ ] towers2 = new Tower[3];
		towers2[0]=new Tower("通天閣", "大阪市浪速区",103,1956);
		towers2[1]=new Tower("京都タワー","京都市下京区",131,1964);
		towers2[2]=new Tower("神戸ポートタワー","神戸市中央区",108,1963 );
		BlockArea b2 = new BlockArea("関西", towers2);
		System.out.println(b2);
		System.out.println(b1.towers[0].name+"の高さは"+b2.towers[1].name+"の高さと比べ、"+b1.towers[0].compareTower(b2.towers[1]));
		System.out.println(b1.towers[1].name+"の高さは"+b2.towers[2].name+"の高さと比べ、"+b1.towers[1].compareTower(b2.towers[2]));
		//System.out.println(b2.getAverageHeight());
	}

}
