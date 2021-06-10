package com.teddy.praktekdokterivonne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class  ChatbotActivity extends AppCompatActivity {

    //Memanggil Variabel Widget Drawer supaya bisa dicoding
    //Inisialiasi Variabel
    DrawerLayout drawerLayout;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        findViewById(R.id.btn_chatbot_wa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://wa.me/6281226508441?text=hai+admin+praktek+dokter+ivonne");
            }
        });

        //assign variabelnya
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void clicked_btn(String url)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void ClickMenu(View view){
        //Open drawer
        MainActivity.openDrawer (drawerLayout);
    }

    public void ClickLogo(View view){
        //Close Drawernya
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //Redirect activity ke Beranda
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickTentangDokter (View view){
        //Redirect activity ke info Dokter
        MainActivity.redirectActivity(this,TentangDokterActivity.class);
    }

    public void ClickLayanan (View view){
        //Redirect activity ke Layanan
        MainActivity.redirectActivity(this,LayananActivity.class);
    }

    public void ClickBooking (View view){
        //Redirect activity ke Booking Antrian
        MainActivity.redirectActivity(this,BookingActivity.class);
    }

    public void ClickArtikel (View view){
        //Redirect activity ke Artikel Kesehatan
        MainActivity.redirectActivity(this,ArtikelActivity.class);
    }

    public void ClickDokumentasi (View view){
        //Redirect activity ke Dokumentasi
        MainActivity.redirectActivity(this,DokumentasiActivity.class);
    }

    public void ClickPartnership (View view){
        //Redirect activity ke Partnership
        MainActivity.redirectActivity(this,PartnershipActivity.class);
    }

    public void ClickKontak (View view){
        //Redirect activity ke Kontak Kami
        MainActivity.redirectActivity(this,KontakActivity.class);
    }

    public void ClickChatbot (View view){
        //Recreate activity
        recreate();
    }

    public void ClickAplikasi (View view){
        //Redirect activity ke Tentang Aplikasi
        MainActivity.redirectActivity(this,AplikasiActivity.class);
    }

    public void ClickLogout (View view){
        //Menutup Aplikasi
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close Drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}