package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T t = null;
	T tI = null;
	T tII = null;
	T tIII = null;
	T tIV = null;
	int vals = 0;
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		T finder = null;
		if (loc == 0) {
			finder = t;
		}else if (loc == 1) {
			finder = tI;
		}else if (loc == 2) {
			finder = tII;
		}else if (loc == 3) {
			finder = tIII;
		}else if (loc == 4) {
			finder = tIV;
		}
		return finder;
	}
	
	public void add(T val) {
		if (vals == 0) {
			t = val;
		}else if (vals == 1) {
			tI = val;
		}else if (vals == 2) {
			tII = val;
		}else if (vals == 3) {
			tIII = val;
		}else if (vals == 4) {
			tIV = val;
		}
		vals++;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc == 0) {
			tIV = tIII;
			tIII = tII;
			tII = tI;
			tI = t;
			t = val;
		}else if (loc == 1) {
			tIV = tIII;
			tIII = tII;
			tII = tI;
			tI = val;
		}else if (loc == 2) {
			tIV = tIII;
			tIII = tII;
			tII = val;
		}else if (loc == 3) {
			tIV = tIII;
			tIII = val;
		}else if (loc == 4) {
			tIV = val;
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc == 0) {
			t = val;
		}else if (loc == 1) {
			tI = val;
		}else if (loc == 2) {
			tII = val;
		}else if (loc == 3) {
			tIII = val;
		}else if (loc == 4) {
			tIV = val;
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc == 0) {
			t = tI;
			tI = tII;
			tII = tIII;
			tIII = tIV;
			tIV = null;
		}else if (loc == 1) {
			tI = tII;
			tII = tIII;
			tIII = tIV;
			tIV = null;
		}else if (loc == 2) {
			tII = tIII;
			tIII = tIV;
			tIV = null;
		}else if (loc == 3) {
			tIII = tIV;
			tIV = null;
		}else if (loc == 4) {
			tIV = null;
		}
		vals--;
	}
	
	public boolean contains(T val) {
		if (t != val && tI != val && tII != val && tIII != val && tIV != val) {
			return false;
		}
		return true;
	}

	public int size() {
		return vals;
	}
}