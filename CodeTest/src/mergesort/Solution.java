package mergesort;

public class Solution {

	public static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length - 1);// 정렬할 공간 배열, 임시 배열, startidx, endidx
	}

	public static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2; // 4
			mergeSort(arr, tmp, start, mid);

			mergeSort(arr, tmp, mid + 1, end); // !!
			merge(arr, tmp, start, mid, end); // 이미 정렬이 된 상태에서 merge문 실행

		}
	}

	public static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;// 첫배열의 첫인덱스
		int part2 = mid + 1; // 두번째배열의 첫인덱스
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
		// 뒷쪽은 비었는데 앞쪽배열에 데이터가 남은 경우를 대비
		// 반대로 앞쪽은 비었는데 뒤쪽배열에 데이터가 남은 경우는 신경 쓸 필요 x 이미 자리 잡음.
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
