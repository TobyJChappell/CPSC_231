import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

class Sorter implements Runnable{
	private LinkedList<Integer> m_list;
	private int id;

	public Sorter(int ident, LinkedList<Integer> l){
		m_list = l;
		id = ident;
	}

	public void run(){
		Collections.sort(m_list);
	}

	public LinkedList<Integer> getList(){
		return m_list;
	}

	public void printList(){
		System.out.println("Printing list for Sorter : " + id);
		System.out.println(m_list);
	}
}

public class ParallelSortExample{
	private static final int LIST_SIZE = 10000;
	private static final int NUM_THREADS = 2;
	private Random rand;

	private LinkedList<Integer>[] randomLists;
	private int numThreads;

	private void populateRandomLists(){
		for(int i = 0; i < NUM_THREADS; ++i){
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int j = 0; j < LIST_SIZE; ++ j){
				list.add(rand.nextInt(1000000));
			}
			randomLists[i] = list;
		}
	}

	public ParallelSortExample(){
		randomLists = new LinkedList[NUM_THREADS];
		rand = new Random();
		System.out.println("Setting up lists of random ints");
		populateRandomLists();
		System.out.println("Setup Complete");
	}

	public LinkedList<Integer> getRandomList(int listNumber){
		return randomLists[listNumber];
	}

	public static void main(String[] args){
		try{
			ParallelSortExample psort = new ParallelSortExample();
			Sorter[] sorters = new Sorter[ParallelSortExample.NUM_THREADS];
			Thread[] threads = new Thread[ParallelSortExample.NUM_THREADS];

			for(int x = 0; x < NUM_THREADS; x++){
				sorters[x] = new Sorter(x, psort.getRandomList(x));
				threads[x] = new Thread(sorters[x]);
			}

			long start = java.lang.System.currentTimeMillis();

			for(int x = 0; x < NUM_THREADS; x++){
				threads[x].start();
			}

			for(int x = 0; x < NUM_THREADS; x++){
				threads[x].join();
			}

			long end = java.lang.System.currentTimeMillis();
			System.out.println("All Threads Complete");
			System.out.println("Sorting took: " + ((end-start)/1000.0) + " seconds");

			if(args.length > 0 && args[0].equals("--print")){
				for(int i = 0; i < ParallelSortExample.NUM_THREADS; ++i){
					sorters[i].printList();
				}
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
