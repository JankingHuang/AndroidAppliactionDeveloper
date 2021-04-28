package edu.hrbeu.ActivityLifeCycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityLifeCycleActivity extends Activity {
    private static String TAG = "LIFECYCLE";
    @Override  //��ȫ�������ڿ�ʼʱ�����ã���ʼ��Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "(1) onCreate()");
        
        Button button = (Button)findViewById(R.id.btn_finish);
        
        button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
          finish();
          }
        });

    }

    @Override  //�����������ڿ�ʼʱ�����ã����û�������б�Ҫ�ĸ��� 
    public void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }

    @Override  //��onStart()�󱻵��ã����ڻָ�onSaveInstanceState()������û�������Ϣ
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "(3) onRestoreInstanceState()");
    }

    @Override  //�ڻ�������ڿ�ʼʱ�����ã��ָ���onPause()ֹͣ�����ڽ�����µ���Դ
    public void onResume() {
        super.onResume();
        Log.i(TAG, "(4) onResume()");
    }
    
    @Override  // ��onResume()�󱻵��ã����������Ϣ
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "(5) onSaveInstanceState()");
    }
    
    @Override  //�����½��������������ǰ�����ã������������Ҫ�ĸ�����Ϣ
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "(6) onRestart()");
    }

    @Override  //�ڻ�������ڽ���ʱ�����ã���������־õ����ݻ��ͷ�ռ�õ���Դ��
    public void onPause() {
        super.onPause();
        Log.i(TAG, "(7) onPause()");
    }
    
    @Override //�ڿ����������ڽ���ʱ�����ã�һ����������־õ����ݻ��ͷ�ռ�õ���Դ
    public void onStop() {
        super.onStop();
        Log.i(TAG, "(8) onStop()");
    }
    
    @Override //����ȫ�������ڽ���ʱ�����ã��ͷ���Դ�������̡߳��������ӵ�
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "(9) onDestroy()");
    }
}
