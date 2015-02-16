package br.com.tairoroberto.caixaslistagemcaixasselecao;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class TimeFavoritoBean {
	private String time;
	private String timelistbox;
	private String[] times;
	private String[] timeslistbox;
	
	public void escolher() {
		System.out.println("Time selecionado: "+ this.getTime());
	}
	
	public void escolherListBox() {
		System.out.println("Time selecionado: "+ this.getTime());
	}
	
	public void escolherTimes() {
		System.out.println("-----------------------");
		System.out.println("Times selecionados");
		for (String time : times) {
			System.out.println("Time: "+time);
		}
	}
	
	public void escolherTimesListBox() {
		System.out.println("-----------------------");
		System.out.println("Times selecionados");
		for (String time : timeslistbox) {
			System.out.println("Time: "+time);
		}
	}
		
	//getters and setters
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTimelistbox() {
		return timelistbox;
	}

	public void setTimelistbox(String timelistbox) {
		this.timelistbox = timelistbox;
	}

	public String[] getTimes() {
		return times;
	}

	public void setTimes(String[] times) {
		this.times = times;
	}

	public String[] getTimeslistbox() {
		return timeslistbox;
	}

	public void setTimeslistbox(String[] timeslistbox) {
		this.timeslistbox = timeslistbox;
	}


	
	
}
