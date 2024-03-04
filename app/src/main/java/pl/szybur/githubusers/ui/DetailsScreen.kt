package pl.szybur.githubusers.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import pl.szybur.githubusers.viemodels.DetailsViewModel

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    val detailsViewModel: DetailsViewModel = hiltViewModel()
    DetailsPanel(
        modifier = modifier,
        details = detailsViewModel.details
    )
}