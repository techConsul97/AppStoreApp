package com.sebqv97.myapplication.presentation.apps_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sebqv97.myapplication.R
import com.sebqv97.myapplication.domain.model.AppDetails
import com.sebqv97.myapplication.presentation.apps_list.AppsListViewModel

@Composable
fun EditorsPickSection(
    modifier: Modifier = Modifier,
    viewModel: AppsListViewModel = hiltViewModel()
) {
    val appsState by viewModel.appsListState
    Box(modifier = modifier.fillMaxWidth()) {
        Column() {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Editor's Choice")
                TextButton(
                    onClick = { /*TODO*/ },
                    elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp)
                ) {
                    Text(text = "MORE", color = Color(0xffEC6A23))


                }
            }
            LazyRow {
                itemsIndexed(items = appsState.editorPick) { index, item ->
                    EditorsPickCard(
                        painter = painterResource(id = R.drawable.editors_choice_20360529),
                        title = item.name,
                        appDetails = item
                    )
                }

            }
        }
    }
}


@Composable
fun EditorsPickCard(
    modifier: Modifier = Modifier,
    painter: Painter,
    title: String,
    appDetails: AppDetails
) {
    Card(
        modifier = modifier.fillMaxWidth().padding(10.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box( contentAlignment = Alignment.BottomStart) {
            Image(painter = painter, contentDescription = title, contentScale = ContentScale.Crop,
            modifier = Modifier.size(width = 350.dp, height = 220.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Column() {
                    Text(text = appDetails.name)
                    Row(horizontalArrangement = Arrangement.Start) {
                        Icon(imageVector = Icons.Outlined.Star, contentDescription = null)
                        Text(text = "Rating")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun EditorPickPreview() {
    EditorsPickSection()

}