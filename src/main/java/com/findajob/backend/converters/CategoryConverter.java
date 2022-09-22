package com.findajob.backend.converters;

import com.findajob.backend.data.CategoryData;
import com.findajob.backend.entities.Category;

public class CategoryConverter extends Converter<Category,CategoryData>{

    @Override
    public Category toEntity(CategoryData object) {
        return Category.builder()
            .id(object.getId())
            .name(object.getName())
            .description(object.getDescription())
            .build();
    }

    @Override
    public CategoryData toData(Category object) {
        return CategoryData.builder()
            .id(object.getId())
            .name(object.getName())
            .description(object.getDescription())
            .build();
    }
    
}
