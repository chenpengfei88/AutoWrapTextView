# AutoWrapTextView
自动换行解决中英文文本排版TextView

# 使用方法

布局

```
 <com.free.autowraptextview.widget.AutoWrapTextView
        android:id="@+id/awtextview"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
  />
```
        
public class MainActivity extends AppCompatActivity {

    private String text = "密码：jokG5456KL542356jsjdherGHS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AutoWrapTextView) findViewById(R.id.awtextview)).setText(text);

    }
}

# 效果

 ![image](https://github.com/chenpengfei88/AutoWrapTextView/blob/master/app/src/main/res/drawable/atxgt.png)
 
# 自定义属性

    <declare-styleable name="AutoWrapTextViewStyle">
        <attr name="paddingLeft" format="dimension" />
        <attr name="paddingTop" format="dimension" />
        <attr name="paddingRight" format="dimension" />
        <attr name="paddingBottom" format="dimension" />
        <attr name="textSize" format="dimension" />
        <attr name="textColor" format="color" />
        <attr name="lineSpacingExtra" format="integer" />
    </declare-styleable>


