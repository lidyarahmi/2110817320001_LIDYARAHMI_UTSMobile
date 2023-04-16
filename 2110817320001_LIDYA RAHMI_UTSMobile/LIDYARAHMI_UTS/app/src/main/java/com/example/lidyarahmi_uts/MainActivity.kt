package com.example.lidyarahmi_uts

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    private lateinit var adapter : KomikAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        adapter = KomikAdapter(getItemList(), object : KomikAdapter.OnItemClickListener {
            override fun onItemClick(data: DataKomik) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("name", data.heading)
                    putExtra("name", data.judul)
                    putExtra("image", data.gambar)
                    putExtra("deskripsi", data.des)
                    putExtra("author", data.author)
                    putExtra("publish", data.publish)
                }
                startActivity(intent)
            }
        })
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getItemList(): List<DataKomik> {
        val content = mutableListOf<DataKomik>()
        content.add(
            DataKomik(
                "Abdul Solatif",
                "Abdul Solatif",
            "Author: Beng Rahardian",
            "Baca komik Cerita si Abdul sekarang! Episode baru tiap Disaat semua orang puasa, Abdul yang berjalan ke sekolah melihat murid lain sedang makan Di semak",
            "Publish : 2016",
                R.drawable.abdulkomik,
            "Genre : Horor, Gore",
                R.drawable.abdulsolatif

            )
        )
        content.add(
            DataKomik(
                "Tahilalats",
                "3 Bulan PDKT",
                "Author: Nurfadli",
                "Tahilalats adalah komik strip bergenre komedi yang ditulis dan digambar oleh Nurfadhli Mursyid.",
                "Publish : 2014",
                R.drawable.tahilalat1,
                "Genre : Komedi",
                R.drawable.tahilalat
            )
        )
        content.add(
            DataKomik(
                "Ayam Goreng",
                "Ayam Goreng",
                "Author: PJD",
                "Minah, sang wanita cantik, tiba-tiba berubah menjadi sepotong ayam goreng?! Kisah absurd tentang seorang ayah dan pegawai magang yang berusaha mengembalikan",
                "Publish: 2019",
                R.drawable.ayamgorengkomik,
                "Genre: Drama",
                R.drawable.ayamgoreng
            )
        )
        content.add(
            DataKomik(
                "Gloomy Sunday",
                "WILL",
                "Author: Fanky Landerson",
                "Komik ini mengandung tema kekerasan dan pembunuhan. Cerita aneh, kelam, dan horor.",
                "Publish : 2023",
                R.drawable.gloomykomik,
                "Genre : Horor",
                R.drawable.glommy
            )
        )
        content.add(
            DataKomik(
                "Si Juki",
                "Juki: LIKA LIKU ANAK KOS",
                "author: Faza Meonk",
                "Lika-liku anak kos yang kocak! Komik asli Indonesia yang mengisahkan pahit manisnya kehidupan anak kos. Penuh canda dan tawa dengan selipan kritik tentang isu yang sedang hangat saat ini",
                "Publish: 2015",
                R.drawable.jukikomik,
                "Genre : Komedi",
                R.drawable.sijuki
            )
        )
        content.add(
            DataKomik(
                "Ghosty's comic",
                "SULTAN DI RESTORAN",
                "Author: GHOSTYCORP",
                "Asam manis perkhilafan dan cerita lainnya, Bergabunglah bersama Jaret, Emon, Sultan, dan teman-teman lainnya dalam menghadapi suka dan duka dunia perhobian!",
                "Publish : 2016",
                R.drawable.ghostykomik,
                "Genre : Komedi",
                R.drawable.ghost
            )
        )
        content.add(
            DataKomik(
                "Ghost Path",
                "CERITA HOROR DI BAWAH TANAH",
                "Author: Joo dong Guen",
                "Cerita-cerita seram yang ada di sekitarmu..",
                "Publish : 2016",
                R.drawable.ghostpathkomik,
                "Genre : Horor",
                R.drawable.ghostpath
            )
        )
        content.add(
            DataKomik(
                "Kecoa dan Dendam",
                "EPISODE 304 (LAST)",
                "Author: Renato Adhitama",
                "Kisah kehidupan seekor kecoa yang ingin memerangi manusia untuk membalaskan dendam kematian keluarganya. Dapatkan para kecoa mengalahkan manusia?",
                "Publish : 2020",
                R.drawable.kecoakomik,
                "Genre : Komedi",
                R.drawable.kecoa
            )
        )
        content.add(
            DataKomik(
                "Yotsuba",
                "Yotsuba",
                "Author: One, Yūsuke Murata",
                "Yotsuba dan ayahnya menghabiskan waktu yang sedikit spesial, dengan naik kereta yang ramai, berjalan-jalan di Harajuku, dan menyantap makan siang yang mewah. Lalu, ada karakter yang baru pertama kali muncul?",
                "Publish : 2003",
                R.drawable.yotsubakomik,
                "Genre : Comedy, Slice of life",
                R.drawable.yotsuba
            )
        )
        content.add(
            DataKomik(
                "Lookism",
                "MUDIK",
                "Author: Taejun Pak (박태준)",
                "Cowok ini punya 2 wujud! Pilih yang mana ya..?",
                "Publish : 2023",
                R.drawable.lookismkomik,
                "Genre : Komedi, Drama",
                R.drawable.lookism
            )
        )
        content.add(
            DataKomik(
                "Si Ocong",
                "SENDIRIAN AJA",
                "Author: Agung Gunawan",
                "si ocong adalah sosok yang songong nyebelin tapi ngangenin",
                "Publish : 2023",
                R.drawable.siocongkomik,
                "Genre : Komedi",
                R.drawable.siocong
            )
        )
        content.add(
            DataKomik(
                "Si Udin",
                "EPISODE 631 (TAMAT)",
                "Author: Niksen",
                "Mengisahkan cerita kehidupan sehari-hari Si Udin dan teman-temannya.",
                "Publish : 2022",
                R.drawable.siudinkomik,
                "Genre : Komedi",
                R.drawable.siudin
            )
        )
        content.add(
            DataKomik(
                "Dalang Pelo",
                "Jomblo",
                "Author: Nur Alif Ramadhan",
                "Dalang Pelo (sebelumnya Animasi Gombrong, Animastrip Gombrong, atau Gombrong adalah sebuah serial animasi dan buku komik yang dibuat oleh Nur Alif Ramadhan.",
                "Publish : 2016",
                R.drawable.dalangpelokomik,
                "Genre : Horor, Gore",
                R.drawable.dalangpelo
            )
        )
        content.add(
            DataKomik(
                "ONE-PUNCH-MAN",
                "ONE-PUNCHMAN",
                "Author: One, Shueisha",
                "One-Punch Man ( ワンパンマン Wanpanman) adalah sebuah serial manga Jepang yang menceritakan seorang superhero yang bernama Saitama. One-Punch Man dibuat oleh seorang penulis yang asal jepang dengan nama samaran ONE",
                "Publish : 2009",
                R.drawable.onepunchkomik,
                "Genre : ksi, Komedi, Superhero, Fiksi",
                R.drawable.onepunchman
            )
        )
        content.add(
            DataKomik(
                "Tuti and Friends",
                "Helm",
                "Author:  Pionicon",
                "Tuti adalah anak super polos, ceria tapi terkadang lemot! Ikuti keseharian Tuti dan teman-temannya!",
                "Publish : 2014",
                R.drawable.tutiikomik,
                "Genre : Komedi, Manga",
                R.drawable.tuti
            )
        )


        return content
    }

}