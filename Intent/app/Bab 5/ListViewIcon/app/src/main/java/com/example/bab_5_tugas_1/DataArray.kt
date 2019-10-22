import com.example.bab_5_tugas_1.R

object DataArray { //untuk menampung data array

    private val languages = listOf("Ruby", "Rails", "Python", "JavaScript", "PHP")

    val desk = listOf(
        "Ruby is an open source and fuly object oriented programming languages",
        "Rails is a server side web application development framework writen in ruby languages",
        "Python is interpreted scripting and object oriented programming languages",
        "Java Script is an objected based scripting language",
        "PHP is an interepted language, there is no need for compilation"
    )

    private val pictDat = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    val listData: ArrayList<GetSetArray>
        get() {
            val list = arrayListOf<GetSetArray>()
            for (position in languages.indices) {
                val listDat = GetSetArray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}