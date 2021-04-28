package edu.hrbeu.ActionBar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ActionBarActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    	TextView label = (TextView)findViewById(R.id.label);
    	switch(item.getItemId())
    	{
    	  case R.id.main_menu_0:
          	label.setText("��ӡ���˵�ID��" + item.getItemId());
              return true;
          case R.id.main_menu_1:
          	label.setText("�½����˵�ID��" + item.getItemId());
              return true;
          case R.id.main_menu_2:
          	label.setText("�ʼ����˵�ID��" + item.getItemId());
              return true;
          case R.id.main_menu_3:
          	label.setText("���ã��˵�ID��" + item.getItemId());
              return true;
          case R.id.main_menu_4:
          	label.setText("���ģ��˵�ID��" + item.getItemId());
              return true;
    	}
 	
    	return false;
    }

}