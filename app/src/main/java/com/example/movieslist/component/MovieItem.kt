package com.example.movieslist.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.domain.Movie


@Preview(showBackground = true)

@Composable
fun MovieItem(
    @PreviewParameter(PreviewMovieProvider::class)
    movie: Movie,
    imageLoader: ImageLoader,
) {


    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
            .background(MaterialTheme.colors.surface)
            .clickable {
                Log.i("AppDebug TAG", "MovieListItem movie.id: "+movie.id)
//                onSelectMovie(movie)
            },
        elevation = 0.dp
    ) {


        Row(
            modifier = Modifier
               // .fillMaxSize()
                .padding(all = 10.dp),
           // verticalAlignment = Alignment.CenterVertically,
           // horizontalArrangement = Arrangement.Start
        ) {
            val overlayImage =
                "https://images6.alphacoders.com/488/thumb-1920-488158.jpg"

            val painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(overlayImage)
                    .size(coil.size.Size.ORIGINAL) // Set the target size to load the image at.
                    .build()
            )

            if (painter.state is AsyncImagePainter.State.Loading) {
                CircularProgressIndicator()
            } else {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(104.dp)
                        .clip(RoundedCornerShape(size = 8.dp)),
                    painter = painter,
                    contentScale = ContentScale.Crop,
                    contentDescription = "photo"
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 15.dp, top = 5.dp, bottom = 5.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceAround
            ) {


                Text(
                    text = movie.title?:"",
                    style = MaterialTheme.typography.h4
                        /*.merge(TextStyle(fontWeight = FontWeight.W600, fontSize = 23.sp))*/,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

//                Text(
//                    text = movie.overview,
//                    style = MaterialTheme.typography.subtitle2,
//                    maxLines = 1,
//                    overflow = TextOverflow.Ellipsis
//                )

                Card(
                    elevation = 0.dp,
                    shape = RoundedCornerShape(25.dp),
                    backgroundColor = Color(0x549FA4C2),

                    ) {
                    Row(
                        modifier = Modifier.padding(all = 12.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

//                        Icon(
//                            modifier = Modifier
//                                .width(20.dp)
//                                .height(20.dp),
//                            painter = painterResource(R.drawable.ic_baseline_calendar_today_24),
//                            contentDescription = movie.release_date,
//                            //tint = Color.Cyan
//                        )
//
//                        val dates = movie.release_date.split("-").toTypedArray()
//                        Text(
//                            modifier = Modifier.padding(start = 4.dp), text = dates[0],
//                            style = MaterialTheme.typography.caption,
//                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Card(
                        elevation = 0.dp,
                        shape = RoundedCornerShape(25.dp),
                        backgroundColor = Color(0x549FA4C2),

                        ) {
                        Row(
                            modifier = Modifier.padding(all = 12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

//                            Icon(Icons.Filled.Group, movie.vote_count.toString())


//                            Text(
//                                modifier = Modifier.padding(start = 4.dp),
//                                text = movie.vote_count.toString(),
//                                style = MaterialTheme.typography.caption,
//                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Card(
                        elevation = 0.dp,
                        shape = RoundedCornerShape(25.dp),
                        backgroundColor = Color(0x549FA4C2),

                        ) {
                        Row(
                            modifier = Modifier.padding(all = 12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {

//                            Icon(
//                                modifier = Modifier
//                                    .width(20.dp)
//                                    .height(20.dp),
//                                painter = painterResource(R.drawable.ic_baseline_star_24),
//                                contentDescription = movie.vote_count.toString(),
//                                //tint = Color.Cyan
//                            )
//                            Text(
//                                modifier = Modifier.padding(start = 4.dp),
//                                text = movie.vote_average.toString(),
//                                style = MaterialTheme.typography.caption,
//                            )
                        }
                    }


                }


            }



        }


    }

}
