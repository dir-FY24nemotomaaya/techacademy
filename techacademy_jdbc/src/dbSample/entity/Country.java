package dbSample.entity;

public class Country {
    // フィールドの定義
    private String name;
    private int population;

    // 引数なしコンストラクタ
    public Country() {

    }

    // 引数ありコンストラクタ
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //this.~はメソッドの呼出し。自オブジェクトのnameメソッドを呼出し？
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
