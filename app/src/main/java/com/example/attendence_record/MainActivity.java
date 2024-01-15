package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText c1, c2, c3, c4, c5, c6;
    Button save;
    String  co1, co2, co3, co4, co5, co6;
    TextView p1, p2, p3, p4, p5, p6;TextView a1, a2, a3, a4, a5, a6;
    TextView per1,per2,per3,per4,per5,per6;
    Button up1,up2,up3,up4,up5,up6,up7; Button aup1,aup2,aup3,aup4,aup5,aup6;
    Button dn1,dn2,dn3,dn4,dn5,dn6; Button adn1,adn2,adn3,adn4,adn5,adn6;
    Integer count1=0, count2=0, count3=0, count4=0, count5=0, count6=0,
            count7=0, count8=0, count9=0, count10=0, count11=0, count12=0;
    Float percent1= 0.00f,percent2= 0.00f,percent3= 0.00f,percent4= 0.00f,percent5= 0.00f,percent6= 0.00f;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        course name
        c1= (EditText) findViewById(R.id.c1);
        c2= (EditText) findViewById(R.id.c2);
        c3= (EditText) findViewById(R.id.c3);
        c4= (EditText) findViewById(R.id.c4);
        c5= (EditText) findViewById(R.id.c5);
        c6= (EditText) findViewById(R.id.c6);

        save = (Button) findViewById(R.id.save);

        //        Present number text veiw
        p1 = (TextView) findViewById(R.id.p1);
        p2 = (TextView) findViewById(R.id.p2);
        p3 = (TextView) findViewById(R.id.p3);
        p4 = (TextView) findViewById(R.id.p4);
        p5 = (TextView) findViewById(R.id.p5);
        p6 = (TextView) findViewById(R.id.p6);

//        Absent number text view
        a1 = (TextView) findViewById(R.id.a1);
        a2 = (TextView) findViewById(R.id.a2);
        a3 = (TextView) findViewById(R.id.a3);
        a4 = (TextView) findViewById(R.id.a4);
        a5 = (TextView) findViewById(R.id.a5);
        a6 = (TextView) findViewById(R.id.a6);

//        percentage text view
        per1=(TextView) findViewById(R.id.per1);
        per2=(TextView) findViewById(R.id.per2);
        per3=(TextView) findViewById(R.id.per3);
        per4=(TextView) findViewById(R.id.per4);
        per5=(TextView) findViewById(R.id.per5);
        per6=(TextView) findViewById(R.id.per6);

//        button for incrementing +1 for present
        up1=(Button) findViewById(R.id.up1);
        up2=(Button) findViewById(R.id.up2);
        up3=(Button) findViewById(R.id.up3);
        up4=(Button) findViewById(R.id.up4);
        up5=(Button) findViewById(R.id.up5);
        up6=(Button) findViewById(R.id.up6);

//      button for decrementing -1 for present
        dn1=(Button) findViewById(R.id.dn1);
        dn2=(Button) findViewById(R.id.dn2);
        dn3=(Button) findViewById(R.id.dn3);
        dn4=(Button) findViewById(R.id.dn4);
        dn5=(Button) findViewById(R.id.dn5);
        dn6=(Button) findViewById(R.id.dn6);

//        button for incrementing +1 in absent
        aup1=(Button) findViewById(R.id.aup1);
        aup2=(Button) findViewById(R.id.aup2);
        aup3=(Button) findViewById(R.id.aup3);
        aup4=(Button) findViewById(R.id.aup4);
        aup5=(Button) findViewById(R.id.aup5);
        aup6=(Button) findViewById(R.id.aup6);

//        button for decrementing -1 in absent
        adn1=(Button) findViewById(R.id.adn1);
        adn2=(Button) findViewById(R.id.adn2);
        adn3=(Button) findViewById(R.id.adn3);
        adn4=(Button) findViewById(R.id.adn4);
        adn5=(Button) findViewById(R.id.adn5);
        adn6=(Button) findViewById(R.id.adn6);

        SharedPreferences present = getSharedPreferences("Present",MODE_PRIVATE);
        SharedPreferences name = getSharedPreferences("name",MODE_PRIVATE);

        p1.setText(String.valueOf(present.getString("EP1","0")));
        count1= Integer.valueOf(p1.getText().toString());

        p2.setText(String.valueOf(present.getString("EP2","0")));
        count2= Integer.valueOf(p2.getText().toString());

        p3.setText(String.valueOf(present.getString("EP3","0")));
        count3= Integer.valueOf(p3.getText().toString());

        p4.setText(String.valueOf(present.getString("EP4","0")));
        count4= Integer.valueOf(p4.getText().toString());

        p5.setText(String.valueOf(present.getString("EP5","0")));
        count5= Integer.valueOf(p5.getText().toString());

        p6.setText(String.valueOf(present.getString("EP6","0")));
        count6= Integer.valueOf(p6.getText().toString());

