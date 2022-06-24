import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComapreList {
	public static void main(String[] args) {

		AnimalDomain[] animals = {new AnimalDomain("猫", "000"), new AnimalDomain("秋刀魚", "100"), new AnimalDomain("蝶々", "200")};
		CategoryDomain[] categories = {new CategoryDomain("000", "哺乳類"), new CategoryDomain("100", "魚類"), new CategoryDomain("200", "昆虫類")};

		List<AnimalDomain> animalDomainList = new ArrayList<>(Arrays.asList(animals));
		List<CategoryDomain> categoryDomainList = new ArrayList<>(Arrays.asList(categories));

		Map<String, String> categoryDomainMap = new HashMap<String, String>();
		categoryDomainList.forEach(domain -> {categoryDomainMap.put(domain.getCategoryCode(), domain.getCategoryName());});

		animalDomainList.forEach(domain -> {

			String categoryName = "分類不可";
			if (categoryDomainMap.containsKey(domain.getCategoryCode())) categoryName = categoryDomainMap.get(domain.getCategoryCode());
			System.out.println(domain.getAnimalName() + " : " + categoryName);
		});
	}

	private static class AnimalDomain {

		private String animalName;

		private String categoryCode;

		public AnimalDomain(String animalName, String categoryCode) {
			this.animalName = animalName;
			this.categoryCode = categoryCode;
		}

		/**
		 * @return animalName
		 */
		public String getAnimalName() {
			return animalName;
		}

		/**
		 * @param animalName セットする animalName
		 */
		public void setAnimalName(String animalName) {
			this.animalName = animalName;
		}

		/**
		 * @return categoryCode
		 */
		public String getCategoryCode() {
			return categoryCode;
		}

		/**
		 * @param categoryCode セットする categoryCode
		 */
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}


	}

	private static class CategoryDomain {

		private String categoryCode;

		private String categoryName;



		public CategoryDomain(String categoryCode, String categoryName) {
			this.categoryCode = categoryCode;
			this.categoryName = categoryName;
		}

		/**
		 * @return categoryCode
		 */
		public String getCategoryCode() {
			return categoryCode;
		}

		/**
		 * @param categoryCode セットする categoryCode
		 */
		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}

		/**
		 * @return categoryName
		 */
		public String getCategoryName() {
			return categoryName;
		}

		/**
		 * @param categoryName セットする categoryName
		 */
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}


	}
}
