package fooddelivery.service;

import java.util.List;


public interface FoodService {

	FoodDto createFood(FoodDto food);
	FoodDto getFoodById(String foodId);
	FoodDto updateFoodDetails(String foodId, FoodDto foodDetails);
	void deleteFoodItem(String id);
	List<FoodDto> getFoods();
}
