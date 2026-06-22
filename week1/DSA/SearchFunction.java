package DSA;
class Product{
    int id;
    String productName;
    String type;
    Product(int id, String productName, String type){
        this.id=id;
        this.productName=productName;
        this.type=type;
    }
}
public class SearchFunction {
    public static Product linearSearch(Product [] products, String target){
        for(Product p:products){
            if(p.productName.equalsIgnoreCase(target)){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target){
        int l=0;
        int r=products.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int cmp=products[mid].productName.compareToIgnoreCase(target);
            if(cmp==0) return products[mid];
            else if(cmp<0) l=mid+1;
            else r=mid-1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
        new Product(1, "Laptop", "Electronics"),
        new Product(2, "Mouse", "Accessories"),
        new Product(3, "Keyboard", "Accessories")
    };
    Product result = linearSearch(products, "Mouse");
    if(result != null)
        System.out.println("Found: " + result.productName);
    else
        System.out.println("Not Found");
    }
}
