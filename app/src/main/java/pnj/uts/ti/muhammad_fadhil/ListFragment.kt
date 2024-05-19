package pnj.uts.ti.muhammad_fadhil

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pnj.uts.ti.muhammad_fadhil.Adapter.BeritaAdapter
import pnj.uts.ti.muhammad_fadhil.Models.Berita
import pnj.uts.ti.muhammad_fadhil.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var beritaArraylist: ArrayList<Berita>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentListBinding.inflate(inflater, container, false)

        val imageId = intArrayOf(
            R.drawable.starlink_4_169,
            R.drawable.bmkg_news_image,
            R.drawable.mobile_banking_1_169,
            R.drawable.bebas_visa,
            R.drawable.rumput_jis,
            R.drawable.makanan_terbaik,
            R.drawable.harley_davidson_169,
            R.drawable.wwf_10,
            R.drawable.penjualan_mobil,
            R.drawable.mitubishi_pajero
        )

        val title = arrayOf(
            "Resmi Beroperasi di Indonesia, Berikut Harga dan Cara Pesan Starlink",
            "BMKG Antisipasi 'Kiamat' Megathrust, Investigasi Dimulai dari Batam",
            "Mobile Banking Jadi Target, Simak Jurus Lawan Modus Kuras Rekening",
            "Daftar 74 Negara yang Bebas Visa untuk Paspor Indonesia",
            "FIFA Akhirnya Buka Suara soal Rumput JIS",
            "Ini 9 Makanan Terbaik untuk Usia 50 Tahun ke Atas, Bikin Panjang Umur",
            "Harley-Davidson Indonesia Rilis Model 2024, Harga Mulai Rp815 Juta",
            "Sejumlah Pemimpin Negara Tiba di Bali, Hadiri World Water Forum ke-10",
            "Penjualan Mobil April 2024 Anjlok Gegara Efek Pemilu",
            "Mobil Sultan Mitsubishi Pajero Sport Elite Cuma 800 Unit"
        )

        val desc = arrayOf(
            "Jakarta, CNN Indonesia -- Penyedia jasa internet berbasis satelit, Starlink, resmi beroperasi di Indonesia. Beroperasinya layanan Starlink ditandai dengan kehadiran Elon Musk di Bali, Minggu (19/5) pagi.\n" +
                    "Musk tiba di Bandara Internasional Ngurah Rai Denpasar pada pagi hari ini. Kedatangan dia langsung disambut Menteri Koordinator Bidang Maritim dan Investasi Luhut Binsar Pandjaitan.\n" +
                    "\n" +
                    "Luhut menilai Starlink bisa membantu pemerintah memeratakan internet di Indonesia. Layanan ini juga dapat mengurangi jumlah titik buta internet di daerah-daerah terpencil.\n" +
                    "\n" +
                    "Kehadiran Musk di Bali tak hanya untuk meresmikan Starlink, tetapi turut memenuhi undangan World Water Forum (WWF) ke-10.\n" +
                    "\n" +
                    "Starlink merupakan layanan jaringan satelit orbital yang pengembangannya dimulai pada 2015. Starlink kini hadir di Tanah Air. Berikut daftar harga dan cara pesan Starlink.\n" +
                    "\n" +
                    "Masyarakat yang ingin menjadi pelanggan Starlink harus memiliki perangkat VSAT atau stasiun penerima sinyal.\n" +
                    "\n" +
                    "Perangkat VSAT ini memakan biaya terpisah dari langganan internetnya.\n" +
                    "\n" +
                    "Menurut informasi Starlink.com, terdapat dua VSAT yang ditawarkan.\n" +
                    "\n" +
                    "Pertama, VSAT yang digunakan pelanggan yang menetap di suatu lokasi seperti di area perumahan akan ditawarkan seharga Rp7.800.000.\n" +
                    "\n" +
                    "Kedua, VSAT yang digunakan pelanggan dengan mobilisasi tinggi seperti kapal yang aktif beroperasi di perairan ditawarkan seharga Rp43.721.590.\n" +
                    "\n" +
                    "Paket internet\n" +
                    "Starlink juga menawarkan beberapa paket layanan internet mulai dari paket personal hingga bisnis.\n" +
                    "\n" +
                    "Untuk layanan personal, terdapat tiga jenis paket yang ditawarkan yakni Residensial, Jelajah, dan Kapal.\n" +
                    "\n" +
                    "Paket Residensial menjadi paket yang relatif terjangkau dengan tawaran seharga Rp750.000 perbulan.\n" +
                    "\n" +
                    "Paket itu disebut cocok untuk pelanggan yang menetap di perumahan dan butuh internet berkecepatan tinggi tanpa batasan.\n" +
                    "\n" +
                    "Paket Jelajah ditawarkan mulai dari Rp990.000 per bulan. Paket ini dirancang untuk pelanggan yang gemar melakukan perjalanan darat seperti berkeliling menggunakan campervan, hidup berpindah-pindah atau seseorang yang kerap bertugas dia area pedalaman.\n" +
                    "\n" +
                    "Dalam paket Jelajah tersedia pula paket mobile prioritas yang ditawarkan seharga Rp4.345.000 perbulan. Harga itu untuk akses data internet sebesar 50 GB dan dipasangkan dengan VSAT seharga Rp43.721.590.\n" +
                    "\n" +
                    "Terakhir ada paket Kapal yang ditawarkan Rp4.345.000 per bulan untuk akses data internet sebesar 50 GB. Paket ini telah mencakup layanan global, penggunaan untuk berpergian dan berlayar, serta mendapat prioritas jaringan.\n" +
                    "\n" +
                    "Tersedia juga paket seharga Rp17.160.000 per bulan untuk paket internet sebesar 1 TB dan paket seharga Rp86.130.000 per bulan.\n" +
                    "\n" +
                    "Cara pesan Starlink\n" +
                    "Untuk memesan perangkat VSAT serta paket langganan internet dari Starlink, masyarakat bisa langsung melakukan pemesanan melalui situs web Starlink.com.\n" +
                    "\n" +
                    "Setelah memilih paket yang diinginkan, pelanggan diarahkan ke halaman pendaftaran dan wajib mengisi informasi kontak, alamat pengiriman, serta informasi penagihan.\n" +
                    "\n" +
                    "Terkait informasi penagihan saat ini terbatas untuk pembayaran menggunakan kartu kredit dan debit online. Langkah itu bertujuan untuk mengirim perangkat VSAT dan menagih biaya langganan layanan.\n" +
                    "\n" +
                    "Setelah pembayaran terkonfirmasi, perangkat akan dikirim.\n" +
                    "\n" +
                    "Untuk perangkat VSAT Residensial dikirim 1-2 minggu sementara perangkat VSAT Jelajah dan VSAT Kapal dikirim lebih lama yakni sekitar 3-4 minggu.",
            "Jakarta, CNN Indonesia -- Badan Meteorologi, Klimatologi, dan Geofisika (BMKG) mulai mempersiapkan ekspedisi investigasi fenomena kegempaan yang ada pada zona megathrust di Indonesia. Hal ini untuk mengantisipasi teror gempa megathrust yang bisa menjadi pemicu tsunami dahsyat dari pulau Sumatera hingga Sulawesi.\n" +
                    "Kepala BMKG Dwikorita Karnawati di Jakarta, Minggu, mengatakan bahwa investigasi fenomena kegempaan ke zona megathrust ini dilaksanakan dalam rangka penelitian dan pendataan yang dilakukan oleh BMKG, Badan Riset dan Inovasi Nasional (BRIN).\n" +
                    "\n" +
                    "Masing-masing zona megathrust yang akan diteliti mulai dari Subduksi Sunda, Subduksi Banda, Subduksi Sulawesi, Subduksi Lempeng Laut Filipina, Lempeng Laut Maluku, Subduksi Utara Papua, akan dijelajahi dalam misi ini.\n" +
                    "\n" +
                    "\"Segala sesuatunya sudah mulai kami persiapkan, Pusat Penelitian, Latihan dan Pengembangan untuk menyempurnakan model gempa bumi dan tsunami kita,\" ujarnya.\n" +
                    "\n" +
                    "Kepala Meteorologi Publik BMKG Andri Ramadhani mengatakan bahwa rangkaian ekspedisi dimulai di Batam, Kepulauan Riau dengan melewati beberapa kota di Indonesia hingga berakhir di Bitung, Sulawesi Utara pada Minggu, 25 Agustus 2024.\n" +
                    "\n" +
                    "Dalam perencanaannya, penelitian tersebut akan dilaksanakan serangkaian pelayaran panjang menggunakan kapal ekspedisi OceanXplorer milik OceanX.\n" +
                    "\n" +
                    "Para periset Tanah Air tak cuma meneliti fenomena kegempaan saja, tapi ekspedisi tersebut juga dilakukan untuk mengamati fenomena interaksi udara dan laut di perairan Indonesia.\n" +
                    "\n" +
                    "Sasarannya pada wilayah yang teridentifikasi sebagai lokasi terjadinya fenomena yang dapat mempengaruhi variabelitas cuaca dan iklim Indonesia, seperti Madden-Julian Oscillation (MJO) dan ocean dipole di laut Banda, Selatan Jawa, Barat Sumatera.\n" +
                    "\n" +
                    "BMKG Ingatkan Ancaman Sesar Sumatera Nyata dan Merusak\n" +
                    "BMKG menilai eksplorasi penelitian tersebut sudah sangat perlu dilakukan, karena perubahan sirkulasi udara dan lautan secara alami dan terkadang berkala, letusan gunung berapi, dan faktor lainnya mempengaruhi variabilitas iklim.\n" +
                    "\n" +
                    "Terlebih sebagaimana diungkapkan oleh Menteri Luhut Binsar Pandjaitan dalam rapat koordinasi beberapa hari lalu, baru 19 persen laut Indonesia yang dipetakan, sementara garis pantai Indonesia mencapai 108 ribu kilometer dan lebih dari 70 persen luas Indonesia adalah perairan.\n" +
                    "\n" +
                    "\"Persiapan tim sejauh ini sudah rampung bersama dengan Oceanx, BMKG membawa serta peralatan untuk mengukur parameter tadi, dan terus berkoordinasi, terutama dengan Kementerian Koordinator Maritim dan Investasi sebagai leading sektornya,\" ucap dia.",
            "Jakarta, CNN Indonesia -- Aplikasi mobile banking mulai menjadi sasaran para penjahat siber untuk menguras rekening calon korbannya. Simak cara pencegahannya.\n" +
                    "Berdasarkan Laporan Ancaman Keuangan Kaspersky 2023, serangan malware (program jahat) mobile banking dan phishing (pengelabuan buat mendapat data pribadi) terkait aset kripto meningkat cukup pesat selama tahun lalu.\n" +
                    "\n" +
                    "Menurut laporan tersebut, selama 2023 terjadi peningkatan substansial jumlah pengguna yang menghadapi Trojan mobile banking, dengan serangan terhadap pengguna Android melonjak sebesar 32 persen dibanding 2022.\n" +
                    "\n" +
                    "Trojan perbankan yang paling umum adalah Bian.h yang mencakup 22 persen dari seluruh serangan Android.\n" +
                    "\n" +
                    "Berdasarkan laporan Kaspersky, phishing terkait keuangan masih terus menjadi ancaman. Paling tinggi dialami pengguna individu sebanyak 30,68 persen dan 27,32 persen dari total serangan pada pengguna korporat.\n" +
                    "\n" +
                    "Para pelaku kejahatan siber yang menggunakan phishing melakukan aksinya dengan berbagai modus. Misalnya, upaya phishing dengan menggunakan nama merek toko elektronik yang cukup terkenal mencapai 41,65 persen.\n" +
                    "\n" +
                    "Serangan Phishing Meningkat 40 Persen Sepanjang 2023, Cek Targetnya\n" +
                    "Kemudian, ada juga penipuan terkait aset kripto 16 persen, dan aksi phishing dengan toko online atau e-shop mencatatkan hingga 41,65 persen.\n" +
                    "\n" +
                    "Situs terkenal yang paling sering ditiru oleh para penjahat siber itu yakni Amazon (34 persen), Apple (18,66 persen), dan Netflix (14,71 persen). Sementara, PayPal adalah sistem pembayaran yang paling ditargetkan dengan 54,73 persen.\n" +
                    "\n" +
                    "Lantas, bagaimana caranya agar bisa terhindar dari ancaman kejahatan siber tersebut? Berikut tipsnya:\n" +
                    "\n" +
                    "- Lebih aman mengunduh aplikasi hanya dari toko resmi seperti Google Play atau Amazon Appstore. Aplikasi dari pasar-pasar ini tidak 100 persen aman dari malware, namun mereka telah melalui pemeriksaan oleh perwakilan toko dan terdapat beberapa sistem penyaringan.\n" +
                    "\n" +
                    "- Periksa izin aplikasi yang Anda gunakan dan pikirkan baik-baik sebelum mengizinkan suatu aplikasi, terutama jika menyangkut izin berisiko tinggi seperti izin untuk menggunakan Layanan Aksesibilitas.\n" +
                    "\n" +
                    "- Pakai solusi keamanan andal yang dapat membantu mendeteksi aplikasi dan adware yang berbahaya.\n" +
                    "\n" +
                    "- Perbarui sistem operasi dan aplikasi penting saat pembaruan tersedia. Banyak masalah keamanan yang dapat diselesaikan dengan menginstall software versi terbaru.",
            "Jakarta, CNN Indonesia -- Melancong ke luar negeri sering menjadi alternatif liburan. Suasana baru, musim yang berbeda, maupun mengenal budaya lain merupakan beberapa tujuan orang melakukan perjalanan wisata ke luar negeri, begitupun dengan wisatawan dari Indonesia.\n" +
                    "Jumlah wisatawan Indonesia yang berwisata ke luar negara kian meningkat. Dibanding tahun lalu, data dari CEIC menunjukkan lonjakan jumlah wisatawan yang drastis.\n" +
                    "\n" +
                    "Pada Juli 2022, kunjungan bulanan wisatawan Indonesia ke luar negara jumlahnya hampir 650 ribu. Sedangkan pada Juli 2023, jumlahnya ada sekitar 1,1 juta kunjungan wisatawan Indonesia ke berbagai penjuru dunia.\n" +
                    "\n" +
                    "Visa merupakan dokumen izin dari negara tujuan untuk bisa masuk ke wilayahnya. Visa dapat berupa stempel atau stiker yang ditempel di halaman paspor.\n" +
                    "\n" +
                    "Akan tetapi, tidak semua negara tujuan mewajibkan visa bagi pelancong dari negara tertentu, termasuk Indonesia. Banyak memang negara di dunia yang masih mewajibkan turis asal Indonesia untuk memiliki visa bila berkunjung.\n" +
                    "\n" +
                    "Tapi, tidak sedikit pula negara yang telah membebaskan visa untuk para pemegang paspor RI. Setidaknya terdapat 74 negara yang membebaskan visa atau hanya membutuhkan Visa on Arrival atau eTA (Electronic Travel Authority, semacam e-Visa) untuk turis Indonesia.\n" +
                    "\n" +
                    "Berikut daftar lengkap negara bebas visa untuk turis Indonesia menurut Henley Passport Index.\n" +
                    "Wilayah Asia\n" +
                    "1. Brunei - 14 hari\n" +
                    "2. Filipina - 30 hari\n" +
                    "3. Hong Kong - 30 hari\n" +
                    "4. Jepang - 15 hari (hanya untuk pemegang e-paspor)\n" +
                    "5. Kamboja - 30 hari\n" +
                    "6. Kazakhstan - 30 hari\n" +
                    "7. Laos - 30 hari\n" +
                    "8. Makau - 30 hari\n" +
                    "9. Malaysia - 30 hari\n" +
                    "10. Myanmar - 14 hari\n" +
                    "11. Singapura - 30 hari\n" +
                    "12. Thailand - 30 hari\n" +
                    "13. Timor-Leste - 30 hari\n" +
                    "14. Uzbekistan - 30 hari\n" +
                    "15. Vietnam - 30 hari\n" +
                    "\n" +
                    "Visa on Arrival / e-Visa / eTA\n" +
                    "1. Azerbaijan - e-Visa / e-VoA di Baku International Airport\n" +
                    "2. India - e-Visa 90 hari \n" +
                    "3. Kyrgyzstan - VoA 30 hari, di Bandara Internasional Manas\n" +
                    "4. Maldives - VoA 30 hari\n" +
                    "5. Nepal - VoA 90 hari\n" +
                    "6. Pakistan - e-Visa 90 hari\n" +
                    "7. Sri Lanka - VoA 30 hari\n" +
                    "8. Tajikistan - e-Visa 45 hari",
            "Jakarta, CNN Indonesia -- FIFA mengeluarkan pernyataan resmi terkait kondisi rumput lapangan Jakarta International Stadium (JIS) yang sempat mendapat kritikan netizen saat menggelar laga Piala Dunia U-17 2023.\n" +
                    "FIFA lewat pernyataan resmi yang dirilis LOC Piala Dunia U-17 2023, Selasa (14/11), menyebut JIS dan ketiga stadion Piala Dunia U-17 2023 lainnya mampu memenuhi harapan FIFA.\n" +
                    "\n" +
                    "\"Semenjak pembukaan Piala Dunia U-17, keempat stadion di empat kota di tanah air telah menjamu 24 tim negara peserta dengan baik. Tak hanya itu, performa stadion Gelora Bung Tomo (GBT) di Jakarta, Stadion Manahan di Solo, Si Jalak Harupat di Kab. Bandung dan Jakarta International Stadium telah berhasil naik level ke taraf yang diharapkan, yakni level penyelenggaraan turnamen internasional,\" tulis pihak FIFA.\n" +
                    "\n" +
                    "Namun FIFA memastikan rumput JIS sudah memenuhi harapan FIFA dan tim peserta Piala Dunia U-17 2023.\n" +
                    "\"Menurut FIFA, seiring dengan berjalannya turnamen, JIS sudah teruji dengan optimal dalam skala internasional. Semua tim yang bertanding baik di Jakarta, Bandung, Surakarta dan Surabaya memuji kualitas stadion. Mereka menyatakan kepuasannya atas kualitas lapangan, baik di stadion pertandingan maupun di tempat Latihan.\"\n" +
                    "\n" +
                    "\"FIFA mengungkapkan kepuasan atas pencapaian ini serta mengapresiasi segala usaha PSSI dan pemerintah Indonesia yang telah memenuhi segala tugas dan standard renovasi semua stadion, termasuk untuk JIS. Sejak JIS terpilih sebagai salah satu stadion Piala Dunia U-17 2023, PSSI dan kementerian PUPR langsung tancap gas bekerja keras untuk meningkatkan kualitas stadion. Standard yang mesti tercapai adalah setidaknya memenuhi standard minimum FIFA sebagai lokasi penyelenggaraan pertandingan sekelas turnamen resmi FIFA,\" tulis pihak FIFA.\n" +
                    "\n" +
                    "FIFA kemudian menjelaskan rumput yang digunakan di JIS adalah jenis Zoysia, rumput yang biasa tumbuh di negara tropis. Senior Pitch Management Manager FIFA, Alan Ferguson, mengatakan meski ada faktor tantangan kelembapan dan curah hujan, kualitas rumput Zoysia yang dipakai di sepanjang Piala Dunia U-17 2023 terbilang baik.\n" +
                    "\n" +
                    "\"Rumput Zoysia yang digunakan di JIS merupakan hasil panenan dari rumput di lapangan kampus Universitas Pelita Harapan. Pemanenan rumput menggunakan mesin khusus yang dapat menggulung rumput seperti karpet dengan ketebalan lebih dari 4 cm. Proses penggantian rumput lapangan sangat dimonitor dengan ketat oleh tim manajemen lapangan FIFA. Di antaranya dengan pengecekan kualitas rumput dan lapangan setiap harinya,\" tulis pihak FIFA.\n",
            "Jakarta, CNN Indonesia -- Saat memasuki usia 50 tahunan, Anda harus memperhatikan asupan makanan. Apa saja makanan untuk usia 50 tahun ke atas?\n" +
                    "Usia 50 tahun jadi momen perubahan yang besar bagi setiap orang. Komitmen akan gaya hidup sehat benar-benar dibutuhkan pada fase hidup satu ini.\n" +
                    "\n" +
                    "Salah satunya adalah pola makan, yang bakal berubah seiring pertambahan usia.\n" +
                    "\n" +
                    "Ada beberapa makanan yang harus dihindari. Tapi, ada juga makanan yang justru wajib jadi menu hidangan harian.\n" +
                    "\n" +
                    "Makanan untuk usia 50 tahun ke atas\n" +
                    "Mengutip Eat This Not That, kebutuhan nutrisi pada usia 50 tahun akan meningkat karena berbagai hal.\n" +
                    "\n" +
                    "Pria usia 50 tahun ke atas dianjurkan mengonsumsi 30 gram buah beri sehari, sedangkan wanita 21 gram buah beri sehari.\n" +
                    "\n" +
                    "Senyawa antioksidan pada buah beri yang kuat dapat meningkatkan keterampilan motorik dan memori jangka pendek bagi otak yang menua.\n" +
                    "\n" +
                    "Sebuah studi pada 2020 menemukan, orang berusia 50 tahun ke atas dengan asupan antioksidan yang rendah dua hingga empat kali lebih mungkin terkena demensia.\n" +
                    "2. Kangkung, bayam\n" +
                    "Ilustrasi. Kangkung, salah satu makanan untuk usia 50 tahun ke atas. (iStockphoto/ferlistockphoto)\n" +
                    "Seiring pertambahan usia, tulang menjadi lebih lunak dan kebutuhan kalsium bertambah. Selain dari susu, Anda juga bisa mendapatkan asupan kalsium dari sayuran berdaun hijau tua seperti kangkung dan bayam.\n" +
                    "\n" +
                    "Sebuah penelitian yang diterbitkan dalam jurnal Nutrition menemukan, orang yang mengonsumsi sayuran berdaun hijau setiap hari memiliki kaki yang 11 persen lebih kuat.\n" +
                    "\n" +
                    "Tak hanya itu, senyawa antioksidan yang ditemukan pada sayuran berdaun hijau tua juga ditemukan dapat mencegah risiko demensia.\n" +
                    "\n" +
                    "3. Ikan tuna\n" +
                    "Ikan laut seperti tuna dan salmon menjadi sumber protein tanpa lemak yang dibutuhkan pada lanjut usia. Orang berusia 50 tahun ke atas direkomendasikan untuk mengonsumsi 5-6 ons protein setiap hari.\n" +
                    "\n" +
                    "Selain itu, ikan juga merupakan sumber vitamin B12 yang baik. Nutrisi satu ini hanya ditemukan pada sumber hewani yang semakin sulit diserap seiring bertambahnya usia.\n" +
                    "\n" +
                    "Tak cuma itu, kandungan asam lemak omega-3 pada ikan laut juga bisa menurunkan risiko kematian akibat penyakit kronis.\n" +
                    "\n" +
                    "Kebiasaan Ini Bikin Panjang Umur, Turunkan Risiko Kematian 39 Persen\n" +
                    "4. Kacang\n" +
                    "Dalam bentuk apa pun, kacang-kacangan adalah camilan yang tepat untuk usia 50 tahun ke atas.\n" +
                    "\n" +
                    "Mengutip Huffington Post, kacang sendiri dikenal sebagai sumber serat dan protein nabati yang baik. Serat adalah nutrisi utama untuk menjaga kesehatan jantung, pengelolaan gula darah, dan pengendalian berat badan.\n" +
                    "\n" +
                    "5. Dada ayam\n" +
                    "Orang usia 50 tahun ke atas juga dianjurkan untuk mengonsumsi protein tanpa lemak seperti dada ayam atau telur.\n" +
                    "\n" +
                    "Protein sangat penting untuk pemeliharaan otot, fungsi kekebalan, dan penyembuhan luka.\n" +
                    "\n" +
                    "6. Nasi merah\n" +
                    "Biji-bijian utuh adalah pilihan baik lainnya untuk orang usia 50 tahun ke atas. Salah satunya adalah beras merah yang kaya akan serat dan karbohidrat kompleks.\n" +
                    "\n" +
                    "Beras merah akan memberikan energi berkelanjutan, membantu pencernaan, membantu mengatur kadar gula darah, hingga mengurangi risiko penyakit metabolik.\n" +
                    "\n" +
                    "7. Jamur\n" +
                    "Ilustrasi. Jamur, salah satu makanan untuk usia 50 tahun ke atas. (iStockphoto/ahirao_photo)\n" +
                    "Jamur adalah makanan kaya potasium. Mengutip WebMD, potasium dapat membantu melawan efek negatif natrium serta menurunkan tekanan darah.\n" +
                    "\n" +
                    "Potasium sendiri merupakan mineral penting untuk kesehatan jantung. Potasium membantu tubuh memproses natrium dan mengendurkan pembuluh darah hingga menurunkan tekanan darah ke tingkat yang lebih sehat.\n" +
                    "\n" +
                    "Selain jamur, ada juga beberapa makanan lain yang kaya potasium seperti tomat, jeruk, kurma, dan yogurt.\n" +
                    "\n" +
                    "8. Telur\n" +
                    "Memasuki usia 50 tahun, massa otot akan menurun seiring berjalannya waktu. Anda membutuhkan makanan kaya protein seperti telur.\n" +
                    "\n" +
                    "9. Alpukat\n" +
                    "Alpukat dapat meningkatkan asupan lemak sehat yang baik buat jantung. Lemak sehat juga bisa membantu mencegah obesitas yang jadi faktor risiko berbagai penyakit kronis.\n" +
                    "\n" +
                    "Demikian beberapa makanan untuk usia 50 tahun ke atas. Semoga bermanfaat.",
"Jakarta, CNN Indonesia -- JLM Auto Indonesia sebagai APM serta distributor resmi untuk Harley-Davidson di Indonesia meluncurkan model year 2024, Minggu (12/5).\n" +
        "Harley-Davidson yang diluncurkan yakni H-D Street Glide, Road Glide dan Heritage Classic 114.\n" +
        "\n" +
        "Selain itu, JLM Auto Indonesia juga merilis dua varian terbatas Lowrider St 2024 dan Ultra Limited 2024 yang disebut Enthusiast Motorcycle Collection. Perbedaan utama dari varian ini ada pada pilihan warna Tobacco Fade.\n" +
        "\n" +
        "Warna Tobacco Fade terinspirasi dari lapisan kayu sunburst yang terdapat pada permukaan gitar, bass, dan drum pada 1960an.\n" +
        "\n" +
        "Warna ini hanya tersedia dengan jumlah yang sangat terbatasyaitu2.000 unit per model di seluruh dunia. Ciri khas pada model warna Tobacco Fade dapat dilihat dari grafis cat pada bagian sepatbor depan yang menyerupai logo band era 1960.\n" +
        "\n" +
        "Proses pengecatan warna Tobacco Fade dilakukan oleh Harley-Davidson menggunakan alat cat khusus, yang dirancang untuk memberikan efek gradasi pada panel bodi.\n" +
        "\n" +
        "Semua model baru Harley-Davidson ini dapat dilihat langsung pada pop-up store yang terletak di pusat perbelanjaan Senayan City Mall, Jakarta.\n" +
        "Gerry Kertowidjojo selaku Presiden Direktur JLM Auto Indonesia,berharap bahwa keberadaan pop-up store ini dapat menjadi kesempatan untuk mengenalkan produk-produk baru dan memperkuat hubungan dengan komunitas sepeda motor di Jakarta dan sekitarnya.\n" +
        "\n" +
        "\"Pop-up store di Senayan City Mall merupakan langkah strategis kami untuk memperluas jangkauan dan meningkatkan keterlibatan dengan konsumen. Kami berharap bahwa dengan kehadiran ini, kami dapat memperkuat ikatan kami dengan komunitas sepeda motor di Jakarta dan sekitarnya serta kami pun menghadirkan jajaran produk terbaru,\" ucap Gerry.\n" +
        "\n" +
        "Daftar harga Harley-Davidson model 2024:\n" +
        "\n" +
        "- Street Glide: Rp1.101.009.000\n" +
        "- Road Glide: Rp1.115.550.000\n" +
        "- Heritage Classic 114: Rp815.073.000\n" +
        "- Low Rider ST Tobacco Fade: Rp927.849.000\n" +
        "- Ultra Limited Tobacco Fade: Rp1.399.155.000.",
            "Jakarta, CNN Indonesia -- Sejumlah pemimpin negara telah tiba di Bali untuk menghadiri forum air terbesar di dunia, atau World Water Forum ke-10 yang digelar pada 18-25 Mei 2024.\n" +
                    "Perdana Menteri Tajikistan, Qohir Rasulzoda, menjadi salah satu pemimpin negara yang hadir. Beliau tiba di Bandara I Gusti Ngurah Rai pada Sabtu (18/5) sekitar pukul 17.20 WITA.\n" +
                    "\n" +
                    "Sebelumnya, pada pagi harinya untuk kepentingan yang sama mantan Presiden Hungaria Janos Ader dan Wakil Perdana Menteri Papua Nugini John Rosso juga hadir di Bali.\n" +
                    "\n" +
                    "Kedatangan tamu negara tersebut disambut secara kenegaraan oleh Pasukan Kehormatan atau Pasukan Cordon dari Pasukan Pengaman Presiden (Paspampres), yang merupakan prajurit militer TNI Angkatan Darat terbaik.\n" +
                    "\n" +
                    "Didampingi pejabat teras Kementerian Perhubungan (Kemenhub) ketiganya juga disambut tari-tarian oleh sekelompok penari khas Bali, Sekar Jagat.\n" +
                    "\n" +
                    "Tari Sekar Jagat merupakan tarian pembukaan atau penyambutan dalam suatu acara formal maupun acara balih-balihan. Tarian tersebut menggambarkan kegembiraan menyambut para tamu yang hadir.\n" +
                    "\n" +
                    "Sekitar pukul 18.25 WITA, Presiden Sri langka Ranil Wickremesinghe direncanakan mendarat di Bandara I Gusti Ngurah Rai. Untuk hari ini, terakhir dijadwalkan pada pukul 20.50 WITA, Presiden Fiji Ratu Wiliame Maivalili Katonivere sampai di Bali.\n" +
                    "\n" +
                    "World Water Forum ke-10 nanti akan berfokus pada empat hal, yakni konservasi air (water conservation), air bersih dan sanitasi (clean water and sanitation), ketahanan pangan dan energi (food and energy security), serta mitigasi bencana alam (mitigation of natural disasters).",
            "Jakarta, CNN Indonesia -- Sederet Agen Pemegang Merek (APM) otomotif mengungkap analisanya masing-masing soal kondisi penjualan mobil yang anjlok pada April 2024. Sejumlah alasan diutarakan, mulai dari kondisi libur Idulfitri, agenda kontestasi politik termasuk Pemilu, perekonomian global dan sejumlah faktor lain yang mempengaruhinya.\n" +
                    "Penjualan mobil anjlok 34,9 persen pada April dibanding Maret. Selama empat bulan berjalan tahun ini, April menjadi sisi paling gelap yang justru datang saat penjualan sedang bagus-bagusnya tahun ini.\n" +
                    "Data Gabungan Industri Kendaraan Bermotor Indonesia (Gaikindo) menunjukkan distribusi dari pabrik ke dealer (wholesales) cuma tembus 48.637 unit pada April. Sedangkan Maret mencapai 74.724 unit yang merupakan titik tertinggi sepanjang tahun ini.\n" +
                    "\n" +
                    "Penjualan ritel atau pengiriman dealer ke konsumen pada April tak kalah suram. Angkanya turun 28,4 persen ketimbang Maret, dari 82.088 unit menjadi 58.779 unit.\n" +
                    "\n" +
                    "Jika dibanding tahun lalu penjualan April turun 17,5 persen dari sebelumnya 58.981 unit.\n" +
                    "\n" +
                    "Marketing Director Suzuki Indomobil Sales (SIS) Harold Donnel menuding kenaikan suku bunga yang ditetapkan Bank Indonesia (BI) dan momentum Idulfitri 2024 menjadi sederet faktor penyebabnya.\n" +
                    "\n" +
                    "\"Dengan beberapa kondisi di atas, Suzuki meyakini hal tersebut merupakan tantangan yang cukup besar bagi Suzuki dan juga industri. Maka dari itu Suzuki telah bersiap untuk menjalankan beberapa strategi bertahan dan harapannya akan segera kembali normal,\" kata dia kepada CNNIndonesia.com, Kamis (16/5).\n" +
                    "\n" +
                    "Harold menjelaskan beberapa strategi perusahannya untuk mempertahankan pangsa pasar sebesar 8,6 persen sepanjang tahun ini. Suzuki sudah menjual 22.787 unit selama periode itu.\n" +
                    "\n" +
                    "Salah satu sektor diupayakan adalah fokus di penjualan kendaraan fleet dibandingkan perseorangan, sehingga hasil penjualan tetap bisa bertahan di tengah kondisi market individu yang cukup dinamis.\n" +
                    "\n" +
                    "\"Secara berkala pun Suzuki terus memantau arah pergerakan pasar sehingga dapat memprediksi kondisi-kondisi mendatang dan menyesuaikan kembali strategi penjualan kami,\" tuturnya.\n" +
                    "\n" +
                    "Sementara Sales & Marketing and After Sales Director PT Honda Prospect Motor (HPM) Yusak Billy yang dihubungi terpisah menilai terpuruknya penjualan pada April dipengaruhi kontestasi politik, Pemilu, pada 14 Februari lalu.\n" +
                    "\n" +
                    "Tak hanya faktor politik. merek berlogo H asal Jepang itu juga menuding kondisi perekonomian global dan nasional berpengaruh pula terhadap penjualan otomotif di Tanah Air.\n" +
                    "\n" +
                    "\"Penjualan mobil di kuartal pertama tahun ini memang banyak dipengaruhi faktor politik dan ekonomi baik global dan nasional yah,\" kata dia kepada CNNIndonesia.com, Rabu (15/5).\n" +
                    "\n" +
                    "Ia menjelaskan kenaikan suku bunga BI sebesar 25 bps menjadi kini 6,25 persen dan pengetatan persetujuan kredit dari lembaga pembiayaan juga jadi penyebabnya.\n" +
                    "\n" +
                    "Yusak menilai para calon konsumen menahan diri membeli mobil karena situasi dinilai belum stabil.\n" +
                    "\n" +
                    "\"Kami memiliki beberapa strategi seperti penawaran penjualan yang meringankan hingga memperluas jaringan layanan purna jual untuk memudahkan konsumen dalam memiliki dan merawat kendaraannya,\" kata dia.",
            "Jakarta, CNN Indonesia -- PT Mitsubishi Motors Krama Yudha Sales Indonesia (MMKSI) menampilkan wujud Mitsubishi Pajero Sport dan Xpander Cross Elite Limited Edition yang masing-masing hanya diproduksi 800 unit di pusat perbelanjaan di Jakarta, Kamis (16/5).\n" +
                    "Atsushi Kurita, President Director PT MMKSI mengatakan kedua model edisi terbatas itu untuk konsumen yang ingin tampil lebih eksklusif.\n" +
                    "\n" +
                    "\"Kami ingin memberikan penyegaran produk serta pilihan yang lebih luas bagi konsumen yang menginginkan model yang lebih tegas, lebih mewah, dan lebih eksklusif dibandingkan dengan model reguler,\" kata Kurita.\n" +
                    "\n" +
                    "Eksterior kedua varian ini menyuguhkan warna two-tone dan aksesori baru, yang diklaim Mitsubishi bisa mengakomodir keinginan dari konsumen.\n" +
                    "\n" +
                    "Pajero Sport Elite Limited Edition\n" +
                    "Mitsubishi Pajero Sport Elite Limited Edition, merupakan varian edisi terbatas yang dikembangkan dengan basis Mitsubishi Pajero Sport Dakar 4x2, dan tersedia hanya dalam 1 varian dan 1 pilihan warna, yakni Quartz White Pearl.\n" +
                    "\n" +
                    "Pada sisi eksterior dijejali highlight utama warna two-tone putih dan hitam, serta beragam aksesoris seperti Black Front Grille, Black Front Under Garnish, Black Headlamp Extension, Black Alloy Wheel, Black Roof, Black Roof Rail, Engine Hood Emblem, Black Shark-Fin Antenna, Black Rear Spoiler, Elite Limited Edition Emblem, Black Rear Under Garnish, dan Exhaust Finisher.\n" +
                    "\n" +
                    "Sedangkan pada sisi interior Mitsubishi Pajero Sport Elite Limited Edition dibenamkan audio premium, yang meningkatkan kenyamanan hiburan dalam kabin dan juga prestise bagi penggunanya.\n" +
                    "\n" +
                    "Dengan basis Mitsubishi Pajero Sport Dakar 4x2, Mitsubishi Pajero Sport Elite Limited Edition tidak hanya mendapatkan penyegaran dari sisi eksterior, dan interior, namun juga dilengkapi dengan semua fitur unggulan yang terdapat pada Pajero Sport Dakar 4x2.\n" +
                    "\n" +
                    "Xpander Cross Elite Limited Edition\n" +
                    "Mitsubishi Xpander Cross Elite Limited Edition, merupakan varian edisi terbatas yang dikembangkan dengan basis Mitsubishi Xpander Cross Premium CVT, dan tersedia hanya dalam 1 varian dan 2 pilihan warna, yakni Quartz White Pearl, dan Green Bronze.\n" +
                    "\n" +
                    "Pada Mitsubishi Xpander Cross Elite Limited Edition, perusahaan memodali mobil ini dengan tampilan berbeda dari aksesori seperti Black Roof dan Pillar, Black Door Mirror, Black Shark Fin Antenna, Engine Hood Emblem, dan Elite Limited Edition Emblem.\n" +
                    "\n" +
                    "Pada sisi interior Mitsubishi Xpander Cross Elite Limited Edition juga dilengkapi dengan audio premium yang meningkatkan kenyamanan hiburan dalam kabin dan juga prestise bagi penggunanya.\n" +
                    "\n" +
                    "Mitsubishi Xpander Cross Elite Limited Edition tidak hanya mendapatkan penyegaran dari sisi eksterior, dan interior, namun juga dilengkapi dengan semua fitur unggulan yang terdapat pada Xpander Cross Premium CVT.\n" +
                    "\n" +
                    "Harga dan ketersediaan\n" +
                    "Pajero Sport Elite Edition dipasarkan di Indonesia sebanyak hanya sebanyak 800 unit, dengan harga on the road Rp661.400.000 untuk wilayah Jabodetabek.\n" +
                    "\n" +
                    "Sedangkan Xpander Cross Elite Limited Edition dipasarkan di Indonesia hanya sebanyak 800 unit, dengan harga on the road Rp361.150.00 untuk wilayah Jabodetabek.\n" +
                    "\n" +
                    "Bagi yang hendak melihat langsung penampakan kedua mobil Mitsubishi edisi khusus ini bisa mengunjungi mall Kota Kasablanka, pada periode 16 - 19 Mei 2024. Pada periode yang sama dua varian terbatas ini juga dipamerkan di Pekanbaru, dan Semarang."
        )

        beritaArraylist = ArrayList()
        for (i in imageId.indices) {
            val berita = Berita(title[i], desc[i], imageId[i])
            beritaArraylist.add(berita)
        }

        binding.listView.isClickable = true
        binding.listView.adapter = BeritaAdapter(requireActivity(), beritaArraylist)
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val title = title[position]
            val desc = desc[position]
            val imageId = imageId[position]

            val i = Intent(requireActivity(), DetailBerita::class.java)
            i.putExtra("title", title)
            i.putExtra("desc", desc)
            i.putExtra("imageId", imageId)
            startActivity(i)
        }

        // Return the root view of the fragment
        return binding.root
    }
}