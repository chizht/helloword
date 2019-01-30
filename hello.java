System.out.println("时区偏移 = "+hOffset);

    /**
     *  从一个<code>java.util.Date</code>对象得到一个表示该日期的临时<code>Calendar</code>对象.
     *  该对象只作为临时使用。
     *  @param  date <code>java.util.Date</code>对象
     *  @return 表示 date 的 <code>Calendar</code>对象.
     */
    protected static Calendar getStaticCalendars(java.util.Date date)
    {
       // if(staticCal==null) staticCal = newGregorianCalendar();//TimeZone.getDefault());
        if( date!=null )
            staticCal.setTime(date);
        else
        	staticCal.setTimeInMillis(System.currentTimeMillis());  // 2011-3-26 : 加
        return staticCal;
        //utcCal = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        //defaultCenturyStart = staticCal.get(Calendar.YEAR) - 80;
    }