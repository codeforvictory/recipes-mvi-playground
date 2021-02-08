package org.codeforvictory.android.recipes.data.api.recipe

import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMeal
import org.codeforvictory.recipes.domain.common.model.meal.Meal
import javax.inject.Inject

class AdaptToMeal @Inject constructor() {

    operator fun invoke(apiMeal: ApiMeal): Meal {
        return with(apiMeal) {
            Meal(
                id = id,
                name = name,
                imageThumbUrl = imageThumbnailUrl,
            )
        }
    }
}
