package com.codinginflow.additionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mButtonAdd = findViewById(R.id.button_add);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = num1 + num2;

                mTextViewResult.setText(String.valueOf(sum));
            }
        });
    }
}














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
}
);








<h1>contact</h1>
<a href="https://www.instagram.com/shubhamg0sai/" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm4.615 6h-9.23c-.766 0-1.385.62-1.385 1.384v9.23c0 .766.619 1.386 1.385 1.386h9.23c.766 0 1.385-.62 1.385-1.385v-9.23c0-.765-.619-1.385-1.385-1.385zm-4.615 3.693c1.274 0 2.309 1.032 2.309 2.307s-1.035 2.307-2.309 2.307-2.307-1.033-2.307-2.307 1.033-2.307 2.307-2.307zm4.5 6.346c0 .255-.207.461-.461.461h-8.078c-.254 0-.461-.207-.461-.461v-5.039h.949c-.045.158-.078.32-.102.486-.023.168-.038.339-.038.514 0 2.04 1.652 3.693 3.691 3.693s3.691-1.653 3.691-3.693c0-.174-.015-.346-.039-.514-.023-.166-.058-.328-.102-.486h.95v5.039zm0-6.991c0 .255-.207.462-.461.462h-1.088c-.256 0-.461-.208-.461-.462v-1.087c0-.255.205-.461.461-.461h1.088c.254 0 .461.207.461.461v1.087z"/></svg></a>
&nbsp&nbsp&nbsp


<a href="https://github.com/ShuBhamg0sai" target="_blank"> <svg xmlns="http://www.w3.org/2001/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm0 6c-3.313 0-6 2.686-6 6 0 2.651 1.719 4.9 4.104 5.693.3.056.396-.13.396-.289v-1.117c-1.669.363-2.017-.707-2.017-.707-.272-.693-.666-.878-.666-.878-.544-.373.041-.365.041-.365.603.042.92.619.92.619.535.917 1.403.652 1.746.499.054-.388.209-.652.381-.802-1.333-.152-2.733-.667-2.733-2.965 0-.655.234-1.19.618-1.61-.062-.153-.268-.764.058-1.59 0 0 .504-.161 1.65.615.479-.133.992-.199 1.502-.202.51.002 1.023.069 1.503.202 1.146-.776 1.648-.615 1.648-.615.327.826.121 1.437.06 1.588.385.42.617.955.617 1.61 0 2.305-1.404 2.812-2.74 2.96.216.186.412.551.412 1.111v1.646c0 .16.096.347.4.288 2.383-.793 4.1-3.041 4.1-5.691 0-3.314-2.687-6-6-6z"/></svg></a>
&nbsp&nbsp&nbsp


<a href="https://www.facebook.com/aryanmukul" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm.021 17.824c-3.907 0-6.021-2.438-6.021-5.586 0-3.363 2.381-6.062 6.638-6.062 3.107 0 5.362 2.019 5.362 4.801 0 4.356-5.165 5.506-4.906 3.021-.354.555-.927 1.177-2.026 1.177-1.257 0-2.04-.92-2.04-2.403 0-2.222 1.461-4.1 3.19-4.1.829 0 1.399.438 1.638 1.11l.232-.816h1.169c-.122.416-1.161 4.264-1.161 4.264-.323 1.333.675 1.356 1.562.648 1.665-1.29 1.75-4.664-.499-6.071-2.411-1.445-7.897-.551-7.897 4.347 0 2.806 1.976 4.691 4.914 4.691 1.719 0 2.771-.465 3.648-.974l.588.849c-.856.482-2.231 1.104-4.391 1.104zm-1.172-7.153c-.357.67-.588 1.538-.588 2.212 0 1.805 1.761 1.816 2.626.12.356-.697.586-1.586.586-2.265 0-1.458-1.748-1.717-2.624-.067z"/></svg></a>
&nbsp&nbsp&nbsp&nbsp&nbsp


<a href="https://mobile.twitter.com/Shubhamg0sai" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm6.5 8.778c-.441.196-.916.328-1.414.388.509-.305.898-.787 1.083-1.362-.476.282-1.003.487-1.564.597-.448-.479-1.089-.778-1.796-.778-1.59 0-2.758 1.483-2.399 3.023-2.045-.103-3.86-1.083-5.074-2.572-.645 1.106-.334 2.554.762 3.287-.403-.013-.782-.124-1.114-.308-.027 1.14.791 2.207 1.975 2.445-.346.094-.726.116-1.112.042.313.978 1.224 1.689 2.3 1.709-1.037.812-2.34 1.175-3.647 1.021 1.09.699 2.383 1.106 3.773 1.106 4.572 0 7.154-3.861 6.998-7.324.482-.346.899-.78 1.229-1.274z"/></svg></a>
&nbsp&nbsp&nbsp&nbsp&nbsp