//        set course name




        String cn1=name.getString("c1","");
        String cn2=name.getString("c2","");
        String cn3=name.getString("c3","");
        String cn4=name.getString("c4","");
        String cn5=name.getString("c5","");
        String cn6=name.getString("c6","");


        c1.setText(cn1);
        c2.setText(cn2);
        c3.setText(cn3);
        c4.setText(cn4);
        c5.setText(cn5);
        c6.setText(cn6);


        a1.setText(String.valueOf(present.getString("EP7","0")));
        count7= Integer.valueOf(a1.getText().toString());

        a2.setText(String.valueOf(present.getString("EP8","0")));
        count8= Integer.valueOf(a2.getText().toString());

        a3.setText(String.valueOf(present.getString("EP9","0")));
        count9= Integer.valueOf(a3.getText().toString());

        a4.setText(String.valueOf(present.getString("EP10","0")));
        count10= Integer.valueOf(a4.getText().toString());

        a5.setText(String.valueOf(present.getString("EP11","0")));
        count11= Integer.valueOf(a5.getText().toString());

        a6.setText(String.valueOf(present.getString("EP12","0")));
        count12= Integer.valueOf(a6.getText().toString());



        per1.setText(String.valueOf(present.getString("Per1","0.0")));
        per2.setText(String.valueOf(present.getString("Per2","0.0")));
        per3.setText(String.valueOf(present.getString("Per3","0.0")));
        per4.setText(String.valueOf(present.getString("Per4","0.0")));
        per5.setText(String.valueOf(present.getString("Per5","0.0")));
        per6.setText(String.valueOf(present.getString("Per6","0.0")));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                co1 = c1.getText().toString();
                co2 = c2.getText().toString();
                co3 = c3.getText().toString();
                co4 = c4.getText().toString();
                co5 = c5.getText().toString();
                co6 = c6.getText().toString();


                SharedPreferences name = getSharedPreferences("name",MODE_PRIVATE);
                SharedPreferences.Editor edit  = name.edit();
                edit.putString("c1",co1);
                edit.putString("c2",co2);
                edit.putString("c3",co3);
                edit.putString("c4",co4);
                edit.putString("c5",co5);
                edit.putString("c6",co6);

                edit.apply();
            }

        });



        up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1++;
                p1.setText(String.valueOf(count1));
                percent1 = Float.valueOf(count1)/ Float.valueOf(count1+count7);
                per1.setText(String.valueOf(100*(percent1)));
                savedata();
            }
        });

        dn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count1<=0) count1 = 0;
                else count1--;

                p1.setText(String.valueOf(count1));
                percent1 = Float.valueOf(count1)/ Float.valueOf(count1+count7);
                per1.setText(String.valueOf(100*(percent1)));
                savedata();

            }
        });

        up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                p2.setText(String.valueOf(count2));
                percent2 = Float.valueOf(count2)/ Float.valueOf(count2+count8);
                per2.setText(String.valueOf(100*(percent2)));
                savedata();
            }
        });

        dn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count2<=0) count2 = 0;
                else count2--;

                p2.setText(String.valueOf(count2));
                percent2 = Float.valueOf(count2)/ Float.valueOf(count2+count8);
                per2.setText(String.valueOf(100*(percent2)));
                savedata();
            }
        });

        up3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                p3.setText(String.valueOf(count3));
                percent3 = Float.valueOf(count3)/ Float.valueOf(count3+count9);
                per3.setText(String.valueOf(100*(percent3)));
                savedata();
            }
        });

        dn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count3<=0) count3 = 0;
                else count3--;

                p3.setText(String.valueOf(count3));
                percent3 = Float.valueOf(count3)/ Float.valueOf(count3+count9);
                per3.setText(String.valueOf(100*(percent3)));
                savedata();
            }
        });

        up4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4++;
                p4.setText(String.valueOf(count4));
                percent4 = Float.valueOf(count4)/ Float.valueOf(count4+count10);
                per4.setText(String.valueOf(100*(percent4)));
                savedata();
            }
        });

        dn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count4<=0) count4 = 0;
                else count4--;

                p4.setText(String.valueOf(count4));
                percent4 = Float.valueOf(count4)/ Float.valueOf(count4+count10);
                per4.setText(String.valueOf(100*(percent4)));
                savedata();
            }
        });

        up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5++;
                p5.setText(String.valueOf(count5));
                percent5 = Float.valueOf(count5)/ Float.valueOf(count5+count11);
                per5.setText(String.valueOf(100*(percent5)));
                savedata();
            }
        });

        dn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count5<=0) count5 = 0;
                else count5--;

                p5.setText(String.valueOf(count5));
                percent5 = Float.valueOf(count5)/ Float.valueOf(count5+count11);
                per5.setText(String.valueOf(100*(percent5)));
                savedata();
            }
        });

        up6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count6++;
                p6.setText(String.valueOf(count6));
                percent6 = Float.valueOf(count6)/ Float.valueOf(count6+count12);
                per6.setText(String.valueOf(100*(percent6)));
                savedata();
            }
        });

        dn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count6<=0) count6 = 0;
                else count6--;

                p6.setText(String.valueOf(count6));
                percent6 = Float.valueOf(count6)/ Float.valueOf(count6+count12);
                per6.setText(String.valueOf(100*(percent6)));
                savedata();
            }
        });



        aup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count7++;
                a1.setText(String.valueOf(count7));
                percent1 = Float.valueOf(count1)/ Float.valueOf(count1+count7);
                per1.setText(String.valueOf(100*(percent1)));
                savedata();
            }
        });

        adn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count7<=0) count7 = 0;
                else count7--;

                a1.setText(String.valueOf(count7));
                percent1 = Float.valueOf(count1)/ Float.valueOf(count1+count7);
                per1.setText(String.valueOf(100*(percent1)));
                savedata();
            }
        });

        aup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count8++;
                a2.setText(String.valueOf(count8));
                percent2 = Float.valueOf(count2)/ Float.valueOf(count2+count8);
                per2.setText(String.valueOf(100*(percent2)));
                savedata();
            }
        });

        adn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count8<=0) count8 = 0;
                else count8--;

                a2.setText(String.valueOf(count8));
                percent2 = Float.valueOf(count2)/ Float.valueOf(count2+count8);
                per2.setText(String.valueOf(100*(percent2)));
                savedata();
            }
        });

        aup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count9++;
                a3.setText(String.valueOf(count9));
                percent3 = Float.valueOf(count3)/ Float.valueOf(count3+count9);
                per3.setText(String.valueOf(100*(percent3)));
                savedata();
            }
        });

        adn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count9<=0) count9 = 0;
                else count9--;

                a3.setText(String.valueOf(count9));
                percent3 = Float.valueOf(count3)/ Float.valueOf(count3+count9);
                per3.setText(String.valueOf(100*(percent3)));
                savedata();
            }
        });

        aup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count10++;
                a4.setText(String.valueOf(count10));
                percent4 = Float.valueOf(count4)/ Float.valueOf(count4+count10);
                per4.setText(String.valueOf(100*(percent4)));
                savedata();
            }
        });

        adn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count10<=0) count10 = 0;
                else count10--;

                a4.setText(String.valueOf(count10));
                percent4 = Float.valueOf(count4)/ Float.valueOf(count4+count10);
                per4.setText(String.valueOf(100*(percent4)));
                savedata();
            }
        });

        aup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count11++;
                a5.setText(String.valueOf(count11));
                percent5 = Float.valueOf(count5)/ Float.valueOf(count5+count11);
                per5.setText(String.valueOf(100*(percent5)));
                savedata();
            }
        });

        adn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count11<=0) count11 = 0;
                else count11--;

                a5.setText(String.valueOf(count11));
                percent5 = Float.valueOf(count5)/ Float.valueOf(count5+count11);
                per5.setText(String.valueOf(100*(percent5)));
                savedata();
            }
        });

        aup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count12++;
                a6.setText(String.valueOf(count12));
                percent6 = Float.valueOf(count6)/ Float.valueOf(count6+count12);
                per6.setText(String.valueOf(100*(percent6)));
                savedata();
            }
        });

        adn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count12<=0) count12 = 0;
                else count12--;

                a6.setText(String.valueOf(count12));
                percent6 = Float.valueOf(count6)/ Float.valueOf(count6+count12);
                per6.setText(String.valueOf(100*(percent6)));
                savedata();
            }
        });


        savedata();

    }
    public void savedata(){
        SharedPreferences present = getSharedPreferences("Present",MODE_PRIVATE);
        SharedPreferences.Editor editor = present.edit();
        editor.putString("EP1",count1.toString());
        editor.putString("EP2",count2.toString());
        editor.putString("EP3",count3.toString());
        editor.putString("EP4",count4.toString());
        editor.putString("EP5",count5.toString());
        editor.putString("EP6",count6.toString());
        editor.putString("EP7",count7.toString());
        editor.putString("EP8",count8.toString());
        editor.putString("EP9",count9.toString());
        editor.putString("EP10",count10.toString());
        editor.putString("EP11",count11.toString());
        editor.putString("EP12",count12.toString());

        editor.putString("Per1",per1.getText().toString());
        editor.putString("Per2",per2.getText().toString());
        editor.putString("Per3",per3.getText().toString());
        editor.putString("Per4",per4.getText().toString());
        editor.putString("Per5",per5.getText().toString());
        editor.putString("Per6",per6.getText().toString());

        editor.apply();
    }
//    public void save(char a,int i){
//
//        SharedPreferences data = getSharedPreferences("data",MODE_PRIVATE);
//        SharedPreferences.Editor editor = data.edit();
//        editor.putInt(String.valueOf(a),i);
//        editor.apply();
//    }

//    public void load(){
//
//    }
//    public void down(Button button,int a,int b,int percent){
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(a<=0) a = 0;
//                else a--;
//
//                a6.setText(String.valueOf(a));
//                percent = Float.valueOf(b)/ Float.valueOf(a+b);
//                per6.setText(String.valueOf(100*(percent6)));
//            }
//        });
//    }

}
