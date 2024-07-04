package com.example.bestuniversities.domain

import com.example.bestuniversities.R
import com.example.bestuniversities.data.ItemData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor(

) : AppRepository {

    private val ls = ArrayList<ItemData>()

    override fun itemList(): ArrayList<ItemData> {
        ls.clear()

        ls.add(
            ItemData(
                photo = R.drawable.massachusetts,
                nameUnivers = "Massachusetts Institute of Technology",
                definition = R.string.mit_students_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.cambridge,
                nameUnivers = "University of Cambridge",
                definition = R.string.university_of_cambridge_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.oxford,
                nameUnivers = "University of Oxford",
                definition = R.string.university_of_oxford_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.harvard,
                nameUnivers = "Harvard University",
                definition = R.string.harvard_university_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.stanford,
                nameUnivers = "Stanford University ",
                definition = R.string.stanford_university_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.imperial,
                nameUnivers = "Imperial College London",
                definition = R.string.imperial_college_london_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.eth,
                nameUnivers = "ETH Zurich (Swiss Federal Institute of Technology)",
                definition = R.string.eth_zurich_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.national,
                nameUnivers = "National University of Singapore (NUS)",
                definition = R.string.national_university_of_singapore_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.ucl,
                nameUnivers = "UCL (University College London)",
                definition = R.string.university_college_london_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.ucb,
                nameUnivers = "University of California, Berkeley (UCB)",
                definition = R.string.uc_berkeley_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.chicago_unve,
                nameUnivers = "University of Chicago",
                definition = R.string.uchicago_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.pennsylvania,
                nameUnivers = "University of Pennsylvania ",
                definition = R.string.upenn_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.cornell,
                nameUnivers = "Cornell University",
                definition = R.string.cornell_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.melbourne,
                nameUnivers = "University of Melbourne",
                definition = R.string.unimelb_info
            )
        )
        ls.add(
            ItemData(
                photo = R.drawable.technology,
                nameUnivers = "California Institute of Technology (Caltech)",
                definition = R.string.caltech_info
            )
        )
        return ls
    }


}