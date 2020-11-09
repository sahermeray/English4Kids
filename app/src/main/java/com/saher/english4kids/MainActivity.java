package com.saher.english4kids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LetterAdapter ad;
    RecyclerView rv;
    MediaPlayer mediaplayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Letter> lt=new ArrayList<>();
        lt.add(new Letter("A","a"));
        lt.add(new Letter("B","b"));
        lt.add(new Letter("C","c"));
        lt.add(new Letter("D","d"));
        lt.add(new Letter("E","e"));
        lt.add(new Letter("F","f"));
        lt.add(new Letter("G","g"));
        lt.add(new Letter("H","h"));
        lt.add(new Letter("I","i"));
        lt.add(new Letter("J","j"));
        lt.add(new Letter("K","k"));
        lt.add(new Letter("L","l"));
        lt.add(new Letter("M","m"));
        lt.add(new Letter("N","n"));
        lt.add(new Letter("O","o"));
        lt.add(new Letter("P","p"));
        lt.add(new Letter("Q","q"));
        lt.add(new Letter("R","r"));
        lt.add(new Letter("S","s"));
        lt.add(new Letter("T","t"));
        lt.add(new Letter("U","u"));
        lt.add(new Letter("V","v"));
        lt.add(new Letter("W","w"));
        lt.add(new Letter("X","x"));
        lt.add(new Letter("Y","y"));
        lt.add(new Letter("Z","z"));
        ad=new LetterAdapter(lt, new onRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(int letterId) {
                Intent intent=new Intent(getBaseContext(),letter_and_word.class);
                switch (letterId){
                    case 0:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.a);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.apple);
                        intent.putExtra("secondSound",R.raw.camel);
                        intent.putExtra("thirdSound",R.raw.tea);
                        intent.putExtra("firstImage",R.drawable.ic_apple);
                        intent.putExtra("secondImage",R.drawable.ic_camel);
                        intent.putExtra("thirdImage",R.drawable.ic_tea);
                        intent.putExtra("firstText", "Apple");
                        intent.putExtra("secondText","Camel");
                        intent.putExtra("thirdText","Tea");
                        break;
                    case 1:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.b);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.banana);
                        intent.putExtra("secondSound",R.raw.mobile);
                        intent.putExtra("thirdSound",R.raw.comb);
                        intent.putExtra("firstImage",R.drawable.ic_banana);
                        intent.putExtra("secondImage",R.drawable.ic_mobile);
                        intent.putExtra("thirdImage",R.drawable.ic_comb);
                        intent.putExtra("firstText","Banana");
                        intent.putExtra("secondText","Mobile");
                        intent.putExtra("thirdText","Comb");
                        break;
                    case 2:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.c);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.car);
                        intent.putExtra("secondSound",R.raw.crocadile);
                        intent.putExtra("thirdSound",R.raw.music);
                        intent.putExtra("firstImage",R.drawable.ic_car);
                        intent.putExtra("secondImage",R.drawable.ic_crocodile);
                        intent.putExtra("thirdImage",R.drawable.ic_music);
                        intent.putExtra("firstText","Car");
                        intent.putExtra("secondText","Crocodile");
                        intent.putExtra("thirdText","Music");
                        break;
                    case 3:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.d);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.duck);
                        intent.putExtra("secondSound",R.raw.bridge);
                        intent.putExtra("thirdSound",R.raw.bed);
                        intent.putExtra("firstImage",R.drawable.ic_duck);
                        intent.putExtra("secondImage",R.drawable.ic_bridge);
                        intent.putExtra("thirdImage",R.drawable.ic_bed);
                        intent.putExtra("firstText","Duck");
                        intent.putExtra("secondText","Bridge");
                        intent.putExtra("thirdText","Bed");
                        break;
                    case 4:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.e);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.elephant);
                        intent.putExtra("secondSound",R.raw.watermelon);
                        intent.putExtra("thirdSound",R.raw.bee);
                        intent.putExtra("firstImage",R.drawable.ic_elephant);
                        intent.putExtra("secondImage",R.drawable.ic_watermelon);
                        intent.putExtra("thirdImage",R.drawable.ic_bee);
                        intent.putExtra("firstText","Elephant");
                        intent.putExtra("secondText","Watermelon");
                        intent.putExtra("thirdText","Bee");
                        break;
                    case 5:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.f);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.frog);
                        intent.putExtra("secondSound",R.raw.sofa);
                        intent.putExtra("thirdSound",R.raw.wolf);
                        intent.putExtra("firstImage",R.drawable.ic_frog);
                        intent.putExtra("secondImage",R.drawable.ic_sofa);
                        intent.putExtra("thirdImage",R.drawable.ic_wolf);
                        intent.putExtra("firstText","Frog");
                        intent.putExtra("secondText","Sofa");
                        intent.putExtra("thirdText","Wolf");
                        break;
                    case 6:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.g);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.girl);
                        intent.putExtra("secondSound",R.raw.traingle);
                        intent.putExtra("thirdSound",R.raw.dog);
                        intent.putExtra("firstImage",R.drawable.ic_girl);
                        intent.putExtra("secondImage",R.drawable.ic_triangle);
                        intent.putExtra("thirdImage",R.drawable.ic_dog);
                        intent.putExtra("firstText","Girl");
                        intent.putExtra("secondText","Triangle");
                        intent.putExtra("thirdText","Dog");
                        break;
                    case 7:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.h);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.home);
                        intent.putExtra("secondSound",R.raw.cherries);
                        intent.putExtra("thirdSound",R.raw.teeth);
                        intent.putExtra("firstImage",R.drawable.ic_home);
                        intent.putExtra("secondImage",R.drawable.ic_cherries);
                        intent.putExtra("thirdImage",R.drawable.ic_teeth);
                        intent.putExtra("firstText","Home");
                        intent.putExtra("secondText","Cherries");
                        intent.putExtra("thirdText","Teeth");
                        break;
                    case 8:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.i);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.icecream);
                        intent.putExtra("secondSound",R.raw.pencil);
                        intent.putExtra("thirdSound",R.raw.taxi);
                        intent.putExtra("firstImage",R.drawable.ic_ice_cream);
                        intent.putExtra("secondImage",R.drawable.ic_pencil);
                        intent.putExtra("thirdImage",R.drawable.ic_taxi);
                        intent.putExtra("firstText","Ice cream");
                        intent.putExtra("secondText","Pencil");
                        intent.putExtra("thirdText","Taxi");
                        break;
                    case 9:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.j);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.juice);
                        intent.putExtra("secondSound",R.raw.jacket);
                        intent.putExtra("thirdSound",R.raw.biejing);
                        intent.putExtra("firstImage",R.drawable.ic_juice);
                        intent.putExtra("secondImage",R.drawable.ic_jacket);
                        intent.putExtra("thirdImage",R.drawable.ic_beijing);
                        intent.putExtra("firstText","Juice");
                        intent.putExtra("secondText","Jacket");
                        intent.putExtra("thirdText","Beijing");
                        break;
                    case 10:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.k);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.key);
                        intent.putExtra("secondSound",R.raw.monkey);
                        intent.putExtra("thirdSound",R.raw.clock);
                        intent.putExtra("firstImage",R.drawable.ic_key);
                        intent.putExtra("secondImage",R.drawable.ic_monkey);
                        intent.putExtra("thirdImage",R.drawable.ic_clock);
                        intent.putExtra("firstText","Key");
                        intent.putExtra("secondText","Monkey");
                        intent.putExtra("thirdText","Clock");
                        break;
                    case 11:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.l);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.lion);
                        intent.putExtra("secondSound",R.raw.table);
                        intent.putExtra("thirdSound",R.raw.ball);
                        intent.putExtra("firstImage",R.drawable.ic_lion);
                        intent.putExtra("secondImage",R.drawable.ic_table);
                        intent.putExtra("thirdImage",R.drawable.ic_ball);
                        intent.putExtra("firstText","Lion");
                        intent.putExtra("secondText","Table");
                        intent.putExtra("thirdText","Ball");
                        break;
                    case 12:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.m);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.milk);
                        intent.putExtra("secondSound",R.raw.lemon);
                        intent.putExtra("thirdSound",R.raw.swim);
                        intent.putExtra("firstImage",R.drawable.ic_milk);
                        intent.putExtra("secondImage",R.drawable.ic_lemon);
                        intent.putExtra("thirdImage",R.drawable.ic_swim);
                        intent.putExtra("firstText","Milk");
                        intent.putExtra("secondText","Lemon");
                        intent.putExtra("thirdText","Swim");
                        break;
                    case 13:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.n);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.nurse);
                        intent.putExtra("secondSound",R.raw.rainbow);
                        intent.putExtra("thirdSound",R.raw.moon);
                        intent.putExtra("firstImage",R.drawable.ic_nurse);
                        intent.putExtra("secondImage",R.drawable.ic_rainbow);
                        intent.putExtra("thirdImage",R.drawable.ic_moon);
                        intent.putExtra("firstText","Nurse");
                        intent.putExtra("secondText","Rainbow");
                        intent.putExtra("thirdText","Moon");
                        break;
                    case 14:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.o);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.orange);
                        intent.putExtra("secondSound",R.raw.soup);
                        intent.putExtra("thirdSound",R.raw.kangaroo);
                        intent.putExtra("firstImage",R.drawable.ic_orange);
                        intent.putExtra("secondImage",R.drawable.ic_soup);
                        intent.putExtra("thirdImage",R.drawable.ic_kangaroo);
                        intent.putExtra("firstText","Orange");
                        intent.putExtra("secondText","Soup");
                        intent.putExtra("thirdText","Kangaroo");
                        break;
                    case 15:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.p);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.pen);
                        intent.putExtra("secondSound",R.raw.happy);
                        intent.putExtra("thirdSound",R.raw.sheep);
                        intent.putExtra("firstImage",R.drawable.ic_pen);
                        intent.putExtra("secondImage",R.drawable.ic_happy);
                        intent.putExtra("thirdImage",R.drawable.ic_sheep);
                        intent.putExtra("firstText","Pen");
                        intent.putExtra("secondText","Happy");
                        intent.putExtra("thirdText","Sheep");
                        break;
                    case 16:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.q);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.question);
                        intent.putExtra("secondSound",R.raw.square);
                        intent.putExtra("thirdSound",R.raw.iraq);
                        intent.putExtra("firstImage",R.drawable.ic_quiestion_mark);
                        intent.putExtra("secondImage",R.drawable.ic_square);
                        intent.putExtra("thirdImage",R.drawable.ic_iraq);
                        intent.putExtra("firstText","Question");
                        intent.putExtra("secondText","Square");
                        intent.putExtra("thirdText","Iraq");
                        break;
                    case 17:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.r);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.rain);
                        intent.putExtra("secondSound",R.raw.board);
                        intent.putExtra("thirdSound",R.raw.flower);
                        intent.putExtra("firstImage",R.drawable.ic_rain);
                        intent.putExtra("secondImage",R.drawable.ic_board);
                        intent.putExtra("thirdImage",R.drawable.ic_flower);
                        intent.putExtra("firstText","Rain");
                        intent.putExtra("secondText","Board");
                        intent.putExtra("thirdText","Flower");
                        break;
                    case 18:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.s);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.star);
                        intent.putExtra("secondSound",R.raw.message);
                        intent.putExtra("thirdSound",R.raw.grass);
                        intent.putExtra("firstImage",R.drawable.ic_star);
                        intent.putExtra("secondImage",R.drawable.ic_message);
                        intent.putExtra("thirdImage",R.drawable.ic_grass);
                        intent.putExtra("firstText","Star");
                        intent.putExtra("secondText","Message");
                        intent.putExtra("thirdText","Grass");
                        break;
                    case 19:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.t);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.train);
                        intent.putExtra("secondSound",R.raw.tomato);
                        intent.putExtra("thirdSound",R.raw.carrot);
                        intent.putExtra("firstImage",R.drawable.ic_train);
                        intent.putExtra("secondImage",R.drawable.ic_tomato);
                        intent.putExtra("thirdImage",R.drawable.ic_carrot);
                        intent.putExtra("firstText","Train");
                        intent.putExtra("secondText","Tomato");
                        intent.putExtra("thirdText","Carrot");
                        break;
                    case 20:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.u);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.umbrella);
                        intent.putExtra("secondSound",R.raw.mouse);
                        intent.putExtra("thirdSound",R.raw.flu);
                        intent.putExtra("firstImage",R.drawable.ic_umbrella);
                        intent.putExtra("secondImage",R.drawable.ic_mouse);
                        intent.putExtra("thirdImage",R.drawable.ic_flu);
                        intent.putExtra("firstText","Umbrella");
                        intent.putExtra("secondText","Mouse");
                        intent.putExtra("thirdText","Flu");
                        break;
                    case 21:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.v);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.vest);
                        intent.putExtra("secondSound",R.raw.stove);
                        intent.putExtra("thirdSound",R.raw.tv);
                        intent.putExtra("firstImage",R.drawable.ic_vest);
                        intent.putExtra("secondImage",R.drawable.ic_stove);
                        intent.putExtra("thirdImage",R.drawable.ic_tv);
                        intent.putExtra("firstText","Vest");
                        intent.putExtra("secondText","Stove");
                        intent.putExtra("thirdText","TV");
                        break;
                    case 22:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.w);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.window);
                        intent.putExtra("secondSound",R.raw.strawberry);
                        intent.putExtra("thirdSound",R.raw.cow);
                        intent.putExtra("firstImage",R.drawable.ic_window);
                        intent.putExtra("secondImage",R.drawable.ic_strawberry);
                        intent.putExtra("thirdImage",R.drawable.ic_cow);
                        intent.putExtra("firstText","Window");
                        intent.putExtra("secondText","Strawberry");
                        intent.putExtra("thirdText","Cow");
                        break;
                    case 23:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.x);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.xylophone);
                        intent.putExtra("secondSound",R.raw.text);
                        intent.putExtra("thirdSound",R.raw.mailbox);
                        intent.putExtra("firstImage",R.drawable.ic_xylophone);
                        intent.putExtra("secondImage",R.drawable.ic_text);
                        intent.putExtra("thirdImage",R.drawable.ic_mailbox);
                        intent.putExtra("firstText","Xylophone");
                        intent.putExtra("secondText","Text");
                        intent.putExtra("thirdText","Mailbox");
                        break;
                    case 24:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.y);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.young);
                        intent.putExtra("secondSound",R.raw.bicycle);
                        intent.putExtra("thirdSound",R.raw.angry);
                        intent.putExtra("firstImage",R.drawable.ic_young);
                        intent.putExtra("secondImage",R.drawable.ic_bicycle);
                        intent.putExtra("thirdImage",R.drawable.ic_angry);
                        intent.putExtra("firstText","Young");
                        intent.putExtra("secondText","Bicycle");
                        intent.putExtra("thirdText","Angry");
                        break;
                    case 25:
                        releasemediaplayer();
                        mediaplayer=MediaPlayer.create(getBaseContext(),R.raw.z);
                        mediaplayer.start();
                        mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                releasemediaplayer();
                            }
                        });
                        intent.putExtra("firstSound",R.raw.zero);
                        intent.putExtra("secondSound",R.raw.pizza);
                        intent.putExtra("thirdSound",R.raw.jazz);
                        intent.putExtra("firstImage",R.drawable.ic_zero);
                        intent.putExtra("secondImage",R.drawable.ic_pizza);
                        intent.putExtra("thirdImage",R.drawable.ic_jazz);
                        intent.putExtra("firstText","Zero");
                        intent.putExtra("secondText","Pizza");
                        intent.putExtra("thirdText","Jazz");
                        break;
                }
                startActivity(intent);
            }
        });
        rv=findViewById(R.id.main_activity_rv);
        rv.setAdapter(ad);
        RecyclerView.LayoutManager lm=new GridLayoutManager(this,2);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);



    }
    private void releasemediaplayer(){
        if(mediaplayer!=null){
            mediaplayer.release();
            mediaplayer=null;
        }
    }
}