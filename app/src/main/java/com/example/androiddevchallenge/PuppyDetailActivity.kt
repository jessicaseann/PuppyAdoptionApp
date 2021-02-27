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
package com.example.androiddevchallenge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

class PuppyDetailActivity : AppCompatActivity() {
    lateinit var puppy: Puppy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        puppy = intent.getParcelableExtra(EXTRA_PUPPY_DATA) ?: Puppy()
        setContent {
            MyTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.scrollable(
                            state = ScrollableState { 0.0F },
                            orientation = Orientation.Vertical
                        )
                    ) {
                        CoilImage(
                            data = puppy.imageUrl.firstOrNull() ?: "",
                            contentDescription = puppy.description,
                            modifier = Modifier
                                .height(300.dp)
                                .fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )

                        Column(Modifier.padding(16.dp)) {
                            Row {
                                Text(
                                    text = puppy.name,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray
                                )
                                Text(
                                    text = "(${puppy.gender.toString().toLowerCase()})",
                                    fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic,
                                    modifier = Modifier
                                        .padding(start = 4.dp, top = 2.dp)
                                        .align(Alignment.CenterVertically)
                                )
                            }

                            Text(
                                text = "Dog Breed: ${puppy.type}",
                                color = Color.Gray
                            )
                            Text(
                                text = if (puppy.ageInMonth >= 12) "Age: ${puppy.ageInMonth / 12} years old"
                                else "Age: ${puppy.ageInMonth} months old",
                                color = Color.Gray
                            )
                            Spacer(modifier = Modifier.size(16.dp))
                            Text(
                                text = puppy.description,
                                color = Color.Gray,
                                fontFamily = FontFamily.SansSerif,
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.size(32.dp))

                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Adopt me!",
                                    color = Color.White,
                                    modifier = Modifier.padding(vertical = 8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    companion object {
        private const val EXTRA_PUPPY_DATA = "extra_puppy"

        fun getCallingIntent(context: Context, puppy: Puppy): Intent =
            Intent(context, PuppyDetailActivity::class.java)
                .putExtra(EXTRA_PUPPY_DATA, puppy)
    }
}
