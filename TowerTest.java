
public class TowerTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Tower [] ta=new Tower[2];
		ta[0]=new Tower("東京タワー", "東京都港区",333,1958);;
		ta[1]=new Tower("東京スカイツリー", "東京都墨田区",634,2012);;
		//System.out.println(ta[0]);
		//System.out.println(ta[1]);
		ta[0].show();
		ta[1].show();
		System.out.println("タワー数："+ta.length);

	}

}
