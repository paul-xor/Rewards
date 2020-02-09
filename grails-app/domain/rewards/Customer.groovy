package rewards

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        phone()
        firstName(nullable: true)
        lastName(nullable: true)
        email (email: true, blank: false)
        totalPoints(nullable: true, max: 10)
    }
}