<a href="https://www.facebook.com/shubham.gosain.980" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm-2 10h-2v2h2v6h3v-6h1.82l.18-2h-2v-.833c0-.478.096-.667.558-.667h1.442v-2.5h-2.404c-1.798 0-2.596.792-2.596 2.308v1.692z"/></svg></a>
&nbsp&nbsp&nbsp



&nbsp&nbsp&nbsp
<a href="https://youtube.com/channel/UCB412-l6L5DsfEywMFFkBvw" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M8.326 6h.721l.493 1.851.458-1.851h.727l-.832 2.752v1.878h-.716v-1.878l-.851-2.752zm3.297 1.187c-.56 0-.931.37-.931.917v1.675c0 .602.314.916.931.916.511 0 .913-.342.913-.916v-1.675c0-.535-.398-.917-.913-.917zm.266 2.563c0 .186-.095.323-.266.323-.176 0-.277-.144-.277-.323v-1.589c0-.187.086-.326.265-.326.194 0 .278.134.278.326v1.589zm2.364-2.535v2.593c-.077.097-.25.256-.374.256-.135 0-.169-.093-.169-.23v-2.619h-.635v2.855c0 .337.103.61.443.61.192 0 .459-.1.734-.426v.377h.635v-3.416h-.634zm1.101 6.929c-.224 0-.271.158-.271.382v.329h.535v-.329c.001-.221-.046-.382-.264-.382zm-2.351.02l-.125.099v2.027l.144.115c.099.05.242.054.31-.034.034-.046.052-.121.052-.224v-1.68c0-.11-.021-.193-.064-.25-.074-.096-.211-.107-.317-.053zm2.413-2.598c-1.301-.089-5.533-.088-6.833 0-1.406.097-1.572.947-1.583 3.184.011 2.233.175 3.087 1.583 3.184 1.3.088 5.532.089 6.833 0 1.407-.096 1.573-.946 1.584-3.184-.011-2.233-.175-3.087-1.584-3.184zm-6.162 5.344h-.681v-3.77h-.705v-.64h2.091v.64h-.705v3.77zm2.424 0h-.605v-.359c-.111.132-.228.233-.348.302-.326.187-.773.183-.773-.477v-2.72h.604v2.494c0 .131.032.219.161.219.118 0 .282-.151.355-.244v-2.47h.605v3.255zm2.328-.675c0 .403-.15.716-.553.716-.222 0-.406-.081-.575-.292v.25h-.61v-4.409h.61v1.42c.137-.167.322-.304.538-.304.443 0 .59.374.59.815v1.804zm2.235-.876h-1.157v.614c0 .244.021.455.265.455.255 0 .271-.172.271-.455v-.226h.622v.244c0 .627-.269 1.007-.906 1.007-.577 0-.873-.421-.873-1.007v-1.46c0-.565.373-.957.919-.957.58 0 .86.369.86.957v.828zm-4.241-13.359c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12z"/></svg></a>
&nbsp&nbsp&nbsp&nbsp


<a href="https://open.spotify.com/user/31v5smb5lmmge4un34xwqqek6o2u?si=qTQp014dRTiSpQuVb_C9KQ&utm_source=copy-link" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 0c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm0 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0 3c-3.866 0-7 3.134-7 7s3.134 7 7 7 7-3.134 7-7-3.134-7-7-7zm3.21 10.096c-.125.207-.394.271-.6.146-1.643-1.005-3.712-1.232-6.149-.675-.235.053-.469-.094-.522-.328-.054-.235.092-.469.328-.523 2.666-.609 4.954-.347 6.799.78.205.126.27.395.144.6zm.857-1.906c-.158.257-.494.338-.751.18-1.881-1.156-4.75-1.491-6.975-.816-.289.088-.594-.075-.681-.363-.087-.289.076-.593.364-.681 2.542-.771 5.703-.398 7.863.93.257.158.338.494.18.75zm.074-1.984c-2.257-1.34-5.979-1.464-8.133-.81-.345.105-.711-.09-.816-.436-.105-.346.09-.712.436-.817 2.473-.75 6.583-.605 9.181.937.311.184.413.586.229.897-.185.311-.587.413-.897.229z"/></svg></a>
&nbsp&nbsp&nbsp&nbsp


