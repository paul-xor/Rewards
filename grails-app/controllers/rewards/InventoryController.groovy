package rewards

class InventoryController {

    def index() {
        render "Here is a list of inventory items."
    }

    def edit() {
        def productName = "Breakfast Blend"
        def sku = "BB01"
        [product:productName, sku:sku]
    }

    def remove() {
        render "You have one less then before."
    }

    def list(){
        def allProducts = Product.list()
        [allProducts:allProducts]
    }
}
