
val dogBreeds =
  List("Doberman", "Yorkshire Terrier", "Dachshund",
       "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

// For every element in the list dogBreeds, create a
// temporary variable called breed with the value of that element,
// then print it.

// <- is a generator
for (breed <- dogBreeds)
  println(breed)
