package ch08_1;

public class VolumeEx {
	public static void main(String[] args) {
		// �������̽��� ����ص� ���ó�� �迭�� ����� �ѹ��� ó���� ����
		// ���� �ٸ� Ŭ������ ���踦 �ξ���
		Volume[] vols = new Volume[3];
		vols[0] = new Radio();
		vols[1] = new TV();
		vols[2] = new Speaker();
		
		for (Volume vol : vols) {
			vol.volumeUp();
			vol.volumeDown();
		}
	}
}
