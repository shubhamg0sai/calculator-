public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText 11, 12;
    TextView ti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);
        b1 = findViewById(R.id.button1);
        t1 = findViewById(R.id.text1);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().length()==0);
                int p = Integer.parseInt(n1.getText().toString());
                int m = Integer.parseInt(n2.getText().toString());
                int sum = p + m;
                ti.setText(String.valueOf(sum));

            }
        });
