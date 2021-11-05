package com.nurul.myuts

class PakaianAdatData {
    private val pakaianAdatnames = arrayOf(
        "Pakaian Adat Aceh",
        "Pakaian Adat Bengkulu",
        "Pakaian Adat Jogjakarta",
        "Pakaian Adat Lampung",
        "Pakaian Adat Sumsel",
        "Pakaian Adat Sumut"
    )
    private val pakaianAdatDeskripsi = arrayOf(
        "Baju adat asal Serambi Mekah, Aceh bernama Ulee Balang",
        "Baju adat bernama Melayu Bengkulu yang Bersulam emas serta lengkap dengan mahkotanya .",
        "Baju adatnya dinamakan dodotan dengan kain dodot 5 meter bermotif smene raja.",
        "Pakaian tradisionalnya berwarna putih dengan lengan panjang. Bawahannya mengenakan celana hitam yang panjang",
        "Berbekal kejayaan Sriwijaya lalu, maka baju adat dari provinsi ini pun menampilkan keanggunan dan keagungan kerajaan.",
        "inamakan kain ulos dan selalu ada di setiap acara adat."
    )

    private val pakaianAdatPoto = intArrayOf(
        R.drawable.aceh,
        R.drawable.bengkulu,
        R.drawable.jogjakarta,
        R.drawable.lampung,
        R.drawable.sumsel,
        R.drawable.sumut
    )

    val listData: ArrayList<PakaianAdat>
        get() {
            var list = arrayListOf<PakaianAdat>()
            for (position in pakaianAdatnames.indices) {
                val pakaianadat = PakaianAdat()
                pakaianadat.name = pakaianAdatnames[position]
                pakaianadat.deskripsi = pakaianAdatDeskripsi[position]
                pakaianadat.poto = pakaianAdatPoto[position]
                list.add(pakaianadat)
            }
            return list
        }
}