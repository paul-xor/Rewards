package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new Product(name: "Dark Roast", sku: "DK01", price: 12.95).save()
        new Product(name: "Morning Star", sku: "MS01", price: 16.5).save()
    }
    def destroy = {
    }
}
