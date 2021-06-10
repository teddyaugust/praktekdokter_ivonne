package com.teddy.praktekdokterivonne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class  LayananActivity extends AppCompatActivity {

    //Memanggil Variabel Widget Drawer supaya bisa dicoding
    //Inisialiasi Variabel
    DrawerLayout drawerLayout;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);

        //buka webnya
        webView = (WebView) findViewById(R.id.layanan_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://dokter.yuk-kunjungi.com/dokter-ivonne/layanan/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //assign variabelnya
        drawerLayout = findViewById(R.id.drawer_layout);

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
        //Recreate activity
        recreate();
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

    public void ClickChatBot (View view){
        //Redirect activity ke Chat Bot WA
        MainActivity.redirectActivity(this,ChatbotActivity.class);
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