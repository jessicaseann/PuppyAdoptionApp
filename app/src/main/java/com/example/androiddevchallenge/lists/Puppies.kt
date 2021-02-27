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
package com.example.androiddevchallenge.lists

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Puppy
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyList(
    puppies: List<Puppy>,
    onClick: (Puppy) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        LazyColumn(Modifier.fillMaxWidth()) {
            items(puppies) { puppy ->
                PuppyListItem(
                    puppy = puppy,
                    onClick = onClick,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
private fun PuppyListItem(
    puppy: Puppy,
    onClick: (Puppy) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Card(
            elevation = 2.dp,
            shape = RoundedCornerShape(8),
            modifier = Modifier.clickable(onClick = { onClick(puppy) })
        ) {
            Row {
                CoilImage(
                    data = puppy.imageUrl[0],
                    contentDescription = "",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(8, 0, 0, 8))
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = puppy.name,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray,
                        fontFamily = FontFamily.SansSerif
                    )

                    Text(
                        text = puppy.type,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.DarkGray,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Italic
                    )

                    Text(
                        text = if (puppy.gender == Gender.MALE) "male" else "female",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.LightGray,
                        fontFamily = FontFamily.SansSerif
                    )

                    Text(
                        text = if (puppy.ageInMonth >= 12) "${puppy.ageInMonth / 12} years old"
                        else "${puppy.ageInMonth} months old",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.LightGray,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
        }
    }
}
