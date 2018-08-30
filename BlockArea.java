import java.util.Arrays;

public class BlockArea {
	String  name;       //���O�@��F�֓��A�֐��A�k�C��
	Tower[ ]  towers;    //�{�C���X�^���X�ɑ��݂���^���[�Q
	public BlockArea(String name, Tower[] towers) {
		super();
		this.name = name;
		this.towers = towers;
	}
	@Override
	public String toString() {
		return "BlockArea [���O=" + name + ",��="+this.towers.length+ ",��������="+getAverageHeight() +", towers=" + Arrays.toString(towers) + "]";
	}
	public double getAverageHeight() {
		int s=0;
		for (Tower t:this.towers) {
			s=s+t.height;
		}
		return (double)s/this.towers.length;
	}

}
