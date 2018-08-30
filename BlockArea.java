import java.util.Arrays;

public class BlockArea {
	String  name;       //名前　例：関東、関西、北海道
	Tower[ ]  towers;    //本インスタンスに存在するタワー群
	public BlockArea(String name, Tower[] towers) {
		super();
		this.name = name;
		this.towers = towers;
	}
	@Override
	public String toString() {
		return "BlockArea [名前=" + name + ",個数="+this.towers.length+ ",高さ平均="+getAverageHeight() +", towers=" + Arrays.toString(towers) + "]";
	}
	public double getAverageHeight() {
		int s=0;
		for (Tower t:this.towers) {
			s=s+t.height;
		}
		return (double)s/this.towers.length;
	}

}
