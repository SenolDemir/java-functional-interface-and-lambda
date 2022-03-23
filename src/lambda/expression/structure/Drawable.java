package lambda.expression.structure;

@FunctionalInterface  //It is optional
public interface Drawable {

    /*
    Lamda bilinmeden önce bilinmesi gereken;

	Anonymous Inner Class:
	It is useful when we want to just have the implementation of abstract method
	without the need for creating new class.
	(Interface ya da abstract class da var olan bir fonksiyon/metodu bir subclass oluşturmadan
	herhangi bir sınıf içinde kullanabilmenin yoludur.)
	It does not have a name.
	This class has been instantiated and assigned to interface reference and statement ended with semicolon.
     */

    public void draw();
}
