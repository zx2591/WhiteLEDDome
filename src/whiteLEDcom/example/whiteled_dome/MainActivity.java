package whiteLEDcom.example.whiteled_dome;


import android.os.Bundle;
import android.app.Activity;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements
	SeekBar.OnSeekBarChangeListener{
	
	SeekBar	color_seekBar;
	SeekBar	bright_seekBar;
	TextView color_TextView;
	TextView bright_TextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		color_seekBar=(SeekBar) findViewById(R.id.seek_color);
		color_seekBar.setOnSeekBarChangeListener(this);
		bright_seekBar=(SeekBar) findViewById(R.id.seekBar_bright);
		bright_seekBar.setOnSeekBarChangeListener(this);
		color_TextView=(TextView)findViewById(R.id.textView_color);
		bright_TextView=(TextView)findViewById(R.id.textView_bright);		
	}
	
	@Override
	//在拖动中--即值在改变
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		//progress为当前数值的大小		
		if(seekBar.equals(color_seekBar))
		{	color_TextView.setText("Color:" + color_seekBar.getProgress());	}
		else if(seekBar.equals(bright_seekBar))
		{	bright_TextView.setText("Bright:" + bright_seekBar.getProgress());	}		
	}
	
	@Override
	//在拖动中会调用此方法
	public void onStartTrackingTouch(SeekBar seekBar) {
		
	}
	
	@Override
	//停止拖动
	public void onStopTrackingTouch(SeekBar seekBar) {
		
	
	}

}
