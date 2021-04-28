package edu.hrbeu.TouchEventDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class TouchEventDemoActivity extends Activity {
	
	TextView labelView = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView touchView = (TextView)findViewById(R.id.touch_area);
        labelView = (TextView)findViewById(R.id.event_label);
        final TextView historyView = (TextView)findViewById(R.id.history_label);
        
        touchView.setOnTouchListener(new View.OnTouchListener(){
        	 @Override
        	 public boolean onTouch(View v, MotionEvent event) {
        	      int action = event.getAction();
        	      switch (action) {
        	        case (MotionEvent.ACTION_DOWN): 
        	        	Display("ACTION_DOWN",event);
        	        	break;
        	        case (MotionEvent.ACTION_UP): 
        	        	int historySize = ProcessHistory(event);
        	        	historyView.setText("��ʷ��������"+historySize);
        	        	Display("ACTION_UP",event);   
        	        	break;
        	        case (MotionEvent.ACTION_MOVE): 
        	        	Display("ACTION_MOVE",event);
        	        	break;
        	      }
        	      
        	      return true;
        	    }
        });
    
    }
    
    private void Display(String eventType, MotionEvent event){
    	int x = (int)event.getX();
    	int y = (int)event.getY();
    	float pressure = event.getPressure();
    	float size = event.getSize();
    	int RawX = (int)event.getRawX();
    	int RawY = (int)event.getRawY();

    	String msg = "";
    	msg += "�¼����ͣ�" + eventType + "\n";
    	msg += "������꣺"+String.valueOf(x)+","+String.valueOf(y)+"\n";
    	msg += "�������꣺"+String.valueOf(RawX)+","+String.valueOf(RawY)+"\n";
    	msg += "����ѹ����"+String.valueOf(pressure)+"��  ";
    	msg += "����ߴ磺"+String.valueOf(size)+"\n";
    	labelView.setText(msg);
    }
    
    private int ProcessHistory(MotionEvent event)
    {
    	int historySize = event.getHistorySize();
    	for (int i = 0; i < historySize; i++) {
    		long time = event.getHistoricalEventTime(i);
    		float pressure = event.getHistoricalPressure(i);
    		float x = event.getHistoricalX(i);
    		float y = event.getHistoricalY(i);
    		float size = event.getHistoricalSize(i);
    		
    		// �������......
    	}        
    	
    	return historySize;
    }
   
}