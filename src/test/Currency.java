package test;

import java.util.ArrayList;

public class Currency {

	public ArrayList<Datum> data;
	public Meta meta;
	public ArrayList<Object> rels;

	public class Datum {
		public int id;
		public String name;
		public ArrayList<Currency> currencies;
	}

	public class Meta {
		public int total;
	}

	public class Root {

	}

}
