System.out.println("ʱ��ƫ�� = "+hOffset);

    /**
     *  ��һ��<code>java.util.Date</code>����õ�һ����ʾ�����ڵ���ʱ<code>Calendar</code>����.
     *  �ö���ֻ��Ϊ��ʱʹ�á�
     *  @param  date <code>java.util.Date</code>����
     *  @return ��ʾ date �� <code>Calendar</code>����.
     */
    protected static Calendar getStaticCalendars(java.util.Date date)
    {
       // if(staticCal==null) staticCal = newGregorianCalendar();//TimeZone.getDefault());
        if( date!=null )
            staticCal.setTime(date);
        else
        	staticCal.setTimeInMillis(System.currentTimeMillis());  // 2011-3-26 : ��
        return staticCal;
        //utcCal = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        //defaultCenturyStart = staticCal.get(Calendar.YEAR) - 80;
    }