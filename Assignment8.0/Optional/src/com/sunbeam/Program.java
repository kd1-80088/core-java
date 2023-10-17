//package com.sunbeam;
//
//import java.util.Scanner;
//
//class Players {
//	public static int batterTotalRuns(Player arr[]) {
//		int runs = 0;
//		for (Player ele : arr) {
//			
//				Batter b = (Batter) ele;
//				runs += b.getRuns();
////			
//		}
//		return runs;
//	}
//
//	public static int bowlerTotalWickets(Player arr[]) {
//		int wickets = 0;
//		for (Player ele : arr) {
//			if (ele instanceof Bowler) {
//				Bowler b = (Bowler) ele;
//				wickets += b.getWicket();
//			}
//		}
//		return wickets;
//	}
//
//	public static int countBatters(Player arr[]) {
//		int count = 0;
//		for (Player ele : arr) {
//			if (ele instanceof Batter) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static int countBowlers(Player arr[]) {
//		int count = 0;
//		for (Player ele : arr) {
//			if (ele instanceof Bowler) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static Player maxRunBatter(Player[] arr) {
//		Player max = 0;
//
//		for (Player ele : arr) {
//			if (ele instanceof Batter) {
//				Batter b = (Batter) ele;
//				if (b.getRuns() > max) {
//					max = b.getRuns();
//				}
//			}
//		}
//		return max;
//	}
//
//	public static Player maxWicketBowler(Player[] arr) {
//		Player min = 0;
//
//		for (Player ele : arr) {
//			if (ele instanceof Batter) {
//				Batter b = (Batter) ele;
//				if (b.getRuns() < min) {
//					min = b.getRuns();
//				}
//			}
//		}
//		return min;
//
//	}
//}
//
//public class Program {
//
//	public static void main(String[] args) {
//		Player arr[] = new Player[2];
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = new Cricketer();
//			arr[i].acceptData();
//		}
//		for (Player ele : arr) {
//			System.out.println(ele.toString());
//		}
//
//	}
//
//}
