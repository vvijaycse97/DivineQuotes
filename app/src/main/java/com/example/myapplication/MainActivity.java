package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtViewQuotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        txtViewQuotes = findViewById(R.id.text_view_quotes);
       //Get SharedPreferences object
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        //Writing data to SharedPreferences
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("1", "Swami is Proud of You!");
        editor.putString("2","Never take God for granted.");
        editor.putString("3","Work more Talk less.");
        editor.putString("4","I am always there in you,with you,around you.");
        editor.putString("5","Take one step towards me I shall take 100 towards you.");
        editor.putString("6", "See good in others.");
        editor.putString("7","Don't criticize others.");
        editor.putString("8","Bangaru! Why fear I am here.");
        editor.putString("9","Don't worry if you are right.");
        editor.putString("10","Do selfless service.");
        editor.putString("11","Work more,talk less.");
        editor.putString("12","He knows,He loves,He cares,He does,He is Omnipotent,then why this unhappiness.");
        editor.putString("13","Do things to please God.");
        editor.putString("14","Whenever you think of Me,I will be there.");
        editor.putString("15","You may go to any place I will protect you.");
        editor.putString("16","God chooses only those who choose Him.");
        editor.putString("17","Do not have expectations.");
        editor.putString("18","Do not forget well others have done to you.");
        editor.putString("19","Swamy will surely respond to your sincere prayers.");
        editor.putString("20","Surrender to me,I will take care.");
        editor.putString("21","Whatever happens is for your own good.");
        editor.putString("22","Do your best,Sai will do the rest.");
        editor.putString("23","Have constructive thoughts, consoling words, and compassionate acts.");
        editor.putString("24","I just called you to say 'I love you'");
        editor.putString("25","Don't miss opportunity given by Me.");
        editor.putString("26","Be equiminded when things go right or wrong.");
        editor.putString("27","Develop confidence in you faith in Me.");
        editor.putString("28","Twice a week keep silence.");
        editor.putString("29","You are My loving child.");
        editor.putString("30","I will hold your hand and lead you.");
        editor.putString("31","Be steady have faith and reach the goal safe.");
        editor.putString("32","Whatever the trouble ,however great the sorrows persist and win by recollecting the Lord.");
        editor.putString("33","Pray for My vision, and I shall grant you.");
        editor.putString("34","Your soft speech is the expression of genuine love.");
        editor.putString("35","Expect My dreams to night.");
        editor.putString("36","Cry for Me,I will come.");
        editor.putString("37","My grace is like insurance,which will help you in your time of need without limit.");
        editor.putString("38","Dedicate all your thoughts,words,and deeds to Me.");
        editor.putString("39","Smile and be happy.");
        editor.putString("40","My blessings are with you.");
        editor.putString("41","Do not doubt My power, for I am god.");
        editor.putString("42","Have patience.");
        editor.putString("43","Speak softly and sweetly.");
        editor.putString("44","I love you.");
        editor.putString("45","I am testing you.");
        editor.putString("46","Obey Me.");
        editor.putString("47","I will protect you.");
        editor.putString("48","I am yours.");
        editor.putString("49","Keep smiling.");
        editor.putString("50","Always think of Me.");
        editor.putString("51","Don't loose your temper.");
        editor.putString("52","Sai's bangaru! Cheer up.");
        editor.putString("53","Cry only for Me.");
        editor.putString("54","Let 'IT' not worry you.");
        editor.putString("55","What you are not able today,you will achieve tomorrow.");
        editor.putString("56","All the best.");
        editor.putString("57","God finds perfection in Himself so must you.");
        editor.putString("58","I am happy with you.");
        editor.putString("59","Don't waste time.");
        editor.putString("60","I will take care of you.");
        editor.putString("61","I am watching you.");
        editor.putString("62","You please Me.");
        editor.putString("63","I need no invitation,I am within you.");
        editor.putString("64","Reduce your wants.");
        editor.putString("65","Avoid bad company.");
        editor.putString("66","Be good. See good. Do good.");
        editor.putString("67","Follow the master,face the devil,fight till end,finish the game.");
        editor.putString("68","Action speaks louder than voice.");
        editor.putString("69","I am unhappy with you.");
        editor.putString("70","All the best for your exams.");
        editor.putString("71","Avoid bad thoughts.");
        editor.putString("72","I am waiting for you.");
        editor.putString("73","Read a spiritual book.");
        editor.putString("74","Forget the past,think of the present.");
        editor.putString("75","Don't hurt others.");
        editor.putString("76","Don't be moody.");
        editor.putString("77","Accept your mistakes.");
        editor.putString("78","Don't laugh loudly.");
        editor.putString("79","Test is My taste.");
        editor.putString("80","Bangaru! Cheer up.");
        editor.putString("81","I am proud of you.");
        editor.putString("82","Smile at ME.");
        editor.putString("83","Concentrate in your studies.");
        editor.putString("84","Be optimistic.");
        editor.putString("85","If you fail to prepare,be prepared to fail.");
        editor.putString("86","Don't make fun of others.");
        editor.putString("87","I am happy with you.");
        editor.putString("88","Take care of your health.");
        editor.putString("89","Don't bunk your food.");
        editor.putString("90","Pleasure is an interval between two pains.");
        editor.putString("91","Don't grumble.");
        editor.putString("92","Practise what you preach.");
        editor.putString("93","Be responsible.");
        editor.putString("94","Be attentive in the class.");
        editor.putString("95","Be regular in your studies.");
        editor.putString("96","Always be careful.");
        editor.putString("97","I know what is good for you.");
        editor.putString("98","Wait for the right time.");
        editor.putString("99","I am your true friend.");
        editor.putString("100","Be punctual.");
        editor.putString("101","Don't back bite.");
        editor.putString("102","Avoid watching T.V.");
        editor.putString("103","You are My treasure.");
        editor.putString("104","Accept My will.");
        editor.putString("105","I have forgiven you.");
        editor.putString("106","Always speak truth.");
        editor.putString("107","I will look after.");
        editor.putString("108","Act according to your conscience.");
        editor.apply();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int val = random.nextInt(109-1)+1; // save random number in an integer variable
                Log.i("Random number is",Integer.toString(val));
                // Reading data from SharedPreferences
                String sharedPreferencesString = sharedPreferences.getString(Integer.toString(val),"");
                Log.i("Getting the quotes","Divine Quote is ");
                Log.i("Divine Quote",sharedPreferencesString);
                txtViewQuotes.setText(sharedPreferencesString);
            }
        });
    }
}