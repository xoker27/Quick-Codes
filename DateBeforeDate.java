import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateBeforeDate {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		String m_;
		String D;
		int y_;
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMMM yyyy");
		sc.nextLine();
		while(T-->0) {
			D=sc.nextLine();
		    Date date;
		    m_="";	
			//System.out.println("dsf");
			date = sdf.parse(D);
		    Calendar calendar = Calendar.getInstance();
		    calendar.setTime(date);
		    calendar.add(Calendar.DATE, -1);
		    Date yesterday = calendar.getTime();
		    //System.out.println(yesterday.getMonth());
		    switch(yesterday.getMonth()) {
			case 0:
				m_="January";
				break;
			case 1:
				m_="February";
				break;
			case 2:
				m_="March";
				break;
			case 3:
				m_="April";
				break;
			case 4:
				m_="May";
				break;
			case 5:
				m_="June";
				break;	
			case 6:
				m_="July";
				break;
			case 7:
				m_="August";
				break;
			case 8:
				m_="September";
				break;
			case 9:
				m_="October";
				break;
			case 10:
				m_="November";
				break;
			case 11:
				m_="December";
				break;
				
			}
		    if(date.getDate()==1 && date.getMonth()==0)
		    	y_=date.getYear()-1;
		    else 
		    	y_=date.getYear();
		    System.out.println(yesterday.getDate()+" "+m_+" "+y_);
		}
	}
}
