package com.example.mvpapi.model;

public class ResponseApi{

	private Data data;

	private String today;

	private String status;

//	public ResponseApi(Data data1, String sToday, String sTatus){
//		this.data = data1;
//		this.today = sToday;
//		this.status = sTatus;
//	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setToday(String today){
		this.today = today;
	}

	public String getToday(){
		return today;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseApi{" + 
			"data = '" + data + '\'' + 
			",today = '" + today + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}

//	public int size() {
//		return 0;
//	}
//
//	public float get(int i) {
//		return 0;
//	}
}