<a href="https://www.snapchat.com/add/shubhamg0sai?share_id=FM7QTMPlXK8&locale=en-US" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12 2c5.514 0 10 4.486 10 10s-4.486 10-10 10-10-4.486-10-10 4.486-10 10-10zm0-2c-6.627 0-12 5.373-12 12s5.373 12 12 12 12-5.373 12-12-5.373-12-12-12zm-3.086 8.267c-.3.672-.181 1.876-.133 2.718-.324.179-.74-.136-.975-.136-.245 0-.538.161-.583.401-.033.173.044.425.6.645.215.085.727.185.845.464.166.392-.855 2.202-2.459 2.466-.126.02-.216.132-.209.259.028.488 1.121.678 1.605.754.05.067.09.35.153.566.028.097.102.212.291.212.246 0 .656-.19 1.369-.072.699.117 1.356 1.107 2.617 1.107 1.173 0 1.872-.996 2.545-1.107.389-.065.724-.044 1.098.029.257.05.488.079.562-.174.064-.219.104-.496.152-.561.48-.075 1.578-.265 1.606-.753.007-.127-.083-.239-.208-.259-1.577-.26-2.629-2.064-2.459-2.466.118-.278.626-.378.845-.464.407-.161.611-.358.606-.586-.006-.292-.357-.467-.616-.467-.264 0-.642.312-.949.143.048-.849.166-2.048-.133-2.719-.567-1.272-1.83-1.916-3.092-1.916-1.252-.001-2.506.633-3.078 1.916z"/></svg></a>
&nbsp&nbsp&nbsp&nbsp


<a href="https://www.t.me/shubhamg0sai" target="_blank"> <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24"><path d="M12,0c-6.627,0 -12,5.373 -12,12c0,6.627 5.373,12 12,12c6.627,0 12,-5.373 12,-12c0,-6.627 -5.373,-12 -12,-12Zm0,2c5.514,0 10,4.486 10,10c0,5.514 -4.486,10 -10,10c-5.514,0 -10,-4.486 -10,-10c0,-5.514 4.486,-10 10,-10Zm2.692,14.889c0.161,0.115 0.368,0.143 0.553,0.073c0.185,-0.07 0.322,-0.228 0.362,-0.42c0.435,-2.042 1.489,-7.211 1.884,-9.068c0.03,-0.14 -0.019,-0.285 -0.129,-0.379c-0.11,-0.093 -0.263,-0.12 -0.399,-0.07c-2.096,0.776 -8.553,3.198 -11.192,4.175c-0.168,0.062 -0.277,0.223 -0.271,0.4c0.006,0.177 0.125,0.33 0.296,0.381c1.184,0.354 2.738,0.847 2.738,0.847c0,0 0.725,2.193 1.104,3.308c0.047,0.139 0.157,0.25 0.301,0.287c0.145,0.038 0.298,-0.001 0.406,-0.103c0.608,-0.574 1.548,-1.461 1.548,-1.461c0,0 1.786,1.309 2.799,2.03Zm-5.505,-4.338l0.84,2.769l0.186,-1.754c0,0 3.243,-2.925 5.092,-4.593c0.055,-0.048 0.062,-0.13 0.017,-0.188c-0.045,-0.057 -0.126,-0.071 -0.188,-0.032c-2.143,1.368 -5.947,3.798 -5.947,3.798Z"/></svg></a>



</ul>






<tr onmouseout="uflow_stop()" onmouseover="uflow_star>
            <td style="padding:20px;width:25%;vertical-align:mi>              <div class="one">
                <div class="two" id='uflow_image'>
                  <img src='images/uflow_after.png' width="160">                <img src='images/uflow_before.jpg' width="160">
              </div>
              <script type="text/javascript">                                   function uflow_start() {
                  document.getElementById('uflow_image').style.>                }

                function uflow_stop() {
                  document.getElementById('uflow_image').style.>
                }                                                               uflow_stop()
              </script>
            </td>
            <td style="padding:20px;width:75%;vertical-align:mi>
              <a href="https://arxiv.org/abs/2006.04902">
                <papertitle>What Matters in Unsupervised Optica>
              </a>                                                            <br>
              <a href="http://ricojonschkowski.com/">Rico Jonsc>              <a href="https://www.linkedin.com/in/austin-charl>
              <strong>Jonathan T. Barron</strong>, <br>
              <a href="https://research.google/people/ArielGord>              <a href="https://www.linkedin.com/in/kurt-konolig>
              <a href="https://research.google/people/AneliaAng>              <br>                                                            <em>ECCV</em>, 2020 &nbsp <font color="red"><stro>
              <br>                                                            <a href="https://github.com/google-research/googl>
              <br>
              <p></p>
              <p>
              Extensive experimentation yields a simple optical>              </p>
            </td>
          </tr>
