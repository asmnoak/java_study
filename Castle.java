
public class Castle {
	String  name;          //名前
	String  location;        //所在地
	int  height;             //高さ（単位　m）
	String	 master;      //城主

	public Castle(String name, String location, int height, String master) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.master = master;
	}

	@Override
	public String toString() {
		final String CN="城";
		return CN+" [名前=" + name + ", 所在地=" + location + ", 高さ=" + height + ", 城主=" + master + "]";
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
		// TODO 自動生成されたメソッド・スタブ
		Castle c1=new Castle("江戸城", "東京都千代田区",58,"徳川家康");
		Castle c2=new Castle("小田原城", "神奈川県小田原市",39,"北条氏康");
		c1.show();
		c2.show();
		System.out.println(c1.name+"の高さは"+c2.name+"の高さと比べ、"+c1.compareCastle(c2));

	}

}
