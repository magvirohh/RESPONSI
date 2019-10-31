package com.uty.responsi5170411350

object detail {
    private val itemName = arrayOf(
        "Sayur asem",
        "Bakso",
        "Bakwan",
        "Burger",
        "Crab",
        "Mie",
        "Nasi goreng",
        "Pempek",
        "Rendang",
        "Sosis")
    private val itemDetail = arrayOf(
        "Rp.10000 Pakai Nasi",
        "Rp.15000",
        "Rp.500",
        "Rp.20000",
        "Rp.100000",
        "Rp.15000",
        "Rp.16000",
        "Rp.10000",
        "Rp.18000",
        "Rp.10000")
    private val itemImage = arrayOf(
        "https://upload.wikimedia.org/wikipedia/commons/f/f1/Sayur_asem.JPG",
        "https://upload.wikimedia.org/wikipedia/commons/0/0d/Bakso_in_bowl_on_blue_table.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/1/17/Bakwan_%28seafood_cake_with_whole_shrimp%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/0/0a/Klompus_Burger_and_French_Fries.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/5/5e/Kepiting_saus_padang.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/9/99/Kiasu%2C_Bayswater%2C_London_%283954932031%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/c/ca/Nasi_goreng_%28336231863%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/4/49/Pempek_Bangka.JPG",
        "https://upload.wikimedia.org/wikipedia/commons/1/13/Lamb_rendang.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/7/7e/Wiki-ID_-_Foto_sosis_meetup_19_Januari_2014.JPG"
    )
    val listItem: ArrayList<carditem>
        get() {
            val list = arrayListOf<carditem>()
            for (position in itemName.indices) {
                val item = carditem()
                item.name = itemName[position]
                item.detail = itemDetail[position]
                item.poster = itemImage[position]
                list.add(item)
            }
            return list
        }
}