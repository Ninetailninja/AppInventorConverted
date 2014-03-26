package ctec.appinventorConverted.activity;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class AppInventorActivity extends Activity 
{
	private Button babyButton, randomButton, batmanButton, chuckButton, numaButton, minionButton, goferButton, bruceButton;
	private ImageView image;
	private Drawable drawable;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_inventor);
		
		babyButton = (Button)findViewById(R.id.button1);
		randomButton = (Button)findViewById(R.id.button2);
		chuckButton = (Button)findViewById(R.id.button3);
		batmanButton = (Button)findViewById(R.id.button5);
		bruceButton = (Button)findViewById(R.id.button6);
		goferButton = (Button)findViewById(R.id.button7);
		numaButton = (Button)findViewById(R.id.button8);
		minionButton = (Button)findViewById(R.id.button9);
		image = (ImageView)findViewById(R.id.picture);
		
		babyButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.baby);
			}
		});
		
		randomButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.random);
			}
		});
		
		batmanButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.batman);
			}
		});
		
		chuckButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.chucknorris);
			}
		});
		
		numaButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.numa);
			}
		});
		
		minionButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.minions);
			}
		});
		
		goferButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.gofer);
			}
		});
		
		bruceButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View view)
			{
				image.setImageResource(R.drawable.brucelee);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_inventor, menu);
		return true;
	}

}
