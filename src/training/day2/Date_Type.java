package training.day2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Type {
	
	private Date aDate;
	private Date yesterday;
	private Date dateOfBrith;
	
	
	
	public Date getaDate() {
		return aDate;
	}



	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}



	public Date getYesterday() {
		return yesterday;
	}



	public void setYesterday(Date yesterday) {
		this.yesterday = yesterday;
	}



	public Date getDateOfBrith() {
		return dateOfBrith;
	}



	public void setDateOfBrith(Date dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}



	public static void main (String[] args) {
		
		Date_Type dType = new Date_Type();
		
		

		
		dType.setaDate(new Date());
		dType.setDateOfBrith(new Date (87, 00, 27));
		dType.setYesterday(new Date("12-Mar-2019"));
		
		System.out.println(dType.getaDate());
		System.out.println(dType.getDateOfBrith());
		System.out.println(dType.getYesterday());
		
		String pattern = "yyyy-MM-dd";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(dType.getDateOfBrith());
		System.out.println(date);
		
	}

}


/*
 * 
 * 
y - Year (1996; 96)
Y - Week Year (2009; 09)
M - Month in year (July; Jul; 07)
w - Week in year (27)
W - Week in month (2)
D - Day in year (189)
d - Day in month (10)
F - Day of week in month (2)
E - Day name in week (Tuesday; Tue)
u - Day number of week (1 = Monday, ..., 7 = Sunday)
a - AM/PM marker
H - Hour in day (0-23)
k - Hour in day (1-24)
K - Hour in am/pm (0-11)
h - Hour in am/pm (1-12)
m - Minute in hour (30)
s - Second in minute (55)

 * */
