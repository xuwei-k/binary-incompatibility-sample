package com.example

abstract class Foldable[F[_]]{
  def foldLeft[A, B](fa: F[A], z: B)(f: (B, A) => B): B
  def toList[A](fa: F[A]): List[A] =
    foldLeft(fa, List.empty[A])((xs, x) => x :: xs).reverse
}
