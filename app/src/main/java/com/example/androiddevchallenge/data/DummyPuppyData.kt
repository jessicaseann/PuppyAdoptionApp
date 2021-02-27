/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Puppy

object DummyPuppyData {

    fun getDummyPuppies(): List<Puppy> {

        val puppy1 = Puppy(
            name = "Scott",
            type = "Chow Chow",
            gender = Gender.MALE,
            ageInMonth = 12,
            description = "The Chow Chow is a dog breed originally from northern China. The Chow Chow is a sturdily built dog, square in profile, with a broad skull and small, triangular, erect ears with rounded tips. " +
                "The breed is known for a very dense double coat that is either smooth or rough. " +
                "\n\n I am very cute, adopt me",
            imageUrl = listOf("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/01_Chow_Chow.jpg/1200px-01_Chow_Chow.jpg")
        )
        val puppy2 = Puppy(
            name = "Pudding",
            type = "Samoyed",
            gender = Gender.FEMALE,
            ageInMonth = 20,
            description = "The Samoyed is a breed of medium-sized herding dogs with thick, white, double-layer coats. They are related to the laika, a spitz-type dog. It takes its name from the Samoyedic peoples of Siberia. " +
                "These nomadic reindeer herders bred the fluffy white dogs to help with herding.",
            imageUrl = listOf("https://www.rover.com/blog/wp-content/uploads/2019/11/samoyed-puppy-in-grass.jpg")
        )
        val puppy3 = Puppy(
            name = "Shaggy",
            type = "Maltese",
            gender = Gender.FEMALE,
            ageInMonth = 3,
            description = "The Maltese is a breed of dog in the toy group. It is thought to have originated in south-central Europe from dogs of spitz type. " +
                "Despite the name, it has no verified historic or scientific connection to the island of Malta.",
            imageUrl = listOf("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/08152421/Maltese-laying-down-in-a-chair.jpg")
        )
        val puppy4 = Puppy(
            name = "Cookie",
            type = "Corgi",
            gender = Gender.MALE,
            ageInMonth = 6,
            description = "The Pembroke Welsh Corgi is a cattle herding dog breed that originated in Pembrokeshire, Wales. It is one of two breeds known as a Welsh Corgi." +
                " The other is the Cardigan Welsh Corgi, and both descend from the line of northern spitz-type dogs.",
            imageUrl = listOf("https://mymodernmet.com/wp/wp-content/uploads/2020/10/cooper-baby-corgi-dogs-8.jpg")
        )
        val puppy5 = Puppy(
            name = "Oreo",
            type = "Pomerian",
            gender = Gender.MALE,
            ageInMonth = 8,
            description = "The Pembroke Welsh Corgi is a cattle herding dog breed that originated in Pembrokeshire, Wales. It is one of two breeds known as a Welsh Corgi. " +
                "The other is the Cardigan Welsh Corgi, and both descend from the line of northern spitz-type dogs. ",
            imageUrl = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIh1yOXsKzUeKQy6cNWL06PsvkT84ovEXMtw&usqp=CAU")
        )
        val puppy6 = Puppy(
            name = "Silvanna",
            type = "Siberian Husky",
            gender = Gender.FEMALE,
            ageInMonth = 12,
            description = "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. It is recognizable by its thickly furred double coat, erect triangular ears," +
                " and distinctive markings, and is smaller than the similar-looking Alaskan Malamute. ",
            imageUrl = listOf("https://www.thesprucepets.com/thmb/VJpRmcCyJCRbVmox-yx3FqUJWZ8=/1000x1000/smart/filters:no_upscale()/breed_profile_husky_1118000_hero_690-0158e427a4734e0fae59e2e91a7fe6e4.jpg")
        )
        return listOf(
            puppy6, puppy4, puppy1, puppy2,
            puppy3, puppy5
        )
    }
}
