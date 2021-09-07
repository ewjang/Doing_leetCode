package mergesort;

public class Solution {

	public static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length - 1);// ������ ���� �迭, �ӽ� �迭, startidx, endidx
	}

	public static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2; // 4
			mergeSort(arr, tmp, start, mid);

			mergeSort(arr, tmp, mid + 1, end); // !!
			merge(arr, tmp, start, mid, end); // �̹� ������ �� ���¿��� merge�� ����

		}
	}

	public static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;// ù�迭�� ù�ε���
		int part2 = mid + 1; // �ι�°�迭�� ù�ε���
		int index = start;
		while (part1 <= mid && part2 <= end) {
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		// ������ ����µ� ���ʹ迭�� �����Ͱ� ���� ��츦 ���
		// �ݴ�� ������ ����µ� ���ʹ迭�� �����Ͱ� ���� ���� �Ű� �� �ʿ� x �̹� �ڸ� ����.
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}

	}

	public static void printArr(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 3, 9, 4, 7, 2, 5, 0, 8, 1, 6 };
		printArr(arr);
		mergeSort(arr);
		printArr(arr);
	}

}
