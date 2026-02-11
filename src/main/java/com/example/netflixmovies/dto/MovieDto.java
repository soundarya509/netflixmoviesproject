package com.example.netflixmovies.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MovieDto {

	    private Long id;

	    @NotBlank(message = "Title is required")
	    private String title;

	    @NotBlank(message = "Description is required")
	    private String description;

	    @NotBlank(message = "Genre is required")
	    private String genre;

	    @NotNull(message = "Duration is required")
	    @Positive(message = "Duration must be greater than 0")
	    private Integer duration;

	    @NotNull(message = "Rating is required")
	    @Positive(message = "Rating must be greater than 0")
	    private Double rating;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public Integer getDuration() {
			return duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Double getRating() {
			return rating;
		}

		public void setRating(Double rating) {
			this.rating = rating;
		}

	   
	}


