public class TestProgram3 {
public static void main( String[] args ) {
// - try this code with both booleans set to false,
// then set to true/ false and false/true
// and finally both set to false
boolean isRaining = true;
boolean isWindy = true;
if ( isRaining )
if ( isWindy )
System.out.println( "It's both raining and windy - time to stay indoors?" );
else
System.out.println( "It's neither windy or rainy - time for a game of frisbee?" );
}
}