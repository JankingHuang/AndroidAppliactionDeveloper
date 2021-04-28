package edu.hrbeu.KeyEventDemo;


import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class KeyEventDemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        EditText entryText = (EditText)findViewById(R.id.entry);
        final CheckBox checkBox = (CheckBox)findViewById(R.id.block);
        final TextView labelView = (TextView)findViewById(R.id.label);
        entryText.setOnKeyListener(new OnKeyListener(){
			@Override
			public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {

				int metaState = keyEvent.getMetaState();
				int unicodeChar = keyEvent.getUnicodeChar();
				String msg = "";
				msg +="��������:" + String.valueOf(keyEvent.getAction())+"\n";
				msg +="��������:" + String.valueOf(keyCode)+"\n";
				msg +="�����ַ�:" + (char)unicodeChar+"\n";
				msg +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
				msg +="�ظ�����:" + String.valueOf(keyEvent.getRepeatCount())+"\n";
				msg +="���ܼ�״̬:" + String.valueOf(metaState)+"\n";
				msg +="Ӳ������:" + String.valueOf(keyEvent.getScanCode())+"\n";
				msg +="������־:" + String.valueOf(keyEvent.getFlags())+"\n";
				labelView.setText(msg);
		
				if (checkBox.isChecked())
					return true;
				else
					return false;
			}      	
        });  
    }
}