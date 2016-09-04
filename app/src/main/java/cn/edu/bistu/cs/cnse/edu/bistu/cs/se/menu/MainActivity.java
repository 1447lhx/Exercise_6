package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.menu;

import android.app.AlertDialog;
 import android.app.Dialog;
 import android.content.DialogInterface;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.ContextMenu;
 import android.view.LayoutInflater;
 import android.view.Menu;
 import android.view.MenuItem;
 import android.view.View;
 import android.widget.Button;
import android.widget.EditText;
 import android.widget.PopupMenu;
 import android.widget.Toast;
public class MainActivity extends AppCompatActivity
        implements PopupMenu.OnMenuItemClickListener {
    private Button btn_Context;
    private Button btn_Pop;
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
                 setContentView(R.layout.content_main);
                 btn_Context = (Button) findViewById(R.id.context_menu);
                 registerForContextMenu(btn_Context);
                btn_Pop= (Button) findViewById(R.id.pop_menu);
                btn_Pop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            PopupMenu popMenu = new PopupMenu(MainActivity.this, view);
                            popMenu.setOnMenuItemClickListener(MainActivity.this);
                                 popMenu.inflate(R.menu.menu3);
                                popMenu.show();
                             }
                });}
    public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.menu, menu);
                return super.onCreateOptionsMenu(menu);
    }

    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo info) {
               getMenuInflater().inflate(R.menu.menu2, menu);
               super.onCreateContextMenu(menu,v,info);
           }

    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
           }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
            }
    @Override
        public boolean onMenuItemClick(MenuItem menuItem) {

        Toast.makeText(this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                 return true;
            }
     }