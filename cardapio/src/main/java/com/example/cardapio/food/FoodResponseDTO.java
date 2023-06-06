package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String imagem, Integer price ) {

	public FoodResponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getImagem(), food.getPrice());
	}
}
