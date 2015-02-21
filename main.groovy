/* Loves me, Loves me not in Groovy 1.8.9*/ 

Chance_At_Love loveme = new Chance_At_Love()
loveme.pick_a_daisy()

class Chance_At_Love{
    int petals
    def confused_in_love = true 
    
    def pick_a_daisy(){
        
        if(confused_in_love){
            
            Random petal_count = new Random() 
            petals = petal_count.nextInt(10) 
            
            take_a_petal()
        }
    }
    
    def take_a_petal(){
        for(petals; petals != 0; --petals){
            
            println("(pluck..) Loves me! ")
            
            println("(pluck..) Loves me not.. ")

        }
        confused_in_love = false
    }
}
